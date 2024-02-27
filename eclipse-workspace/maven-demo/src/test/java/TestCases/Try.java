package TestCases;
	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Try {
		
		WebDriver driver;
		
		@Test(priority=1)
		void setup() throws MalformedURLException {
			//String nodeURL = "http://10.237.187.29:4444/wd/hub";
			
			ChromeOptions options = new ChromeOptions();
			options.setCapability("browserName", "chrome");
			options.setCapability("platform", Platform.WIN10);
			
			//System.setProperty("webdriver.chrome.driver", "C:/Users/jagut/Downloads/chromedriverwin64/chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:/Users/jagut/chromedriver.exe");
			
			WebDriverManager.chromedriver().setup();
			
			// driver = new ChromeDriver();
			
			 driver = new RemoteWebDriver(new URL("http://10.237.187.29:4444/wd/hub"),options);
			
			 driver.get("https://demo.automationtesting.in/Register.html");
			 
			 driver.quit();
		

}
}