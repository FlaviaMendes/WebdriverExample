package phptravels.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChangeLanguage {
	
	private ChromeDriver webdriver;

	@Test
	public void changeLanguage (){
		
		System.setProperty("webdriver.chrome.driver", "C:\\EstudoFlavia\\chromedriver.exe");
	
		webdriver = new ChromeDriver();
		webdriver.get("http://www.phptravels.net/");
		webdriver.manage().window().maximize();
		
		String xpathLanguage = "/html/body/div[2]/div/div/div[2]/ul/li[1]/a";
		WebElement elementLanguage = webdriver.findElement(By.xpath(xpathLanguage));
		elementLanguage.click();
		
		WebElement elementLanguagePortuguese = webdriver.findElement(By.id("pt"));
		elementLanguagePortuguese.click();
		
		String xpathChangedLanguage = "/html/body/div[2]/div/div/div[2]/ul/li[1]/a";
		WebElement elementChangedLanguage = webdriver.findElement(By.xpath(xpathChangedLanguage));
		assertEquals("Portuguese", elementChangedLanguage.getText());
	}

}
