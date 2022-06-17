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

WebUI.openBrowser('https://r.pl/kenia?datyUrodzenia%5B%5D=1992-01-01&datyUrodzenia%5B%5D=1992-01-01&liczbaPokoi=1&sortowanie=popularne-desc&widok=bloczki&cena%5B%5D=avg&dlugoscPobytu%5B%5D=%2a-%2a&typTransportu%5B%5D=AIR&typTransportu%5B%5D=dreamliner&lokalizacje_HoteloProdukt%5B%5D=kenia')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(0)

currentHotel = WebUI.getText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Kenya Bay'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'testy.General.checkForPresentItem'(nazwyHoteli, currentHotel)

currentHotel = WebUI.getText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Jacaranda Indian Ocean Beach Resort'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'testy.General.checkForPresentItem'(nazwyHoteli, currentHotel)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Hotel Reef'), 
    'Hotel Reef')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Bamburi Beach'), 
    'Bamburi Beach')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Amani Tiwi Beach Resort'), 
    'Amani Tiwi Beach Resort')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Papillon Lagoon Reef'), 
    'Papillon Lagoon Reef')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Kaskazi Beach'), 
    'Kaskazi Beach')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Nyali Sun Africa'), 
    'Nyali Sun Africa')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Temple Point Resort'), 
    'Temple Point Resort')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Diani Sea Lodge'), 
    'Diani Sea Lodge')

WebUI.click(findTestObject('Ciastka/Zamknij ciastka X'))

WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/div_object Object'))

WebUI.waitForElementPresent(findTestObject('Sekcja Seo'), 2)

WebUI.scrollToElement(findTestObject('Sekcja Seo'), 2)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Neptune Beach Resort'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Neptune Beach Resort'), 
    'Neptune Beach Resort')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Sandies Tropical Village'), 
    'Sandies Tropical Village')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Turtle Bay'), 
    'Turtle Bay')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Kilifi Bay Beach Resort'), 
    'Kilifi Bay Beach Resort')

currentHotel = WebUI.getText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Powitanie z Afryk, Kenya Bay 4 noce  obja_0e5c67'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'testy.General.checkForPresentItem'(nazwyHoteli, currentHotel)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Prideinn Paradise Beach Resort'), 
    'Prideinn Paradise Beach Resort')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Sandies Malindi Dream Garden'), 
    'Sandies Malindi Dream Garden')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Diani Sea Resort'), 
    'Diani Sea Resort')

currentHotel = WebUI.getText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Powitanie z Afryk, Bamburi Beach 4 noce  _3fe5a0'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'testy.General.checkForPresentItem'(nazwyHoteli, currentHotel)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Neptune Village Beach Resort  SPA'), 
    'Neptune Village Beach Resort & SPA')

WebUI.scrollToElement(findTestObject('Więcej ofert/Wiecej scroll'), 0)

currentHotel = WebUI.getText(findTestObject('Object Repository/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/p_Powitanie z Afryk, Hotel Reef 4 noce  obj_b65ab4'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'testy.General.checkForPresentItem'(nazwyHoteli, currentHotel)

WebUI.comment(nazwyHoteli.toString())

WebUI.closeBrowser()

