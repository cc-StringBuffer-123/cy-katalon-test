import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

String testData = 'test' + uniquValue

WebUI.navigateToUrl('https://127.0.0.1:18080/')

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/a_StrongGate'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/div_StrongGate'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/a_'))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__name'), 'test')

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/div_ID'))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input_ID_loginName'), testData + 
    '@test.com')

WebUI.sendKeys(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input_ID_loginName'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__passcode'), '123456')

WebUI.setEncryptedText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__confirmPassword'), 
    'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.sendKeys(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__confirmPassword'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/button_'))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__teamName'), 'team')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/select_20                     20-200       _e10512'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/select_20                     20-200       _e10512'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__teamDomain'), testData)

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/button__1'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/div_Network Access'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/li_IP Mac List'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/span_Add Location IPMAC List'))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/input_Name of Location IPMac List_listName'), 
    testData + '-im-001')

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/span_Append'))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/input_Comments_ipAddress'), '127.0.0.1')

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/input_Comments_macAddress'), 
    '00-00-00-00-00-00')

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/button_Select'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/td_Device exist in  , Uplink is  , uGate_el_07a177'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/button_Select_1'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/td_Everyone, System, Team Admin'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/button_confirm'))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/textarea_Select_comments'), '01')

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/path'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/span_Append'))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/input_Comments_ipAddress'), '192.168.3.70')

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/input_Comments_macAddress'), 
    '11-11-11-11-11-11')

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/button_Select'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/button_confirm_1'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/td_Select'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/button_Select_1'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/button_confirm'))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/textarea_Select_comments'), '02')

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/path'))

//WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/button_Save IPMac List'))
//
//String listName = WebUI.getAttribute(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/input_Name of Location IPMac List_listName'), 
//    'value')
//
//println('list name :' + listName)
//
//List<WebElement> rows = WebUI.findWebElements(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/list-table'), 
//    30)
//
//for (int i = 0; i < rows.size(); i++) {
//    List<WebElement> cells = rows.get(i).findElements(By.tagName('td'))
//
//    for (int j = 0; j < cells.size(); j++) {
//        String cellText = cells.get(j).getText()
//
//        KeywordUtil.markWarning((((('Row ' + (i + 1)) + ' Column ') + (j + 1)) + ': ') + cellText)
//    }
//}
//
//WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/button_Continue'))