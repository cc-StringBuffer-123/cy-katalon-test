import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import model.InitialTeamInfo as InitialTeamInfo

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

InitialTeamInfo.createTeam(uniquValue)

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/div_GEO Proxy'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/div_GEO Proxy Policy'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/button_Add GEO Proxy Policy'))

WebUI.setText(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/input_Policy Name_policy-name'), 'pol-001')

WebUI.setText(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/textarea_(optional)_policy-desc'), 'desc-001')

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/span_Add Group'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/div_Everyone'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/div_Guest'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/div_Geo-Proxy Server Preference is_policy-r_936737'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/div_Add_policy-remove-target'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/div_Geo-Proxy Server Preference is_policy-r_369fbe'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/button_Add Policy'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/span_Add GEO Proxy Policy'))

WebUI.setText(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/input_Policy Name_policy-name'), 'pol-002')

WebUI.setText(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/textarea_(optional)_policy-desc'), 'desc-002')

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/span_Add Group'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/div_Team Admin'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/div_Geo-Proxy Server Preference is_policy-r_936737'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/div_Add_policy-remove-target'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/div_Geo-Proxy Server Preference is_policy-r_369fbe'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/span_Add Policy'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/img_YES_operator'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/li_Edit'))

WebUI.setText(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/input_Policy Name_policy-name'), 'pol-001-updated')

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/span_Add Group'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/div_Team Admin'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/span_Edit Policy'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/button_Confirm'))

WebUI.setText(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/input__search-policy'), 'u')

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/img_YES_operator'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/li_Delete'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/button_Continue'))

WebUI.click(findTestObject('Object Repository/geo proxy policy/Page_ZTN Team-Site/button_Continue'))

WebUI.refresh()