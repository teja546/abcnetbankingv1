package Try;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozilaFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","C://Users//jagut//geckodriver.exe");
		
		//FirefoxDriver d = new FirefoxDriver();
		
		WebDriver d = new FirefoxDriver();
		
		d.get("https://www.amazon.com/");
		
		d.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[10]")).click();
		
		
		d.close();

	}

}
