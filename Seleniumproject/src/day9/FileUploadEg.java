package day9;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileUploadEg {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("photofile")).click();
		Sleeper.sleepTightInSeconds(3);
		
//		driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\Dell\\Pictures\\jira.png");
//		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\FileUploadEg.exe");
		
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\FileuploadEg1.exe");
	}

}
