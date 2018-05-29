package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimusbankLogin 
{
	public static WebDriver driver;
	public static String expval,actval;
	@BeforeClass
	public void LaunchBr()
	{
		driver=new FirefoxDriver();
	}
	
	@BeforeMethod
	public void LaunchApp()
	{
		expval="login";
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		actval=driver.findElement(By.id("login")).getAttribute("name");
		Assert.assertEquals(actval, expval, "Launch Failed");
		
	}
	@Test
	public void Login()
	{
		expval="Welcome to Admin";
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		actval=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		Assert.assertEquals(actval, expval, "Login Failed");
	}
	@AfterMethod
	public void Logout()
	{
		expval="login";
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		actval=driver.findElement(By.id("login")).getAttribute("name");
		Assert.assertEquals(actval, expval, "Logout Failed");
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
