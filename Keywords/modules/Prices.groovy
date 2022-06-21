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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;

import com.kms.katalon.core.webui.driver.DriverFactory as DF

import internal.GlobalVariable

public class Prices {
	def driver = DF.getWebDriver();


	@Keyword
	def checkAllPricesInRange(min, max) {
		WebUI.delay(3)
		List<WebElement> pricesArr = driver.findElements(By.xpath("//span[@class='bloczek__cena h1']"));
		def pricesList = [];
		Integer elementPrice;
		for (WebElement element in pricesArr) {
			elementPrice = Integer.parseInt(element.getText().replace(' ', ''))
			if(elementPrice < min || elementPrice > max) {
				println('Bledna cena:' + elementPrice)
				KeywordUtil.markErrorAndStop('Cena poza zakresem')
			} else {
				pricesList.push(elementPrice)
			}
		}
		println(Arrays.toString(pricesList))
		return
	}

	@Keyword
	def checkDiscountPriceValidity() {
		WebUI.delay(3)
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='bloczek__cena h1']"));
		List<WebElement> beforeDiscountPrice = driver.findElements(By.xpath("//span[@class='bloczek__cena-kreslona']"));
		HashMap<String, String> pricesList = new HashMap<String, String>();
		Integer pricesCount = prices.size();
		println("Ilość sprawdzanych cen: " + pricesCount)
		for(int i; i < prices.size(); i++) {
			int priceAmount = Integer.parseInt(prices[i].getText().replaceAll("\\s", ""))
			int beforeDiscountAmount = Integer.parseInt(beforeDiscountPrice[i].getText().replaceAll("\\s", "").replace("zł", ""))
			if(Integer.compare(priceAmount, beforeDiscountAmount) > 0) {
				println("ERROR:: Price is: " + priceAmount + ". And before discount was: " + beforeDiscountAmount)
				KeywordUtil.markErrorAndStop('Cena po obniżce jest wyższa, niż przed')
			} else {
				pricesList.put('Discounted price ' + i.toString(), priceAmount)
				pricesList.put("Before discount price " + i.toString(), beforeDiscountAmount)
			}
		}
		println(pricesList)
		return
	}
}
