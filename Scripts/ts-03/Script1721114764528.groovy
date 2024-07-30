import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import script.HttpClient as HttpClient
import script.HttpMethod as HttpMethod

WebUI.openBrowser('')

WebUI.navigateToUrl('https://127.0.0.1:18080/')

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-03/Page_StrongGate/input__t'), 'test20114c')

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_StrongGate/div_'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_StrongGate/div_StrongGate'))

HttpClient.baseHttpReq('/testcase/test', Map.of('teamUid', '123456', 'category', '123'), HttpMethod.GET)

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-03/Page_StrongGate/input_ID_email'), 'test20114c@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Web Browser/ts-03/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.sendKeys(findTestObject('Object Repository/Web Browser/ts-03/Page_StrongGate/input__password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/div_Team'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/li_Groups'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/span_Add Group'))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/input_Group Name_groupName'), 'grp-004')

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/textarea_Description_groupDesc'), 'desc-004')

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/button_Security Settings'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/input_ParentBound_groupParentBound'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/li_Everyone'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/span_Add Group_1'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/td_na'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/button_confirm'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/span_Add New Group'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-03/Page_ZTN Team-Site/button_Confirm (1)'))
