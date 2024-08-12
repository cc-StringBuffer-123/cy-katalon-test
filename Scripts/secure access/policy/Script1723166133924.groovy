import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import model.InitialTeamInfo

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

InitialTeamInfo.createTeam(uniquValue)

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div_Secure Access'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div_Saved Policy'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/button_Add Policy'))

WebUI.setText(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/input_Policy Name_policy-name'), 'pol-1' + 
    uniquValue)

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div_Save for audit'))

WebUI.setText(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/textarea_Policy Description_policy-desc'), 
    'desc-001')

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_Add Group'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div_Everyone'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div_Team Admin'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_Add Policy'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/button_Add Policy'))

WebUI.setText(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/input_Policy Name_policy-name'), 'pol-2' + 
    uniquValue)

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/input_Action_policy-action'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_Block'))

WebUI.setText(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/textarea_Policy Description_policy-desc'), 
    'desc-002')

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_Add Group'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div_Guest'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_Add Policy'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/button_Add Policy'))

WebUI.setText(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/input_Policy Name_policy-name'), 'pol-3' + 
    uniquValue)

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/input_Action_policy-action'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_Passthrough'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div_Save for audit'))

WebUI.setText(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/textarea_Policy Description_policy-desc'), 
    'desc-003')

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_Add Group'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div_Everyone'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/td_Team Admin'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/td_Team Admin'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div_Team Admin'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div_Guest'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_Add Policy'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/img_YES_operator'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/li_Edit'))

WebUI.setText(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/input_Policy Name_policy-name'), ('pol-2' + 
    uniquValue) + '-updated')

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div_Save for audit'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_Add Group'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div_Everyone'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/button_confirm (1)'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/span_Edit Policy'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/button_Confirm'))

WebUI.setText(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/input__search-policy'), 'u')

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/operator'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/li_Delete'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/button_Continue'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/div__search-enable'))

WebUI.setText(findTestObject('Object Repository/resource-policy/Page_ZTN Team-Site/input__search-policy'), '')

WebUI.refresh()