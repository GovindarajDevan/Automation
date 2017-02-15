package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest1 
{
	abstract public class BaseTest
	{
	public WebDriver driver;
	@BeforeMethod
		public void preCondition(){
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitluwait(10,timeunits.SECONDS);
		}
		@AfterMethod
		public void postCondition(){
		driver.close();
		}
	}
}
