package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class CartLogin_stepDef 
{
	WebDriver driver;
	
	@Given("Open cartLogin page")
	public void open_cart_login_page() 
	{
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("User enter email {string} and password {string}")
	public void user_enter_email_and_password(String email, String pwd) 
	{
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("User enter login button")
	public void user_enter_login_button() 
	{
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User should successfully logged in.")
	public void user_should_successfully_logged_in() 
	{
	    System.out.println("Login done successfully");
	}

}
