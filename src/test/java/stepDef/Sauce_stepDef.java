package stepDef;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class Sauce_stepDef 
{
	WebDriver driver;
	
	@Given("Open Sauce Demo Application")
	public void open_sauce_demo_application() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String un, String pwd) 
	{
	    driver.findElement(By.id("user-name")).sendKeys(un);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on login button")
	public void click_on_login_button() 
	{
		driver.findElement(By.id("login-button")).click();
	}

	@Then("Valid user should be login")
	public void valid_user_should_be_login() 
	{
	    Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"TC is Failed as URL is not matching");
	    System.out.println("TC is Passed as URL is Matching");
	}

}
