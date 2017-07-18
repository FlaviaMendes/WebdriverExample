package phptravels.test;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOpenWithFirefox {
	
	private FirefoxDriver wedriver;

	@Test
	public void changeLanguage(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\EstudoFlavia\\geckodriver.exe");
		
		wedriver = new FirefoxDriver();
		wedriver.get("http://www.phptravels.net/");
		
	}

}
