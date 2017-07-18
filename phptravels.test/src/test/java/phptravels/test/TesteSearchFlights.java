package phptravels.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSearchFlights {

	private ChromeDriver webdriver;
		
	@Test
	public void searchLocation() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\EstudoFlavia\\chromedriver.exe");
		
		
		webdriver = new ChromeDriver();
		webdriver.get("http://www.phptravels.net/");
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String xpathTabFlights = "/html/body/div[4]/div[2]/div/ul/li[2]/a";
		WebElement elementTabFlights = webdriver.findElement(By.xpath(xpathTabFlights));
		elementTabFlights.click();
		
		/*String xpathOrigin = "//*[@id=\"flights-form-e823caac1a24a0172d4ee792e5dad7d9\"]/div[2]/div[1]";
		WebElement elementOrigin = webdriver.findElement(By.name(xpathOrigin));
		elementOrigin.clear();*/
		
		WebElement elementDestination = webdriver.findElement(By.name("destination_name"));
		elementDestination.sendKeys("Lisbon");
		
		String xpathChooseAllAirport = "//*[@id=\"flights-destination-prepop-e823caac1a24a0172d4ee792e5dad7d9\"]";
		WebElement elementChooseAllAirport = webdriver.findElement(By.xpath(xpathChooseAllAirport));
		elementChooseAllAirport.click();
		
		/*String xpathDepartDate = "//*[@id=\"flights-dates-depart-prepop-e823caac1a24a0172d4ee792e5dad7d9\"]";
		WebElement elementDepartDate = webdriver.findElement(By.xpath(xpathDepartDate));
		elementDepartDate.click();
		
		String xpathChooseDepartDate = "//*[@id=\"mewtwo-datepicker-2017-7-24\"]";
		WebElement elementChooseDepartDate = webdriver.findElement(By.xpath(xpathChooseDepartDate));
		elementChooseDepartDate.click();
		
		String xpathChooseReturnDate = "//*[@id=\"mewtwo-datepicker-2017-7-12\"]";
		WebElement elementChooseReturnDate = webdriver.findElement(By.xpath(xpathChooseReturnDate));
		elementChooseReturnDate.click();*/
		
		String xpathPassengersClass = "//*[@id=\"flights-form-e823caac1a24a0172d4ee792e5dad7d9\"]/div[5]/div";
		WebElement elementPassengersClass = webdriver.findElement(By.xpath(xpathPassengersClass));
		elementPassengersClass.click();
		
		String xpathPassengerMoreAdults = "/html/body/div[18]/div/div/div[1]/div[2]/span[3]";
		WebElement elementPassengerMoreAdults = webdriver.findElement(By.xpath(xpathPassengerMoreAdults));
		elementPassengerMoreAdults.click();
		elementPassengerMoreAdults.click();
		
		String xpathChildrenUnder12Years = "/html/body/div[18]/div/div/div[2]/div[2]/span[3]";
		WebElement elementChildrenUnder12Years = webdriver.findElement(By.xpath(xpathChildrenUnder12Years));
		elementChildrenUnder12Years.click();
		
		String xpathInfantsUnder12Years = "/html/body/div[18]/div/div/div[3]/div[2]/span[3]";
		WebElement elementInfantsUnder12Years = webdriver.findElement(By.xpath(xpathInfantsUnder12Years));
		elementInfantsUnder12Years.click();
		
		String xpathBusinessClass = "//*[@id=\"flight_type__checkboxe823caac1a24a0172d4ee792e5dad7d9\"]";
		WebElement elementBusinessClass = webdriver.findElement(By.xpath(xpathBusinessClass));
		elementBusinessClass.click();
		
		String xpathButtonOk = "/html/body/div[18]/div/div/div[5]/div/div/span[1]";
		WebElement elementButtonOk = webdriver.findElement(By.xpath(xpathButtonOk));
		elementButtonOk.click();
	
		String xpathButtonSearch = "//*[@id=\"flights-form-e823caac1a24a0172d4ee792e5dad7d9\"]/div[6]/button";
		WebElement elementButtonSearch = webdriver.findElement(By.xpath(xpathButtonSearch));
		elementButtonSearch.click();
		
		

	}
}