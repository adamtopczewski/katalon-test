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

WebUI.navigateToUrl('https://r.pl/grecja?datyUrodzenia%5B%5D=1992-01-01&datyUrodzenia%5B%5D=1992-01-01&liczbaPokoi=1&sortowanie=cena-asc&widok=bloczki&cena%5B%5D=avg&dlugoscPobytu%5B%5D=%2a-%2a&typTransportu%5B%5D=AIR&typTransportu%5B%5D=dreamliner&lokalizacje_HoteloProdukt%5B%5D=grecja&promocja%5B%5D=topniejace-rabaty')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/span_1 625'), 
    '1 625')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/span_1 656'), 
    '1 656')

WebUI.scrollToElement(findTestObject('Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/p_Znaleziono  73 oferty'), 0)

WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_Sortuj od najniszej ceny  object Object'))

WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/li_od najwyszej ceny'))

WebUI.delay(GlobalVariable.defalutTimout)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/span_12 180'), 
    '12 180')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/span_11 721'), 
    '11 721')

