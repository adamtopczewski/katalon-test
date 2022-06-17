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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://r.pl/grecja')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_Grecja                      Stolica    _6e4fd3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/span_Dlaczego warto wyjecha do Grecji'), 
    'Dlaczego warto wyjechać do Grecji?')

WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/h2_Dlaczego warto wyjecha do Grecji'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/span_Grecja jest jednym z najciekawszych i _579143'), 
    'Grecja jest jednym z najciekawszych i najbardziej różnorodnych krajów w Europie. Liczne antyczne zabytki sąsiadują tu z przepiękną przyrodą. Część lądowa Grecji upstrzona jest wieloma ciekawymi pasmami górskimi, a klimat greckich wysp, pełnych piaszczystych plaż i urokliwych zatok jest niespotykany nigdzie indziej na świecie. To wszystko okraszone jest fenomenalną kuchnią i przepysznymi lokalnymi winami.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_Grecja'), 
    'Grecja')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/p_Planujesz wakacje w Grecji Sprawd najwiks_39263d'), 
    'Planujesz wakacje w Grecji? Sprawdź największe atrakcje turystyczne, które warto tam zobaczyć. Poznaj top 10 miejsc i zabytków, które trzeba odwiedzić: Ateny, Rodos, Santorini, Olimpia i wiele innych')

WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_Atrakcje turystyczne Grecji - 10 miejsc_c79ddf'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_6.0  6    object Object                _77bb10'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_6.0  6    object Object                _77bb10'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_6.0  6    object Object                _42440e'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_Kreta -wyspa Talosa           Jeli kied_2f4022'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_6.0  6    object Object                _9e3c16'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_Karolina, Warszawa, 2021.09.14_seo-long_662b8a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_6.0  6    object Object                _c82244'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_6.0  6    object Object                _c82244'))

WebUI.closeBrowser()

