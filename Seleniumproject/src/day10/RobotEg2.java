package day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RobotEg2 {

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		Sleeper.sleepTightInSeconds(3);	
		driver.findElement(By.id("photofile")).click();
		
		 StringSelection stringSelection = new StringSelection("C:\\Users\\Dell\\Pictures\\jira.png");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		 
		 Robot robot = new Robot();
			
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_CONTROL);
         Sleeper.sleepTightInSeconds(3);	
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
