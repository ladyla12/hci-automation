import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Facebook Register/Page_Facebook - Masuk atau Daftar/input_Terjadi kesalahan Silakan coba lagi_firstname'), 
    'Rias')

WebUI.setText(findTestObject('Object Repository/Facebook Register/Page_Facebook - Masuk atau Daftar/input_Terjadi kesalahan Silakan coba lagi_lastname'), 
    'Gremory')

WebUI.setText(findTestObject('Object Repository/Facebook Register/Page_Facebook - Masuk atau Daftar/input_Terjadi kesalahan Silakan coba lagi_reg_email__'), 
    'rias.gremory.vip@gmail.com')

WebUI.setText(findTestObject('Object Repository/Facebook Register/Page_Facebook - Masuk atau Daftar/input_Terjadi kesalahan Silakan coba lagi_reg_email_confirmation__'), 
    'rias.gremory.vip@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Facebook Register/Page_Facebook - Masuk atau Daftar/input_Terjadi kesalahan Silakan coba lagi_reg_passwd__'), 
    'HUXQ/f9tVkXVirJb9dq05A==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Facebook Register/Page_Facebook - Masuk atau Daftar/input_tanggal'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Facebook Register/Page_Facebook - Masuk atau Daftar/input_bulan'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Facebook Register/Page_Facebook - Masuk atau Daftar/input_tahun'), 
    '1992', true)

WebUI.click(findTestObject('Object Repository/Facebook Register/Page_Facebook - Masuk atau Daftar/input_Jenis Kelamin_sex'))

WebUI.click(findTestObject('Object Repository/Facebook Register/Page_Facebook - Masuk atau Daftar/button_Daftar'))

WebUI.closeBrowser()

