package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RadioButtonsEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radios=block.findElements(By.tagName("input"));
		
		System.out.println(radios.size());
		for (int i = 0; i < radios.size(); i++) 
		{
			String name=radios.get(i).getAttribute("value");
			System.out.println(name);
			
			if (name.equalsIgnoreCase("milk"))
			{
				radios.get(i).click();
			}
			else if (name.equalsIgnoreCase("water")) 
			{
				radios.get(i).click();
			}
		}

	}

}
