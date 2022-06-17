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

WebUI.navigateToUrl('https://r.pl/happy-hours')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Happy Hours  w Biurze podry Rainbow  R.pl/div_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Happy Hours  w Biurze podry Rainbow  R.pl/div_Ikaros Hotel    Wasna standaryzacja obi_78d63d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Happy Hours  w Biurze podry Rainbow  R.pl/div_Commodore    Wasna standaryzacja obiekt_cccdb1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Happy Hours  w Biurze podry Rainbow  R.pl/div_White Olive Premium Cameo       object _ae33ff'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Happy Hours  w Biurze podry Rainbow  R.pl/p_poka wszystkie oferty'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Oferty Rainbow - Wycieczki, Wyjazdy, W_e946cf/p_Znaleziono  168 ofert'), 
    'Znaleziono 168 ofert')

