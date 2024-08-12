import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import model.InitialTeamInfo
import model.TeamInfo
import model.WebData
import service.VerifyData
import service.VerifyDeviceReqPolicy

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

InitialTeamInfo.createTeam(uniquValue)

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_Team'))

TeamInfo info = VerifyData.getTeamInfo('teamdomain' + uniquValue)

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_Device Req Policy'))

VerifyDeviceReqPolicy.verifyList(info.getTeamUID())

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Add Policy'))

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/input_Policy Name_policyName'), 'pol-1' + 
    uniquValue)

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Block'))

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/textarea_Description(optional)_policyDesc'), 
    'pol1-test-desc')

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_By the matched group administrators in _3af9ef'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_By these members'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Add Group'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_Guest'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_Everyone'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Add Device Requirements Policy'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Add Policy'))

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/input_Policy Name_policyName'), 'pol-2' + 
    uniquValue)

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/textarea_Description(optional)_policyDesc'), 
    'pol2-test-desc')

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_By the matched group administrators in _3af9ef'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_By these members'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Add Group'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_Guest'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_Everyone'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Add Device Requirements Policy'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/img_YES_operator'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/li_Edit'))

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/input_Policy Name_policyName'), 'pol-dbe755-update')

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Allow'))

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/textarea_Description(optional)_policyDesc'), 
    'pol-test-desc-update')

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_By these members'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/svg_YES_groupDelete'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Add Group'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_Team Admin'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Edit Device Requirements Policy'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/button_Confirm'))

WebData wt = new WebData()

List<WebElement> tableRows = wt.getHtmlTableRows(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/table'))

List<WebElement> tableData = []

tableRows.each({ def row ->
		List<WebElement> cells = row.findElements(By.tagName('td'))

		if (cells.size() >= 7) {
			Map<String, String> rowData = [:]

			(rowData['seq']) = (cells[0]).getText()

			(rowData['policyName']) = (cells[1]).getText()

			(rowData['groups']) = (cells[2]).getText()

			(rowData['ruleset']) = (cells[3]).getText()

			(rowData['action']) = (cells[4]).getText()

			(rowData['approval']) = (cells[5]).getText()

			(rowData['enabled']) = (cells[6]).getText()

			tableData.add(rowData)
		}
	})

println tableData

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/input__search-policy'), 'pol-')