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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://r.pl/szukaj')

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Page_Oferty Rainbow - Wycieczki, Wyjazdy, W_e946cf/div_'))

WebUI.enableSmartWait()

WebUI.click(findTestObject('Object Repository/Page_Oferty Rainbow - Wycieczki, Wyjazdy, W_e946cf/div_Do 6 dni_vue-radio__box'))

WebUI.delay(GlobalVariable.defalutTimout)

url = WebUI.getUrl()

CustomKeywords.'testy.General.stringContains'(url, 'dlugoscPobytu[]=7-9')

WebUI.click(findTestObject('Object Repository/Page_Oferty Rainbow - Wycieczki, Wyjazdy, W_e946cf/div_Do 6 dni_vue-radio__box'))

url = WebUI.getUrl()

WebUI.delay(GlobalVariable.defalutTimout)

WebUI.click(findTestObject('Object Repository/Page_Oferty Rainbow - Wycieczki, Wyjazdy, W_e946cf/div_object Object'))

url = WebUI.getUrl()

WebUI.delay(GlobalVariable.defalutTimout)

url = WebUI.getUrl()

WebUI.click(findTestObject('Object Repository/Page_Oferty Rainbow - Wycieczki, Wyjazdy, W_e946cf/div_object Object'))

WebUI.delay(GlobalVariable.defalutTimout)

url = WebUI.getUrl()

WebUI.click(findTestObject('Object Repository/Page_Oferty Rainbow - Wycieczki, Wyjazdy, W_e946cf/div_object Object'))

WebUI.closeBrowser()

