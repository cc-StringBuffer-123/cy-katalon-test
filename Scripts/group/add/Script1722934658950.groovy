import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

WebUI.openBrowser('https://127.0.0.1:18080/')

WebUI.click(findTestObject('Object Repository/group/Page_StrongGate/a_StrongGate'))

WebUI.click(findTestObject('Object Repository/group/Page_StrongGate/div_StrongGate'))

WebUI.click(findTestObject('Object Repository/group/Page_StrongGate/a_'))

WebUI.setText(findTestObject('Object Repository/group/Page_StrongGate/input__name'), 'test' + uniquValue)

WebUI.setText(findTestObject('Object Repository/group/Page_StrongGate/input_ID_loginName'), uniquValue + '@test.com')

WebUI.click(findTestObject('Object Repository/group/Page_StrongGate/button_'))

WebUI.setText(findTestObject('Object Repository/group/Page_StrongGate/input__passcode'), '123456')

WebUI.setEncryptedText(findTestObject('Object Repository/group/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/group/Page_StrongGate/input__confirmPassword'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.click(findTestObject('Object Repository/group/Page_StrongGate/button__1'))

WebUI.click(findTestObject('Object Repository/group/Page_StrongGate/button__1_2'))

WebUI.setText(findTestObject('Object Repository/group/Page_StrongGate/input__teamName'), 'teamname' + uniquValue)

WebUI.click(findTestObject('Object Repository/group/Page_StrongGate/input__teamName'))

WebUI.selectOptionByValue(findTestObject('Object Repository/group/Page_StrongGate/select_20                     20-200       _e10512'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/group/Page_StrongGate/input__teamDomain'), 'teamdomain' + uniquValue)

WebUI.sendKeys(findTestObject('Object Repository/group/Page_StrongGate/input__teamDomain'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/group/Page_ZTN Team-Site/div_Team'))

WebUI.click(findTestObject('Object Repository/group/Page_ZTN Team-Site/div_Groups'))

WebUI.click(findTestObject('Object Repository/group/Page_ZTN Team-Site/span_Add Group'))

WebUI.setText(findTestObject('Object Repository/group/Page_ZTN Team-Site/input_Group Name_groupName'), 'grp-' + uniquValue)

WebUI.setText(findTestObject('Object Repository/group/Page_ZTN Team-Site/textarea_Description_groupDesc'), 'desc-grp')