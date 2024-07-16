package appHooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.*;
import utility.BrowserUtil;

public class CrmHooks 
{
	public WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = BrowserUtil.setDriver("chrome");
	}
	
	@After
	public void tearDown()
	{
		BrowserUtil.getDriver().quit();
	}

}
