package stepDef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Registration_stepDef 
{
	
	public WebDriver driver;

	@Given("Open Registration page")
	public void open_registration_page() 
	{
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}

	@When("User enters all details")
	public void user_enters_all_details(DataTable table) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<Map<String,String>> map = table.asMaps();
		System.out.println(map.get(0).get("fname"));
		
		driver.findElement(By.name("firstname")).sendKeys(map.get(0).get("fname"));
		driver.findElement(By.name("lastname")).sendKeys(map.get(0).get("lname"));
		driver.findElement(By.name("email")).sendKeys(map.get(0).get("email"));
		driver.findElement(By.name("telephone")).sendKeys(map.get(0).get("telephone"));
		driver.findElement(By.name("password")).sendKeys(map.get(0).get("password"));
		driver.findElement(By.name("confirm")).sendKeys(map.get(0).get("cpassword"));
	}

	@When("User click on newlatter as Yes")
	public void user_click_on_newlatter_as_yes() 
	{
	    driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
	}

	@When("User check the privacy policy")
	public void user_check_the_privacy_policy() 
	{
	    driver.findElement(By.xpath("(//input[@type='checkbox'])")).click();
	}

	@When("Click on continue button")
	public void click_on_continue_button() 
	{
	    driver.findElement(By.xpath("(//input[@value='Continue'])")).click();
	}

	@Then("User should register successfully")
	public void user_should_register_successfully() 
	{
	    String msg = driver.findElement(By.xpath("//div[@id='content']//h1")).getText();
	    Assert.assertEquals(msg, "Your Account Has Been Created!","TC is Failed as Description message is not Matching");
	    System.out.println("TC is Passed as Description message is Matching");
	}
	
}
