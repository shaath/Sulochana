package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class GmailLoginEg {

	public static void main(String[] args) 
	{
		//Launching Firefox
		WebDriver driver=new FirefoxDriver();
		//Opens Gmail 
		driver.get("http://gmail.com");
		//Maximize the window
		driver.manage().window().maximize();
//		Identifying the element
		WebElement email=driver.findElement(By.id("identifierId"));
		//Enter Email id into email textbox
		email.sendKeys("testingtoolstrainer449");
		
//		email.clear();
		//Clicking on next button
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		//Entering the password
		driver.findElement(By.cssSelector(".whsOnd.zHQkBf")).sendKeys("123456789");
		//clicking on next button
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		
	}

}
