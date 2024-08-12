package model

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class InitialTeamInfo {

	static void createTeam(String uniquValue) {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://127.0.0.1:18080/')

		WebUI.click(findTestObject('Object Repository/team/Page_StrongGate/a_StrongGate'))

		WebUI.navigateToUrl('https://127.0.0.1:18080/signup')

		WebUI.click(findTestObject('Object Repository/team/Page_StrongGate/div_StrongGate'))

		WebUI.click(findTestObject('Object Repository/team/Page_StrongGate/a_'))

		WebUI.setText(findTestObject('Object Repository/team/Page_StrongGate/input__name'), 'test' + uniquValue)

		WebUI.setText(findTestObject('Object Repository/team/Page_StrongGate/input_ID_loginName'), uniquValue + '@test.com')

		WebUI.click(findTestObject('Object Repository/team/Page_StrongGate/button_'))

		WebUI.setText(findTestObject('Object Repository/team/Page_StrongGate/input__passcode'), '123456')

		WebUI.setEncryptedText(findTestObject('Object Repository/team/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

		WebUI.setEncryptedText(findTestObject('Object Repository/team/Page_StrongGate/input__confirmPassword'), 'EedPXzAtoLmlvts/d2a2YQ==')

		WebUI.click(findTestObject('Object Repository/team/Page_StrongGate/button__1'))

		WebUI.click(findTestObject('Object Repository/team/Page_StrongGate/button__1_2'))

		WebUI.setText(findTestObject('Object Repository/team/Page_StrongGate/input__teamName'), 'teamname' + uniquValue)

		WebUI.click(findTestObject('Object Repository/team/Page_StrongGate/input__teamName'))

		WebUI.selectOptionByValue(findTestObject('Object Repository/team/Page_StrongGate/select_20                     20-200       _e10512'),
				'3', true)

		WebUI.setText(findTestObject('Object Repository/team/Page_StrongGate/input__teamDomain'), 'teamdomain' + uniquValue)

		WebUI.click(findTestObject('Object Repository/team/Page_StrongGate/div_'))
	}
}
