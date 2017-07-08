package phptravels.test;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSearchLocation {
	
	private ChromeDriver webdriver;
		

	@Test
	public void searchLocation(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\EstudoFlavia\\chromedriver.exe");
		int secondsToWait = 5;
		
		webdriver = new ChromeDriver();
		webdriver.get("http://www.phptravels.net/");
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(secondsToWait, TimeUnit.SECONDS);
		
		WebDriverWait explicitWait = new WebDriverWait(webdriver, secondsToWait);
		
		//Location=============================================================
		String xpathSearchLocation = "//*[@id=\"s2id_autogen3\"]/a/span[2]";
		WebElement elementSearchLocation = webdriver.findElement(By.xpath(xpathSearchLocation));
		elementSearchLocation.click();
		
		String xpathFillLocation = "//*[@id=\"select2-drop\"]/div/input";
		WebElement elementFillLocation  = webdriver.findElement(By.xpath(xpathFillLocation));
		elementFillLocation.sendKeys("Lisbon");
		
		String xpathChooseLocation = "//*[@id=\"select2-drop\"]/ul/li/ul/li/div";		
		WebElement elementChooseLocation = webdriver.findElement(By.xpath(xpathChooseLocation));
		elementChooseLocation.click();
		
		
		// Check in date ======================================================
		WebElement elementCheckIn = webdriver.findElement(By.name("checkin"));
		elementCheckIn.click();
				
		// Locate and wait to calendar be visible==============================
		String xpathCalendarCheckIn = "/html/body/div[13]";
		WebElement elementCalendarCheckIn = webdriver.findElement(By.xpath(xpathCalendarCheckIn));
		explicitWait.until(ExpectedConditions.visibilityOf(elementCalendarCheckIn));
		
		String xpathNextMonthCheckIn = "div[1]/table/thead/tr[1]/th[3]";
		WebElement elementNextMonthCheckIn = elementCalendarCheckIn.findElement(By.xpath(xpathNextMonthCheckIn));
		elementNextMonthCheckIn.click();
				
		String xpathChooseCheckIn = "div[1]/table/tbody/tr[4]/td[1]";
		WebElement elementChooseCheckIn = elementCalendarCheckIn.findElement(By.xpath(xpathChooseCheckIn));
		elementChooseCheckIn.click();
		
		// Check out date ======================================================
		WebElement elementCheckOut = webdriver.findElement(By.name("checkout"));
		elementCheckOut.click();
		
		// Locate and wait to calendar be visible==============================
		String xpathCalendarCheckOut = "/html/body/div[15]/div[1]";
		WebElement elementCalendarCheckOut = webdriver.findElement(By.xpath(xpathCalendarCheckOut));
		explicitWait.until(ExpectedConditions.visibilityOf(elementCalendarCheckOut));
		
		String xpathNextMonthCheckOut = "table/thead/tr[1]/th[3]";
		WebElement elementNextMonthCheckOut = elementCalendarCheckOut.findElement(By.xpath(xpathNextMonthCheckOut));
		elementNextMonthCheckOut.click();
		
		String xpathChooseCheckOut = "table/tbody/tr[3]/td[7]";
		WebElement elementChooseCheckOut = elementCalendarCheckOut.findElement(By.xpath(xpathChooseCheckOut));
		elementChooseCheckOut.click();
		
		// Adults===============================================================		
		WebElement elementNumberAdults = webdriver.findElement(By.name("adults"));
		elementNumberAdults.click();
		
		String xpathChooseNumberAdults = "";
		WebElement elementChooseNumberAdults = webdriver.findElement(By.xpath(xpathChooseNumberAdults));
		elementChooseNumberAdults.click();
				
		WebElement elementNumberChild = webdriver.findElement(By.name("child"));
		elementNumberChild.click();
		
		String xpathChooseNumberChild = "";
		WebElement elementChooseNumberChild = webdriver.findElement(By.xpath(xpathChooseNumberChild));
		elementChooseNumberChild.click();
		
		String xpathButtonSearch = "//*[@id=\"HOTELS\"]/div/form/div[6]/div/button";
		WebElement elementButtonSearch = webdriver.findElement(By.xpath(xpathButtonSearch));
		elementButtonSearch.click();
		
		
		
		
		
		
		
		
		
		
		
	}



}
