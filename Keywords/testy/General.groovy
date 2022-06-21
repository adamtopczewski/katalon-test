package testy

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.util.KeywordUtil
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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.WebDriver
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.logging.LogEntries

import org.openqa.selenium.logging.LogEntry

import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

public class General {

	@Keyword
	def checkForPresentItem(arr, item) {

		if(Arrays.asList(arr).contains(item)) {
			KeywordUtil.markFailed('Znaleziono dubel')
			return false
		} else {
			arr.push(item)
		}
		return arr
	}

	@Keyword
	def appendBrowserLogs(arr) {
		WebDriver driver = DriverFactory.getWebDriver()
		LogEntries logs = driver.manage().logs().get("browser")

		for (LogEntry entry : logs) {
			arr.push(entry.getLevel().toString() + " " + entry.getMessage())
		}

		if(arr.toString().contains('sales')) {
			KeywordUtil.markFailed('Błąd trackera')
		}
	}

	@Keyword
	def stringContains(str, match) {
		return str.contains(match)
	}

	@Keyword
	def filtrDates(dates) {
		List formatedDates = [];
		for (String date : dates) {
			String newDate = date.split(' ')[0]
			//			String newDate = Pattern.compile('"\\s\\(\\d\\sdni\\)"gi').matcher(date).replaceAll('')
			//			String newDate = date.replaceAll('"\\s\\(\\d\\sdni\\)"gi', '')
			println(newDate)
			formatedDates.push(newDate)
		}
		return formatedDates
	}

	@Keyword
	def transformPriceToInt(object, compTo, GreaterOrLess) {
		String priceStr = WebUI.getText(object)
		priceStr = priceStr.replace(' ', '')
		Integer priceInt = Integer.parseInt(priceStr)

		if(GreaterOrLess == "greater") {
			return priceInt > compTo ? true : false
		}
		if(GreaterOrLess == 'less') {
			return priceInt < compTo ? true : false
		}
	}
}
