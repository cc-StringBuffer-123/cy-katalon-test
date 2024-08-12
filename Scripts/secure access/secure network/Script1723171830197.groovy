import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import model.InitialTeamInfo
import model.SecureAccess as SecureAccess

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

InitialTeamInfo.createTeam(uniquValue)

SecureAccess.createResource(uniquValue)

SecureAccess.createConnector(uniquValue)

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/div_Secure Network'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/span_Add Secure Network'))

WebUI.setText(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/input_Name_secure-name'), 'sen-001')

WebUI.setText(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/textarea_Description_secure-desc'), 'desc-001')

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/span_Add Resource'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/td_External Link'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/span_Add Connector_1'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/span_con-001_el-checkbox__inner'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/span_confirm (1)'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/div_Prefer direct connection with Connector only'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/div_Enforce direct connection with Connector only'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/button_Add Secure Network'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/span_Add Secure Network'))

WebUI.setText(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/input_Name_secure-name'), 'sen-002')

WebUI.setText(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/textarea_Description_secure-desc'), 'desc-002')

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/span_Add Connector_1'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/span_con-001_el-checkbox__inner'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/span_confirm (1)'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/div_Prefer direct connection with Connector only'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/div_Enforce direct connection with Connector only'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/button_Add Secure Network'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/img_offline_operator'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/li_Edit_1'))

WebUI.setText(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/input_Name_secure-name'), 'sen-002-updated')

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/svg_offline_delete-connector'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/button_Continue'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/span_Edit Secure Network'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/button_Confirm'))

WebUI.setText(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/input__search-secure'), 'u')

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/img_offline_operator'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/li_Delete'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/button_Continue'))

WebUI.click(findTestObject('Object Repository/secure network/Page_ZTN Team-Site/button_Confirm'))

WebUI.refresh()