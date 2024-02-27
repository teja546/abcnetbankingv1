package Try;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
	
		 System.setProperty("webdriver.firefox.marionette","C://Users//jagut//Downloads//geckodriver-v0.33.0-win64//geckodriver.exe");
			
			
			WebDriver d = new FirefoxDriver();
			
			d.get("https://testautomationpractice.blogspot.com/");
			
			WebElement name = d.findElement(By.xpath("//*[@id=\"name\"]"));//storing an element in a string
			WebElement email = d.findElement(By.xpath("//*[@id=\"email\"]"));
			 
			 //to check whether these 2 buttons is displayed or not
			 //to check the element enabled or disabled
			 
			  if(name.isDisplayed()&& name.isEnabled())
			 {
				name.sendKeys("tej@gmail");
			 }

			 if(email.isDisplayed() && email.isEnabled())
			 {
				email.sendKeys("123bc");
			 }
			 
			 //is selected is used to select the radio buttons 
			 
			//male
			 System.out.println(d.findElement(By.xpath("//*[@id=\"male\"]")).isSelected());
			 
			//female
			 System.out.println(d.findElement(By.xpath("//*[@id=\"female\"]")).isSelected());
			 
			 if(d.findElement(By.xpath("//*[@id=\"female\"]")).isSelected()==false)
			 {
				 d.findElement(By.xpath("//*[@id=\"female\"]")).click();
			 }
	}

}
