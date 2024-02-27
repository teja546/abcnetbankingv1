package Try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFireFox {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.firefox.marionette","C://Users//jagut//Downloads//geckodriver-v0.33.0-win64//geckodriver.exe");
			
			FirefoxOptions fo = new FirefoxOptions();
	        
			fo.addArguments("--headless");

			WebDriver d = new FirefoxDriver(fo);

			d.get("https://www.amazon.com/");
			
			System.out.println("title of the page:"+d.getTitle());

	}

}
