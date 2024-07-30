import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.sql.Connection as Connection
import java.sql.DriverManager as DriverManager
import java.sql.PreparedStatement as PreparedStatement
import java.sql.ResultSet as ResultSet
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// Global variable(profiles)
String url = GlobalVariable.Mysql_Url

String usr = GlobalVariable.Mysql_User

String pwd = GlobalVariable.Mysql_Pwd

Class.forName('com.mysql.cj.jdbc.Driver')

Connection connection = DriverManager.getConnection(url, usr, pwd)

PreparedStatement preparedStatement = null

ResultSet resultSet = null

try {
    // Randomly generate six characters based on the timestamp
    String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

    String testData = 'test' + uniquValue

    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://127.0.0.1:18080/')

    WebUI.click(findTestObject('Object Repository/Web Browser/ts-01/a_StrongGate'))

    WebUI.click(findTestObject('Object Repository/Web Browser/ts-01/div_StrongGate'))

    WebUI.click(findTestObject('Object Repository/Web Browser/ts-01/a_'))

    WebUI.setText(findTestObject('Object Repository/Web Browser/ts-01/input__name'), 'test')

    WebUI.setText(findTestObject('Object Repository/Web Browser/ts-01/input_ID_loginName'), testData + '@test.com')

    WebUI.sendKeys(findTestObject('Object Repository/Web Browser/ts-01/input_ID_loginName'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Web Browser/ts-01/input__passcode'), '123456')

    WebUI.setEncryptedText(findTestObject('Object Repository/Web Browser/ts-01/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

    WebUI.setEncryptedText(findTestObject('Object Repository/Web Browser/ts-01/input__confirmPassword'), 'EedPXzAtoLmlvts/d2a2YQ==')

    WebUI.sendKeys(findTestObject('Object Repository/Web Browser/ts-01/input__confirmPassword'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/Web Browser/ts-01/button__1'))

    WebUI.setText(findTestObject('Object Repository/Web Browser/ts-01/input__teamName'), 'test')

    WebUI.selectOptionByValue(findTestObject('Object Repository/Web Browser/ts-01/select_20                     20-200       _e10512'), 
        '1', true)

    WebUI.click(findTestObject('Object Repository/Web Browser/ts-01/div__1_2'))

    WebUI.click(findTestObject('Object Repository/Web Browser/ts-01/div__1_2'))

    WebUI.setText(findTestObject('Object Repository/Web Browser/ts-01/input__teamDomain'), testData)

    WebUI.click(findTestObject('Object Repository/Web Browser/ts-01/button__1_2'))

    WebUI.click(findTestObject('Object Repository/Web Browser/ts-01/div_Team'))

    // find team info by team domain
    String findByTeam = 'SELECT team_uid, team_name, team_domain FROM tbl_team_info WHERE team_domain = ?'

    preparedStatement = connection.prepareStatement(findByTeam)

    preparedStatement.setString(1, testData)

    resultSet = preparedStatement.executeQuery()

    if (!(resultSet.next())) {
        throw new Exception('No data found for team domain: ' + testData)
    }

    String teamUid = resultSet.getString('team_uid')

    String teamName = resultSet.getString('team_name')

    String teamDomain = resultSet.getString('team_domain')

    KeywordUtil.logInfo('Team UID: ' + teamUid)

    KeywordUtil.logInfo('Team Name: ' + teamName)

    KeywordUtil.logInfo('Team Domain: ' + teamDomain)

    KeywordUtil.logInfo('test me: ' + System.getProperty("testme"))

    // query team groups by team uid
    String queryByGroup = 'SELECT group_id, team_uid, group_name, group_category FROM tbl_team_group WHERE team_uid = ?'

    preparedStatement = connection.prepareStatement(queryByGroup)

    preparedStatement.setString(1, teamUid)

    resultSet = preparedStatement.executeQuery()

    if (!(resultSet.next())) {
        throw new Exception('No data found for team uid: ' + teamUid)
    }
    
    while (resultSet.next()) {
        String groupId = resultSet.getString('group_id')

        String groupName = resultSet.getString('group_name')

        String groupCategory = resultSet.getString('group_category')

        KeywordUtil.logInfo((((('group id: ' + groupId) + ', group name: ') + groupName) + ', group category: ') + groupCategory)
    }
    
    WebUI.click(findTestObject('Object Repository/Web Browser/ts-01/li_Groups'))
}
finally { 
    try {
        if (resultSet != null) {
            resultSet.close()
        }
        
        if (preparedStatement != null) {
            preparedStatement.close()
        }
        
        if (connection != null) {
            connection.close()
        }
    }
    catch (Exception e) {
        e.printStackTrace()
    } 
}