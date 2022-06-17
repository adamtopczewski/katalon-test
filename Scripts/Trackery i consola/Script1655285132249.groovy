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

WebUI.navigateToUrl('https://r.pl/')

WebUI.waitForElementClickable(findTestObject('Page_Biuro podry Rainbow  wakacje, wycieczk_7bc225/span_Czartery'), 2)

WebUI.click(findTestObject('Object Repository/Page_Biuro podry Rainbow  wakacje, wycieczk_7bc225/span_Czartery'))

WebUI.waitForElementClickable(findTestObject('Page_Bilety czarterowe  Rainbow  R.pl/span_Wycieczki fakultatywne'), 2)

WebUI.click(findTestObject('Object Repository/Page_Bilety czarterowe  Rainbow  R.pl/span_Wycieczki fakultatywne'))

WebUI.waitForElementClickable(findTestObject('Page_Wycieczki fakultatywne z Rainbow  R.pl/span_Blog'), 2)

WebUI.click(findTestObject('Object Repository/Page_Wycieczki fakultatywne z Rainbow  R.pl/span_Blog'))

WebUI.click(findTestObject('Object Repository/Page_Blog turystyczny  przewodniki, artykuy_b60566/img_Oferta_mobile__header-rainbow'))

WebUI.click(findTestObject('Object Repository/Page_Biuro podry Rainbow  wakacje, wycieczk_7bc225/a_SZUKAJ (1)'))

WebUI.click(findTestObject('Object Repository/Page_Oferty Rainbow - Wycieczki, Wyjazdy, W_e946cf/div_'))

WebUI.click(findTestObject('Object Repository/Page_Oferty Rainbow - Wycieczki, Wyjazdy, W_e946cf/div_object Object (1)'))

WebUI.click(findTestObject('Object Repository/Page_Oferty Rainbow - Wycieczki, Wyjazdy, W_e946cf/div_Social media'))

WebUI.setText(findTestObject('Object Repository/Page_Oferty Rainbow - Wycieczki, Wyjazdy, W_e946cf/input_ZAPISZ SI NA NEWSLETTER_newsletter__a_3a8e13'), 
    'asd@asd.com')

WebUI.click(findTestObject('Object Repository/Page_Oferty Rainbow - Wycieczki, Wyjazdy, W_e946cf/button_ZAPISZ SI'))

CustomKeywords.'testy.General.appendBrowserLogs'(errors)

WebUI.comment(errors.toString())

WebUI.closeBrowser()

