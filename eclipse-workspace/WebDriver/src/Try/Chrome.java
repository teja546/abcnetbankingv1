package Try;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		
		

	     // System.setProperty("webdriver.chrome.driver","C:/Users/jagut/Downloads/chromedriverwin64/chromedriver-win64/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/jagut/chromedriver.exe");
	      //"C://Users//jagut//chrome//chrome-win64//chrome_proxy.exe"
			WebDriver d = new ChromeDriver();
			
		//d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//it is written when we get websocket error
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.name("email")).sendKeys("teja");
		d.findElement(By.name("pass")).sendKeys("132334");
		
		d.close();

	}

}
