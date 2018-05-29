package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpregTest extends TestNGMaster
{
	@Test(dataProvider="data")
	public void empreg(String f,String l, String Eid)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).sendKeys(Eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval,"Empreg Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x=new Object[3][3];
		
		x[0][0]="Vignan";
		x[0][1]="Kumar";
		x[0][2]="V1234";
		
		x[1][0]="Sandeep";
		x[1][1]="Kumar";
		x[1][2]="V1235";
		
		x[2][0]="Nishwanth";
		x[2][1]="Gande";
		x[2][2]="V1236";
		
		return x;
	}
}
