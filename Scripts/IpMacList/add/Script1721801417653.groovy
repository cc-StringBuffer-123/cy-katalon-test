import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://127.0.0.1:18080/')

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

WebUI.setText(findTestObject('Object Repository/IpMacList/Page_StrongGate/input__t'), 'test333')

WebUI.click(findTestObject('Object Repository/IpMacList/Page_StrongGate/button_'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_StrongGate/div_StrongGate'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_StrongGate/div_ID'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_StrongGate/div_ID'))

WebUI.setText(findTestObject('Object Repository/IpMacList/Page_StrongGate/input_ID_email'), 'test@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/IpMacList/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.sendKeys(findTestObject('Object Repository/IpMacList/Page_StrongGate/input__password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/div_Team'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/span_Network Access'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/li_IP Mac List'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/button_Add Location IPMAC List'))

WebUI.setText(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/input_Name of Location IPMac List_listName'), 
    'im-' + uniquValue)

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/span_Upload'))

// 如果有文本框，就可使用upload file或send keys进行文件上传
//WebUI.sendKeys(findTestObject(object), file)
//WebUI.uploadFile(findTestObject('object'), file)
// 模拟键盘上传
String filePath = '"C:\\Users\\ChanYing\\pre-c.csv"'

def selection = new StringSelection(filePath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null)

def robot = new Robot()

robot.delay(2002)

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/button_Append'))

WebUI.setText(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/input_Comments_ipAddress'), '127.0.0.1')

WebUI.setText(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/input_Comments_macAddress'), '00-00-00-00-00-00')

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/div_Select'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/div_Device exist in  016, Uplink is  , uGate'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/td_Select'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/div_select_login'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/div_Everyone'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/button_confirm'))

WebUI.setText(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/textarea_Select_comments'), '01')

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/path'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/input_List Administrator can edit this list_input'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/div_test999test.com'))

WebUI.setText(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/input_List Administrator can edit this list_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/input_List Administrator can edit this list_input'))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/div_testtest.com'))

WebUI.setText(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/input_List Administrator can edit this list_input'), 
    'test@test.com')

WebUI.sendKeys(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/input_List Administrator can edit this list_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/img_List owner adddel List administrator. O_8b3ded'))

WebUI.setText(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/input_List owner adddel List administrator._557ec0'), 
    'test120@test.com')

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/span_Save IPMac List'))

//String listName = WebUI.getAttribute(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/input_Name of Location IPMac List_listName'), 
//    'value')
//
//println('list name :' + listName)
//
//def rows = WebUI.findWebElements(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/list-table'), 30)
//
//for (int i = 0; i < rows.size(); i++) {
//    def cells = rows.get(i).findElements(By.tagName('td'))
//
//    for (int j = 0; j < cells.size(); j++) {
//        String cellText = cells.get(j).getText()
//
//        println((((('Row ' + (i + 1)) + ' Column ') + (j + 1)) + ': ') + cellText)
//    }
//}

WebUI.click(findTestObject('Object Repository/IpMacList/Page_ZTN Team-Site/button_continue'))