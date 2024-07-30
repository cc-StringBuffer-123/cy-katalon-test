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

WebUI.navigateToUrl('https://auth.sogate.net:38889/')

// Generate unique value
String uniquValue = UUID.randomUUID().toString().replace('-', '').substring(0, 6)

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/a_StrongGate'))

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/div_StrongGate'))

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/a_'))

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input__name'), 'test1')

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input_ID_loginName'), ('test1' + uniquValue) + 
    '@test.com')

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/div_'))

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input__passcode'), '123456')

WebUI.setEncryptedText(findTestObject('Object Repository/user/list/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/user/list/Page_StrongGate/input__confirmPassword'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/button_'))

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/button__1'))

// Open a new TAB using JavaScript
String script = 'window.open("https://auth.sogate.net:38889/", "_blank");'

WebUI.executeJavaScript(script, null)

// Get the WebDriver instance
def driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles())

// Switch to a new TAB
driver.switchTo().window(tabs.get(1))

WebUI.navigateToUrl('https://auth.sogate.net:38889/')

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/a_StrongGate'))

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/div_StrongGate'))

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/a_'))

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input__name'), 'test2')

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input_ID_loginName'), ('test2' + uniquValue) + 
    '@test.com')

WebUI.sendKeys(findTestObject('Object Repository/user/list/Page_StrongGate/input_ID_loginName'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input__passcode'), '123456')

WebUI.setEncryptedText(findTestObject('Object Repository/user/list/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/user/list/Page_StrongGate/input__confirmPassword'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/button_'))

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/button__1'))

WebUI.executeJavaScript(script, null)

tabs = new ArrayList<String>(driver.getWindowHandles())

driver.switchTo().window(tabs.get(2))

WebUI.navigateToUrl('https://auth.sogate.net:38889/')

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/a_StrongGate'))

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/div_StrongGate'))

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/a_'))

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input__name'), 'test3')

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input_ID_loginName'), ('test3' + uniquValue) + 
    '@test.com')

WebUI.sendKeys(findTestObject('Object Repository/user/list/Page_StrongGate/input_ID_loginName'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input__passcode'), '123456')

WebUI.setEncryptedText(findTestObject('Object Repository/user/list/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/user/list/Page_StrongGate/input__confirmPassword'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/button_'))

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/button__1'))

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input__teamName'), 'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/user/list/Page_StrongGate/select_20                     20-200       _e10512'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input__teamDomain'), 'test' + uniquValue)

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/div__1'))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/div_Team'))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/li_Users'))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/span_Add User'))

WebUI.setText(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/input_User Email as Login ID_userEmail'), ('test1' + 
    uniquValue) + '@test.com')

WebUI.setText(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/input_(optional)_userName'), ('test1' + uniquValue) + 
    '@test.com')

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/span_Add New User'))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/button_Confirm'))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/span_Add User'))

WebUI.setText(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/input_User Email as Login ID_userEmail'), ('test2' + 
    uniquValue) + '@test.com')

WebUI.setText(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/input_(optional)_userName'), ('test2' + uniquValue) + 
    '@test.com')

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/span_Add Group'))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/td_Team Admin'))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/span_confirm'))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/span_Add New User'))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/button_Confirm_1'))

WebUI.delay(7)

driver.switchTo().window(tabs.get(0))

WebUI.delay(3)

WebUI.navigateToUrl('https://auth.sogate.net:38889/')

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input__teamDomain'), 'test' + uniquValue)

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/button__1_2'))

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/div_StrongGate'))

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input_ID_loginName'), ('test1' + uniquValue) + 
    '@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/user/list/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.sendKeys(findTestObject('Object Repository/user/list/Page_StrongGate/input__password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/div_Team'))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/li_Users'))

WebUI.delay(7)

driver.switchTo().window(tabs.get(1))

WebUI.delay(3)

WebUI.navigateToUrl('https://auth.sogate.net:38889/')

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/div__1_2'))

WebUI.click(findTestObject('Object Repository/user/list/Page_StrongGate/button_StrongGate'))

WebUI.setText(findTestObject('Object Repository/user/list/Page_StrongGate/input_ID_loginName'), ('test2' + uniquValue) + 
    '@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/user/list/Page_StrongGate/input__password'), 'EedPXzAtoLmlvts/d2a2YQ==')

WebUI.sendKeys(findTestObject('Object Repository/user/list/Page_StrongGate/input__password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/div_Team'))

WebUI.click(findTestObject('Object Repository/user/list/Page_ZTN Team-Site/div_Users'))

WebUI.delay(7)

driver.switchTo().window(tabs.get(2))

