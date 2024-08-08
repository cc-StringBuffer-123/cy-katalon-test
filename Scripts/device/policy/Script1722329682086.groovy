import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import model.TeamInfo
import service.VerifyData
import service.VerifyDeviceReqPolicy


WebUI.openBrowser('')

WebUI.navigateToUrl('https://127.0.0.1:18080/')

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/a_StrongGate'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/button_StrongGate'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/a_'))

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input__name'), 'test' + uniquValue)

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input_ID_email'), uniquValue + '@test.com')

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/button_'))

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input__passcode'), '123456')

WebUI.setEncryptedText(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input__confirmPassword'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/button__1'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/button__1_2'))

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input__teamName'), 'teamname' + uniquValue)

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input__teamName'))

WebUI.selectOptionByValue(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/select_20                     20-200       _e10512'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input__t'), 'teamdomain' + uniquValue)

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/button__1_2_3'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_Team'))

TeamInfo info = VerifyData.getTeamInfo('teamdomain' + uniquValue)

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_Device Req Policy'))

VerifyDeviceReqPolicy.verifyList(info.getTeamUID())

String script = """
    var table = document.querySelector('.el-table');
    
    var rows = table.querySelectorAll('tr.el-table__row');

    var tableData = [];

    rows.forEach(function(row) {
        var rowData = {}

        var cells = row.querySelectorAll('td');

        rowData.seq = cells[0].innerText.trim();
        rowData.policyName = cells[1].innerText.trim();
		rowData.groups = cells[2].innerText.trim();
		rowData.ruleset = cells[3].innerText.trim();
		rowData.action = cells[4].innerText.trim();
		rowData.approval = cells[5].innerText.trim();
		rowData.enabled = cells[6].innerText.trim();

        tableData.push(rowData);
    });

    return tableData;
"""

Object tableData = WebUI.executeJavaScript(script, null)

println("Table Data: " + tableData)

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

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/input__search-policy'), 'pol-')