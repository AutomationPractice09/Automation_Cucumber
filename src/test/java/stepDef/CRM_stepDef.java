package stepDef;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import utility.BrowserUtil;

public class CRM_stepDef 
{
	WebDriver driver;
	
	@Given("Open CRM Application")
	public void open_crm_application() 
	{
		driver = BrowserUtil.getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/");
	}

	@When("User Click on Sign In link")
	public void user_click_on_sign_in_link() 
	{
	    driver.findElement(By.id("SignIn")).click();
	}

	@Then("User should navigate to Sign In page")
	public void user_should_navigate_to_sign_in_page() 
	{
	    Assert.assertTrue(driver.getCurrentUrl().contains("login"),"TC is Failed as URL is not Matching");
	    System.out.println("TC is Passed as URL is Matching");
	}

	@Given("User navigate to SignIn page")
	public void user_navigate_to_sign_in_page() 
	{
		driver.findElement(By.id("SignIn")).click();
	}

	@When("User enter emailID and Password")
	public void user_enter_email_id_and_password() 
	{
	    driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("test@123");
	}

	@When("Click on Submit button")
	public void click_on_submit_button() 
	{
	    driver.findElement(By.id("submit-id")).click();
	}

	@Then("User should navigate to Customer Page")
	public void user_should_navigate_to_customer_page() 
	{
	    Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"TC is Failed as URL is not Matching");
	    System.out.println("TC is Passed as URL is Matching");
	}
}
