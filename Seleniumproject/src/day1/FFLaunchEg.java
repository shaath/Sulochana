package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FFLaunchEg {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		
		
	}

}
