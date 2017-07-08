package phptravels.test;

import static org.junit.Assert.*;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSignUp {
	
	private ChromeDriver webdriver;

	@Test
	public void signUp(){
		
		/*TODO: FAZER UM CENÁRIO, COM FIREFOX, TESTE PESQUISA, TESTE BOOKING*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\EstudoFlavia\\chromedriver.exe");
		
		webdriver = new ChromeDriver();
		webdriver.get("http://www.phptravels.net/");
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String xpathMenuMyAccount = "/html/body/div[2]/div/div/div[2]/ul/li[2]/a";
		WebElement elementMenuMyAccount = webdriver.findElement(By.xpath(xpathMenuMyAccount));
		elementMenuMyAccount.click();
		
		String xpathMenuSignUp = "/html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]/a";
		WebElement elementMenuSignUp = webdriver.findElement(By.xpath(xpathMenuSignUp));
		elementMenuSignUp.click();
		
		WebElement elementFirstName = webdriver.findElement(By.name("firstname"));
		elementFirstName.sendKeys("Flávia");
		
		WebElement elementLastName = webdriver.findElement(By.name("lastname"));
		elementLastName.sendKeys("Mendes");
		
		WebElement elementMobilePhone = webdriver.findElement(By.name("phone"));
		elementMobilePhone.sendKeys("999999999");
		
		/*GENERATE E-MAIL AUTOMATICALLY*/
		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString();
		
		String email = randomUUIDString + "@mailinator.com";
		String xpathEmail = "//*[@id=\"headersignupform\"]/div[6]/input";
		WebElement elementEmail = webdriver.findElement(By.xpath(xpathEmail));
		elementEmail.sendKeys(email);
		
		WebElement elementPassword = webdriver.findElement(By.name("password"));
		elementPassword.sendKeys("123456");
		
		WebElement elementConfirmPssword = webdriver.findElement(By.name("confirmpassword"));
		elementConfirmPssword.sendKeys("123456");
		
		String xpathButtonSignUp = "//*[@id=\"headersignupform\"]/div[9]/button";
		WebElement buttonSignUp = webdriver.findElement(By.xpath(xpathButtonSignUp));
		buttonSignUp.click();
				
		String xpathConfirmRegistration = "/html/body/div[3]/div[1]/div/div[1]/h3";
		WebElement elementConfirmRegistration = webdriver.findElement(By.xpath(xpathConfirmRegistration));
		assertEquals("Hi, Flávia Mendes", elementConfirmRegistration.getText());
		
		
	}
	
	
	

}
