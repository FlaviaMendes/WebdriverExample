package phptravels.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFeaturedHotels {
	
	private ChromeDriver webdriver;

	@Test
	public void featuredHotels(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\EstudoFlavia\\chromedriver.exe");
		
		webdriver = new ChromeDriver();
		webdriver.get("http://www.phptravels.net/");
		webdriver.manage().window().maximize();
		
		/*MOUSE SCROLL
		JavascriptExecutor jse = (JavascriptExecutor) webdriver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");*/
				
		String xpathFeaturesHotels = "/html/body/div[8]/div/div[2]/div/a[contains(@href,\"hotels\")]";
		List <WebElement> elementFeaturesHotels = webdriver.findElements(By.xpath(xpathFeaturesHotels));
		System.out.println("Total of Features Hotels" + elementFeaturesHotels.size());
		
		int expectedHotelCount = 8;
		assertEquals(expectedHotelCount, elementFeaturesHotels.size());
		
	}

}
