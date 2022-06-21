package modules

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Loader {
	@Keyword
	def openUrlshowMoreOffersScrollLoop(url, timeout) {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(url)

		WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_'))

		WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_object Object'))

		WebUI.delay(timeout)

		WebUI.scrollToElement(findTestObject('Więcej ofert/Wiecej scroll'), 1)

		//		Boolean isLoaderPresent = WebUI.waitForElementPresent(findTestObject('Object Repository/Więcej ofert/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/div_Mamy dla Ciebie wicej ofert'),
		//				2)


		while (WebUI.waitForElementPresent(findTestObject('Object Repository/Więcej ofert/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/div_Mamy dla Ciebie wicej ofert'),
		2)) {
			WebUI.delay(timeout)

			WebUI.scrollToElement(findTestObject('Więcej ofert/Wiecej scroll'), 1)

			Boolean newElementPresent = WebUI.waitForElementPresent(findTestObject('Object Repository/Więcej ofert/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/Dodatkowy anchor dla tekstu'),
					3)

			WebUI.delay(timeout)

			if (newElementPresent != true) {
				break
			}
		}
	}

	@Keyword
	def showMoreOffersScrollLoop(timeout) {

		WebUI.click(findTestObject('Object Repository/Page_Wakacje i wczasy w Grecji 2022 z Rainb_e432b7/div_object Object'))

		WebUI.delay(timeout)

		WebUI.scrollToElement(findTestObject('Więcej ofert/Wiecej scroll'), 1)

		while (WebUI.waitForElementPresent(findTestObject('Object Repository/Więcej ofert/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/Dodatkowy anchor dla tekstu'),
				3)) {
			WebUI.delay(timeout)

			WebUI.scrollToElement(findTestObject('Więcej ofert/Wiecej scroll'), 1)

			WebUI.delay(timeout)

			if (WebUI.waitForElementPresent(findTestObject('Object Repository/Więcej ofert/Page_Wakacje i wczasy w Kenii 2022 z Rainbow  R.pl/Dodatkowy anchor dla tekstu'),
					3) != true) {
				break
			}
		}
	}
}
