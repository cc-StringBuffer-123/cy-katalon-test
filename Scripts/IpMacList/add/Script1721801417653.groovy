import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.json.JsonOutput
import model.PredefinedListUploadEnum
import model.WebData

//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://127.0.0.1:18080/')

WebUI.openBrowser('https://127.0.0.1:18080/')

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

WebUI.setText(findTestObject('IpMacList/Page_StrongGate/input__t'), 'test333')

WebUI.click(findTestObject('IpMacList/Page_StrongGate/button_'))

WebUI.click(findTestObject('IpMacList/Page_StrongGate/div_StrongGate'))

WebUI.click(findTestObject('IpMacList/Page_StrongGate/div_ID'))

WebUI.click(findTestObject('IpMacList/Page_StrongGate/div_ID'))

WebUI.setText(findTestObject('IpMacList/Page_StrongGate/input_ID_email'), 'test@test.com')

WebUI.setEncryptedText(findTestObject('IpMacList/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.sendKeys(findTestObject('IpMacList/Page_StrongGate/input__password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/div_Team'))

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/span_Network Access'))

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/li_IP Mac List'))

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/button_Add Location IPMAC List'))

WebUI.setText(findTestObject('IpMacList/Page_ZTN Team-Site/input_Name of Location IPMac List_listName'), 'im-' + uniquValue)

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/span_Upload'))

String filePath = '"C:\\Users\\ChanYing\\pre-c.csv"'

StringSelection selection = new StringSelection(filePath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null)

Robot robot = new Robot()

robot.delay(2002)

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(3)

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/button_Append'))

WebUI.setText(findTestObject('IpMacList/Page_ZTN Team-Site/input_Comments_ipAddress'), '127.0.0.1')

WebUI.setText(findTestObject('IpMacList/Page_ZTN Team-Site/input_Comments_macAddress'), '00-00-00-00-00-00')

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/div_Select'))

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/div_Device exist in  016, Uplink is  , uGate'))

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/td_Select'))

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/div_select_login'))

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/div_Everyone'))

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/button_confirm'))

WebUI.setText(findTestObject('IpMacList/Page_ZTN Team-Site/textarea_Select_comments'), '01')

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/path'))

//WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/input_List Administrator can edit this list_input'))
//
//WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/div_test999test.com'))
//
//WebUI.setText(findTestObject('IpMacList/Page_ZTN Team-Site/input_List Administrator can edit this list_input'), Keys.chord(
//        Keys.ENTER))
//
//WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/input_List Administrator can edit this list_input'))
//
//WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/div_testtest.com'))
//
//WebUI.setText(findTestObject('IpMacList/Page_ZTN Team-Site/input_List Administrator can edit this list_input'), 'test@test.com')
//
//WebUI.sendKeys(findTestObject('IpMacList/Page_ZTN Team-Site/input_List Administrator can edit this list_input'), Keys.chord(
//        Keys.ENTER))

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/img_List owner adddel List administrator. O_8b3ded'))

WebUI.setText(findTestObject('IpMacList/Page_ZTN Team-Site/input_List owner adddel List administrator._557ec0'), 'test120@test.com')

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/span_Save IPMac List'))

// get web values
String listName = WebUI.getAttribute(findTestObject('IpMacList/Page_ZTN Team-Site/input_Name of Location IPMac List_listName'), 
    'value')

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> spans = driver.findElements(By.cssSelector('span.u-radio'))

String selectedRadioValue = ''

for (WebElement span : spans) {
    if (span.getAttribute('class').contains('u-radio-checked')) {
        WebElement label = span.findElement(By.xpath('following-sibling::span[@class=\'u-label\']'))

        selectedRadioValue = label.getText()

        break
    }
}

WebData wt = new WebData()

List<WebElement> tableRows = wt.getHtmlTableRows(findTestObject('IpMacList/Page_ZTN Team-Site/list-table'))

//WebElement table = WebUI.findWebElement(findTestObject('IpMacList/Page_ZTN Team-Site/list-table'))

//List<WebElement> tableRows = table.findElements(By.tagName('tr'))

List<WebElement> tableData = []

tableRows.each{ row ->
        List<WebElement> cells = row.findElements(By.tagName('td'))

        if (cells.size() >= 5) {
            Map<String, String> rowData = [:]

            (rowData['iPAddress']) = (cells[0]).getText()

            (rowData['macAddress']) = (cells[1]).getText()

            (rowData['locationUid']) = (cells[2]).getText()

            (rowData['loginId']) = (cells[3]).getText()

            (rowData['comments']) = (cells[4]).getText()

            tableData.add(rowData)
        }
    }

WebElement divElement = driver.findElement(By.cssSelector('div.tagDiv'))

List<WebElement> spanElements = divElement.findElements(By.tagName('span'))

List<WebElement> spanTexts = new ArrayList<String>()

for (WebElement span : spanElements) {
    spanTexts.add(span.getText().trim())
}

String listOwner = WebUI.getAttribute(findTestObject('IpMacList/Page_ZTN Team-Site/input_List owner adddel List administrator._557ec0'), 
    'value')

Map<String, String> formData = [('listName') : listName, ('uploadType') : PredefinedListUploadEnum.fromLabel(selectedRadioValue).value
    , ('tableData') : tableData, ('listAdmin') : spanTexts, ('listOwner') : listOwner]

String jsonOutput = JsonOutput.toJson(formData)

println(jsonOutput)

WebUI.click(findTestObject('IpMacList/Page_ZTN Team-Site/button_continue'))
