package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		WebElement milk=driver.findElement(By.name("option3"));
		
		if (!milk.isSelected()) 
		{
			milk.click();
		}

	}

}
