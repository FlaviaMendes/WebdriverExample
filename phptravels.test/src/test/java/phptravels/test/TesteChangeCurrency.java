package phptravels.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteChangeCurrency {
	
	private ChromeDriver webdriver;

	@Test
	public void changeCurrency(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\EstudoFlavia\\chromedriver.exe");
		
		webdriver = new ChromeDriver();
		webdriver.get("http://www.phptravels.net/");
		webdriver.manage().window().maximize();
		
		WebElement elementCurrency = webdriver.findElement(By.name("currency"));
		elementCurrency.click();
		
		String xpathChangeCurrency = "//*[@id=\"currency\"]/option[4]";
		WebElement elementChangeCurrency = webdriver.findElement(By.xpath(xpathChangeCurrency));
		elementChangeCurrency.click();
		
		String xpathConfirmChangeCurrency = "//*[@id=\"currency\"]";
		WebElement elementConfirmChangeCurrency = webdriver.findElement(By.xpath(xpathConfirmChangeCurrency));
		elementConfirmChangeCurrency.getText();
			
	
	}

}
