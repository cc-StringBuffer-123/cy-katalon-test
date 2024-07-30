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

WebUI.openBrowser('')

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

String testData = 'test' + uniquValue

WebUI.navigateToUrl('https://127.0.0.1:18080/')

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/a_StrongGate'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/div_StrongGate'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/a_'))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__name'), 'test')

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/div_ID'))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input_ID_loginName'), testData + 
    '@test.com')

WebUI.sendKeys(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input_ID_loginName'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__passcode'), '123456')

WebUI.setEncryptedText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__confirmPassword'), 
    'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.sendKeys(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__confirmPassword'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/button_'))

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__teamName'), 'team')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/select_20                     20-200       _e10512'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/select_20                     20-200       _e10512'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/input__teamDomain'), testData)

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_StrongGate/button__1'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/div_Network Access'))

WebUI.click(findTestObject('Object Repository/Web Browser/ts-location/Page_ZTN Team-Site/li_Locations'))