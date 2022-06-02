import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementText(findTestObject('Login/Dashboard'), 'Login untuk masuk ke akun Kamu.')

WebUI.setText(findTestObject('Login/Email'), GlobalVariable.email + '@inboxkitten.com')

WebUI.setEncryptedText(findTestObject('Login/Password'), 'nM+yxytsbVExwYpLLLYeHg==')

WebUI.delay(3)

WebUI.click(findTestObject('Login/LoginBtn'))

WebUI.delay(15)

WebUI.verifyElementText(findTestObject('Login/Verify login Successfully'), 'Lengkapi Profilmu Untuk Aktivasi Akun dan RDF (Rekening Dana Funder)')

WebUI.delay(2)

WebUI.closeBrowser()
