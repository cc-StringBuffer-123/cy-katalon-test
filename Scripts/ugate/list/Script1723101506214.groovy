import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import model.InitialTeamInfo

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

InitialTeamInfo.createTeam(uniquValue)

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/span_Network Access'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/li_uGate'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/span_Add uGate'))

WebUI.setText(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/input_uGate Server Name_ugateName'), 'u-1' + uniquValue)

WebUI.setText(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/textarea_Description_ugateDesc'), 'u-desc1' + uniquValue)

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/span_Save uGate Server'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/span_Add uGate'))

WebUI.setText(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/input_uGate Server Name_ugateName'), 'u-2' + uniquValue)

WebUI.setText(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/textarea_Description_ugateDesc'), 'u-desc2' + uniquValue)

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/span_Save uGate Server then goes to Generate Token'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/div_Mac'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/div_Filtering Server'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/div_Location Token Server'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/div_Ip Range or one Ip address'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/label_Mac address'))

WebUI.setText(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/input_Ip Range or one Ip address_ugate-ip-values'), 
    '192.168.3.70')

WebUI.sendKeys(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/input_Ip Range or one Ip address_ugate-ip-values'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/input_Mac address_ugate-mac-values'), '00-00-00-00-00-00-00-00')

WebUI.sendKeys(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/input_Mac address_ugate-mac-values'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/span_Generate New Token'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/span_Copy Token'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/span_Token Generated and Exit'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/html_ZTN Team-Site    .strong-gatedata-v-42_de08c3'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/img_offline_operator'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/li_Edit'))

WebUI.setText(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/input_uGate Server Name_ugateName'), ('u-1' + uniquValue) + 
    '-updated')

WebUI.setText(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/textarea_Description_ugateDesc'), ('u-desc1' + 
    uniquValue) + '-updated')

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/div_Windows'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/div_Filtering Server'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/div_Ip Range or one Ip address'))

WebUI.setText(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/input_Ip Range or one Ip address_ugate-ip-values'), 
    '192.168.3.70')

WebUI.sendKeys(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/input_Ip Range or one Ip address_ugate-ip-values'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/span_Generate New Token'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/span_Copy Token'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/span_edit'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/button_Confirm'))

WebUI.setText(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/input__search-ugate'), 'u-1')

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/img_offline_operator'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/li_Delete'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/button_Continue'))

WebUI.click(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/button_Confirm'))

WebUI.setText(findTestObject('Object Repository/ugate/Page_ZTN Team-Site/input__search-ugate'), '')

