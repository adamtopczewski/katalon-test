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

WebUI.navigateToUrl(testUrl)

WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_ (1)'))

WebUI.setText(findTestObject('Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/CenaMinimalnaInput'), minPrice)

WebUI.delay(GlobalVariable.defalutTimout)

WebUI.setText(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/CenaMaksymalnaInput'), 
    maxPrice)

WebUI.click(findTestObject('Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/Body'))

WebUI.delay(GlobalVariable.defalutTimout)

CustomKeywords.'modules.Loader.showMoreOffersScrollLoop'(GlobalVariable.defalutTimout)

CustomKeywords.'modules.Prices.checkAllPricesInRange'(2500, 7000)

