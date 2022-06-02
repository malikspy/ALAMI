import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://inboxkitten.com/')

WebUI.delay(3)

WebUI.setText(findTestObject('Aktivasi Email/MailBox'), GlobalVariable.email)

WebUI.click(findTestObject('Aktivasi Email/Btn Periksa Email'))

WebUI.delay(5)

WebUI.click(findTestObject('Aktivasi Email/Open Message'))

WebUI.delay(1)

//WebUI.scrollToPosition(9999, 9999)
WebUI.switchToFrame(findTestObject('Aktivasi Email/Frame'), 1)

WebUI.click(findTestObject('Aktivasi Email/Scroll Email'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.delay(3)

WebUI.click(findTestObject('Aktivasi Email/Klik Aktivasi'))

WebUI.delay(2)

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Aktivasi Email/masuk ke akun saya'))

