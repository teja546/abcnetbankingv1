package Try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesschrome {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C://Users//jagut//new downloads//chromedriver-win64//chromedriver.exe");
		
		ChromeOptions o = new ChromeOptions();
        
		o.addArguments("--headless");

		WebDriver d = new ChromeDriver(o);

		d.get("https://www.amazon.com/");
		
		System.out.println("title of the page:"+d.getTitle());
		
		
		
		  
	}

}
