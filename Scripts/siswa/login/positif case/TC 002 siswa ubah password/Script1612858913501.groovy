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

WebUI.callTestCase(findTestCase('siswa/login/positif case/TC001 Siswa berhasil login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('siswa/ubah password/Page_Beranda  Pijar Sekolah/span_Data Siswa'))

WebUI.click(findTestObject('siswa/ubah password/Page_Ubah Password  Pijar Sekolah/Page_Ubah Password  Pijar Sekolah/span_Ubah Password'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('siswa/ubah password/Page_Ubah Password  Pijar Sekolah/password lama baru dan konfirmasi password/Page_Ubah Password  Pijar Sekolah/input_Password Lama_form-control'), 
    '123456')

WebUI.setText(findTestObject('siswa/ubah password/Page_Ubah Password  Pijar Sekolah/password lama baru dan konfirmasi password/Page_Ubah Password  Pijar Sekolah/input_Password Baru_form-control'), 
    '123456')

WebUI.setText(findTestObject('siswa/ubah password/Page_Ubah Password  Pijar Sekolah/password lama baru dan konfirmasi password/Page_Ubah Password  Pijar Sekolah/input_Konfirmasi Password Baru_form-control'), 
    '123456')

WebUI.click(findTestObject('siswa/ubah password/Page_Ubah Password  Pijar Sekolah/button_Ubah Password'))

WebUI.click(findTestObject('siswa/ubah password/Page_Ubah Password  Pijar Sekolah/a_Ok'))

