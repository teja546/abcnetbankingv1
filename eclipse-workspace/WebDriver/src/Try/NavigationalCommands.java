package Try;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationalCommands {

	public static void main(String[] args) {

    System.setProperty("webdriver.firefox.marionette","C://Users//jagut//Downloads//geckodriver-v0.33.0-win64//geckodriver.exe");
		
		
		WebDriver d = new FirefoxDriver();
		
		d.get("https://demo.automationtesting.in/Windows.html");
		System.out.println(d.getTitle());
		
		//d.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		d.navigate().to("https://www.facebook.com/");
		System.out.println(d.getTitle());
		
		d.navigate().back();
		System.out.println(d.getTitle());
		
		d.navigate().forward();
		System.out.println(d.getTitle());
		
		//d.close();//close only one tab
		
		d.navigate().refresh();
		
		d.quit();//will close all tabs
		
		
		
		
		

	}

}
