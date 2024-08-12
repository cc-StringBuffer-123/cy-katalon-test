package model

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class SecureAccess {

	static void createResource(String uniquValue) {

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Secure Access'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/div_Resources'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Add Resource'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/div_External LinkIncludes external URL link_059051'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Go to Configure'))

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/input_(Required)_resource-name'), 'res-1' +
				uniquValue)

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/textarea_Specification_ruleTextArea'), '10.0.0.8\n192.168.3.70-192.168.3.200\nwww.baidu.com')

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/input_Session Duration_resource-session-duration'),
				'30')

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Choose Default logo'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/div_Choose Default logo_resource-choose-logo'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_confirm'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Go to Configure'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Create New Policy'))

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/input_(Required)_policy-name-dialog'), 'res-pol-1' +
				uniquValue)

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/input_Active_policy-action-dialog'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/li_Block'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/div_Save for audit'))

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/textarea_(Optional)_policy-desc-dialog'), 'desc-1' +
				uniquValue)

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/button_Add Group'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/div_Everyone'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/button_confirm'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Add Created Policy'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Save'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/button_Confirm (1)'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Add Resource'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/div_SaasIntegrate third party online applic_b7c109'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Go to Configure'))

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/input_(Required)_resource-name'), 'res-2' +
				uniquValue)

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/textarea_Specification_ruleTextArea'), '123.3.3.3\n')

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/input_Session Duration_resource-session-duration'),
				'60')

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/div_Custom'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/svg'))

		String filePath = '"C:\\Users\\ChanYing\\Pictures\\Screenshots\\r.jpg"'

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

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Custom_cropper-face cropper-move'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Custom_cropper-face cropper-move'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Custom_cropper-face cropper-move'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Custom_cropper-face cropper-move'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Custom_cropper-face cropper-move'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/div_Resource Name(Required)Specification   _6814e1'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/div_Include this resource in Resource Porta_7737b2'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/svg'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Go to Configure'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Add from saved Policies'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/div_res-pol-001'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_confirm_1'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Save'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/button_Confirm (1)'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/img_offline_operator'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/li_Edit Resource'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/div_Local AppIncludes application resided i_54163e'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Go to Configure'))

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/input_(Required)_resource-name'), 'res-' + uniquValue + '-updated')

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/textarea_Specification_ruleTextArea'), '128.3.6.45\nwww.google.com')

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/input_Session Duration_resource-session-duration'),
				'45')

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_YES'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Go to Configure'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/img_offline_operator'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/li_Edit'))

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/input_(Required)_policy-name-dialog'), 'res-pol-' + uniquValue + '-updated')

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Add Group'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/div_TeamAdmin'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/button_confirm'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Add Created Policy'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/button_Save'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/button_Confirm (1)'))

		WebUI.setText(findTestObject('Object Repository/resource/Page_ZTN Team-Site/input__search-resource'), 'u')

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/img_offline_operator'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/li_Delete'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/button_Continue'))

		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/button_Confirm (1)'))

		WebUI.refresh()
		
		WebUI.click(findTestObject('Object Repository/resource/Page_ZTN Team-Site/span_Secure Access'))
	}

	static void createConnector(String uniquValue) {

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/span_Secure Access'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/div_Connectors'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/span_Add Connector'))

		WebUI.setText(findTestObject('Object Repository/connector/Page_ZTN Team-Site/input_Name_connector-name'), 'con-001')

		WebUI.setText(findTestObject('Object Repository/connector/Page_ZTN Team-Site/textarea_Description_connector-desc'), 'desc-001')

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/div_Add Connector'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/button_Confirm'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/span_Add Connector'))

		WebUI.setText(findTestObject('Object Repository/connector/Page_ZTN Team-Site/input_Name_connector-name'), 'con-002')

		WebUI.setText(findTestObject('Object Repository/connector/Page_ZTN Team-Site/textarea_Description_connector-desc'), 'desc-002')

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/span_Add Connector then goes to Generate Token'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/div_Docker'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/div_Ip Range or one Ip address'))

		WebUI.setText(findTestObject('Object Repository/connector/Page_ZTN Team-Site/input_Ip Range or one Ip address_connector-_50e9b3'),
				'192.168.3.70')

		WebUI.sendKeys(findTestObject('Object Repository/connector/Page_ZTN Team-Site/input_Ip Range or one Ip address_connector-_50e9b3'),
				Keys.chord(Keys.ENTER))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/button_Generate New Token'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/button_Copy Token'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/button_Token Generated and Exit'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/button_Confirm'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/html_ZTN Team-Site    .strong-gatedata-v-42_de08c3'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/img_offline_operator'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/li_Edit'))

		WebUI.setText(findTestObject('Object Repository/connector/Page_ZTN Team-Site/input_Name_connector-name'), 'con-001-updated')

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/div_Windows'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/div_Mac address'))

		WebUI.setText(findTestObject('Object Repository/connector/Page_ZTN Team-Site/input_Mac address_connector-mac-value'), '00-00-00-00-00-00-00-00')

		WebUI.sendKeys(findTestObject('Object Repository/connector/Page_ZTN Team-Site/input_Mac address_connector-mac-value'), Keys.chord(
				Keys.ENTER))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/span_Generate New Token'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/span_Copy Token'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/span_Token Generated and Exit'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/button_Confirm'))

		WebUI.setText(findTestObject('Object Repository/connector/Page_ZTN Team-Site/input__search-connector'), 'u')

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/img_offline_operator'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/li_Delete'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/button_Continue'))

		WebUI.click(findTestObject('Object Repository/connector/Page_ZTN Team-Site/button_Confirm'))

		WebUI.refresh()
	}
}

