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

WebUI.openBrowser('https://r.pl/last-minute')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Last minute 2022  tanie wakacje i wcza_f1e78b/div_'))

dates.push(WebUI.getText(findTestObject('Object Repository/Page_Last minute 2022  tanie wakacje i wcza_f1e78b/span_24.06.2022 (4 dni)'), 
        FailureHandling.STOP_ON_FAILURE))

dates.push(WebUI.getText(findTestObject('Object Repository/Page_Last minute 2022  tanie wakacje i wcza_f1e78b/span_01.07.2022 (5 dni)'), 
        FailureHandling.STOP_ON_FAILURE))

dates.push(WebUI.getText(findTestObject('Object Repository/Page_Last minute 2022  tanie wakacje i wcza_f1e78b/span_18.06.2022 (5 dni)'), 
        FailureHandling.STOP_ON_FAILURE))

dates.push(WebUI.getText(findTestObject('Object Repository/Page_Last minute 2022  tanie wakacje i wcza_f1e78b/span_17.06.2022 (8 dni)'), 
        FailureHandling.STOP_ON_FAILURE))

dates.push(WebUI.getText(findTestObject('Object Repository/Page_Last minute 2022  tanie wakacje i wcza_f1e78b/span_17.06.2022 (8 dni)'), 
        FailureHandling.STOP_ON_FAILURE))

dates.push(WebUI.getText(findTestObject('Object Repository/Page_Last minute 2022  tanie wakacje i wcza_f1e78b/span_01.07.2022 (5 dni)'), 
        FailureHandling.STOP_ON_FAILURE))

dates.push(WebUI.getText(findTestObject('Object Repository/Page_Last minute 2022  tanie wakacje i wcza_f1e78b/span_17.06.2022 (8 dni)'), 
        FailureHandling.STOP_ON_FAILURE))

dates.push(WebUI.getText(findTestObject('Object Repository/Page_Last minute 2022  tanie wakacje i wcza_f1e78b/span_21.06.2022 (5 dni)'), 
        FailureHandling.STOP_ON_FAILURE))

dates.push(WebUI.getText(findTestObject('Object Repository/Page_Last minute 2022  tanie wakacje i wcza_f1e78b/span_17.06.2022 (8 dni)'), 
        FailureHandling.STOP_ON_FAILURE))

dates.push(WebUI.getText(findTestObject('Object Repository/Page_Last minute 2022  tanie wakacje i wcza_f1e78b/span_21.06.2022 (4 dni)'), 
        FailureHandling.STOP_ON_FAILURE))

WebUI.comment(dates.toString())

formatedDatesToComment = CustomKeywords.'testy.General.filtrDates'(dates)

WebUI.comment(formatedDatesToComment.toString())

