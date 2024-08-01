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

WebUI.navigateToUrl('https://127.0.0.1:18080/')

String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input__t'), 'test333')

WebUI.sendKeys(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input__t'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/div_StrongGate'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/div_ID'))

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input_ID_email'), 'test@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.sendKeys(findTestObject('Object Repository/deviceReqPolicy/Page_StrongGate/input__password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_Team'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_Device Req Policy'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Add Policy'))

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/input_Policy Name_policyName'), 'pol-' + uniquValue)

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Block'))

WebUI.setText(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/textarea_Description(optional)_policyDesc'), 
    'desc-' + uniquValue)

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_By the matched group administrators in _3af9ef'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_By these members'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/input_By these members_byMembers'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_test999test.com'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/li_test666test.com'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/li_test333test.com'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Add Group'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_GRP-001'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_GRP-002'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/div_GRP-003'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/span_Add Device Requirements Policy'))

WebUI.click(findTestObject('Object Repository/deviceReqPolicy/Page_ZTN Team-Site/button_Confirm'))

