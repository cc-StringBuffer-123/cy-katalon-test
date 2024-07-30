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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://127.0.0.1:18080/')

WebUI.click(findTestObject('t1/Page_StrongGate/input__t'))

WebUI.click(findTestObject('t1/Page_StrongGate/a_StrongGate'))

WebUI.click(findTestObject('t1/Page_StrongGate/div_StrongGate'))

WebUI.click(findTestObject('t1/Page_StrongGate/input_ID_email'))

WebUI.click(findTestObject('t1/Page_StrongGate/a_'))

WebUI.setText(findTestObject('t1/Page_StrongGate/input__name'), 'test')

WebUI.setText(findTestObject('t1/Page_StrongGate/input_ID_loginName'), ('test' + uniquValue) + '@test.com')

WebUI.click(findTestObject('t1/Page_StrongGate/div_test421521test.com                     _f5c8c4'))

WebUI.setText(findTestObject('t1/Page_StrongGate/input__passcode'), '123456')

WebUI.setEncryptedText(findTestObject('t1/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.setEncryptedText(findTestObject('t1/Page_StrongGate/input__confirmPassword'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.click(findTestObject('t1/Page_StrongGate/button_'))

WebUI.setText(findTestObject('t1/Page_StrongGate/input__teamName'), 'test')

WebUI.selectOptionByValue(findTestObject('t1/Page_StrongGate/select_20                     20-200       _e10512'), 
    '1', true)

WebUI.setText(findTestObject('t1/Page_StrongGate/input__teamDomain'), 'test' + uniquValue)

WebUI.click(findTestObject('t1/Page_StrongGate/div_test                test421521test.com _615899'))

WebUI.click(findTestObject('t1/Page_StrongGate/div_'))

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/div_Dashboards'))

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/div_Team'))

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/li_Users'))

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/span_Add User'))

WebUI.setText(findTestObject('t1/Page_ZTN Team-Site/input_User Email as Login ID_el-id-3366-21'), 'test@test.com')

WebUI.setText(findTestObject('t1/Page_ZTN Team-Site/input_(optional)_el-id-3366-22'), 'test@test.com')

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/span_Add New User'))

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/div_Groups'))

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/span_Add Group'))

WebUI.setText(findTestObject('t1/Page_ZTN Team-Site/input_Group Name_el-id-3366-69'), 'deveas-ta')

WebUI.setText(findTestObject('t1/Page_ZTN Team-Site/textarea_Description_el-id-3366-70'), 'desc')

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/button_Security Settings'))

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/button_Add Role'))

WebUI.doubleClick(findTestObject('t1/Page_ZTN Team-Site/div_Team Admin'))

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/input_Select and Confirm_el-select__input'))

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/li_testtest.com'))

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/span_Add New Group'))

WebUI.click(findTestObject('t1/Page_ZTN Team-Site/button_Confirm'))