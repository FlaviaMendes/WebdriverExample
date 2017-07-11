package phptravels.test;


import static org.junit.Assert.*;
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
	public void searchLocation() throws Exception{
		
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
		String xpathCalendarCheckIn13 = "/html/body/div[13]";
		WebElement elementCalendarCheckIn13 = webdriver.findElement(By.xpath(xpathCalendarCheckIn13));
		String xpathCalendarCheckIn14 = "/html/body/div[14]";
		WebElement elementCalendarCheckIn14 = webdriver.findElement(By.xpath(xpathCalendarCheckIn14));
		
		explicitWait.until(
				ExpectedConditions.or(
						ExpectedConditions.visibilityOf(elementCalendarCheckIn13),
						ExpectedConditions.visibilityOf(elementCalendarCheckIn14)
				)
		);
		
		WebElement locatedCheckIn = null;
		if (elementCalendarCheckIn13.isDisplayed()) {
			System.out.println("Carregou o 13");
			locatedCheckIn = elementCalendarCheckIn13;
		}
		
		if (elementCalendarCheckIn14.isDisplayed()) {
			System.out.println("Carregou o 14");
			locatedCheckIn = elementCalendarCheckIn14;
		}
		
		String xpathNextMonthCheckIn = "div[1]/table/thead/tr[1]/th[3]";
		WebElement elementNextMonthCheckIn = locatedCheckIn.findElement(By.xpath(xpathNextMonthCheckIn));
		elementNextMonthCheckIn.click();
				
		String xpathChooseCheckIn = "div[1]/table/tbody/tr[4]/td[1]";
		WebElement elementChooseCheckIn = locatedCheckIn.findElement(By.xpath(xpathChooseCheckIn));
		elementChooseCheckIn.click();
		
		// Locate and wait to calendar be visible==============================
		String xpathCalendarCheckOut14 = "/html/body/div[14]";
		WebElement elementCalendarCheckOut14 = webdriver.findElement(By.xpath(xpathCalendarCheckOut14));
		String xpathCalendarCheckOut15 = "/html/body/div[15]";
		WebElement elementCalendarCheckOut15 = webdriver.findElement(By.xpath(xpathCalendarCheckOut15));
				
		explicitWait.until(
				ExpectedConditions.or(
						ExpectedConditions.visibilityOf(elementCalendarCheckOut14),
						ExpectedConditions.visibilityOf(elementCalendarCheckOut15)
				)
		);
				
		WebElement locatedCheckOut = null;
			if (elementCalendarCheckOut14.isDisplayed()) {
					System.out.println("Carregou o 14");
					locatedCheckOut = elementCalendarCheckOut14;
				}
				
			if (elementCalendarCheckOut15.isDisplayed()) {
					System.out.println("Carregou o 15");
					locatedCheckOut = elementCalendarCheckOut15;
				}
				
				
		
		String xpathNextMonthCheckOut = "/html/body/div[14]/div[1]/table/thead/tr[1]/th[3]";
		WebElement elementNextMonthCheckOut = webdriver.findElement(By.xpath(xpathNextMonthCheckOut));
		elementNextMonthCheckOut.click();
				
				
		String xpathChooseCheckOut = "/html/body/div[14]/div[1]/table/tbody/tr[5]/td[1]";
		WebElement elementChooseCheckOut = webdriver.findElement(By.xpath(xpathChooseCheckOut));
		elementChooseCheckOut.click();
				
		// Adults===============================================================		
		WebElement elementNumberAdults = webdriver.findElement(By.name("adults"));
		elementNumberAdults.click();
				
		String xpathChooseNumberAdults = "//*[@id=\"adults\"]/option[1]";
		WebElement elementChooseNumberAdults = webdriver.findElement(By.xpath(xpathChooseNumberAdults));
		elementChooseNumberAdults.click();
						
		WebElement elementNumberChild = webdriver.findElement(By.name("child"));
		elementNumberChild.click();
				
		String xpathChooseNumberChild = "//*[@id=\"child\"]/option[2]";
		WebElement elementChooseNumberChild = webdriver.findElement(By.xpath(xpathChooseNumberChild));
		elementChooseNumberChild.click();
				
		String xpathButtonSearch = "//*[@id=\"HOTELS\"]/div/form/div[6]/div/button";
		WebElement elementButtonSearch = webdriver.findElement(By.xpath(xpathButtonSearch));
		elementButtonSearch.click();
				
		String xpathNoResults = "/html/body/div[5]/div[3]/div/h1";
		WebElement elementNoResults = webdriver.findElement(By.xpath(xpathNoResults));
		assertEquals("No Results!!", elementNoResults.getText());
				
				
				
				
				
		
		
		
		
		
		
	}



}
