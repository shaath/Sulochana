package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridEg 
{
	@Parameters({"browser","plotform"})
	@Test
	public void g(String br, String pt) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		if (br.equalsIgnoreCase("firefox") && pt.equalsIgnoreCase("windows"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (br.equalsIgnoreCase("chrome") && pt.equalsIgnoreCase("windows"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
		}
//		DesiredCapabilities cap=DesiredCapabilities.firefox();
//		cap.setPlatform(Platform.WINDOWS);
		
//		DesiredCapabilities cap=DesiredCapabilities.chrome();
//		cap.setPlatform(Platform.WINDOWS);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.3:4444/wd/hub"), cap);
	
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();

//		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
	}

}
