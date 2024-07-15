package stepDef;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class Amazon_stepDef 
{
	
	WebDriver driver;
	
	@Given("Open Amazon application")
	public void open_amazon_application() 
	{
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://amazon.com");
	}

	@When("User get the title of Homepage")
	public void user_get_the_title_of_homepage() 
	{
		System.out.println(driver.getTitle());
	}

	@Then("Title of home page should be matched")
	public void title_of_home_page_should_be_matched() 
	{
		Assert.assertTrue(driver.getTitle().contains("Spend less"),"TC is Failed as Title is not Matched");
		System.out.println("TC is Passed as Title is Matched");	
	}

	@When("User Open the BestSellers page")
	public void user_open_the_best_sellers_page() 
	{
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
	}

	@When("User get the title of BestSeller page")
	public void user_get_the_title_of_best_seller_page() 
	{
		System.out.println(driver.getTitle());
	}

	@Then("Title of BestSellers page should be matched")
	public void title_of_best_sellers_page_should_be_matched() 
	{
		Assert.assertTrue(driver.getTitle().contains("Bestsellers"),"TC is Failed as Title is not Matched");
		System.out.println("TC is Passed as Title is Matched");
	}

	@When("User Open the Mobile page")
	public void user_open_the_mobile_page() 
	{
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	}

	@When("User get the title of Mobile page")
	public void user_get_the_title_of_mobile_page() 
	{
		System.out.println(driver.getTitle());
	}

	@Then("Title of Mobile page should be matched")
	public void title_of_mobile_page_should_be_matched() 
	{
		Assert.assertTrue(driver.getTitle().contains("Mobile"),"TC is Failed as Title is not Matched");
		System.out.println("TC is Passed as Title is Matched");
	}

	@When("User Open the Fashion page")
	public void user_open_the_fashion_page() 
	{
		driver.findElement(By.xpath("//a[text()='Fashion']")).click();
	}

	@When("User get the title of Fashion page")
	public void user_get_the_title_of_fashion_page() 
	{
		System.out.println(driver.getTitle());
	}

	@Then("Title of Fashion page should be matched")
	public void title_of_fashion_page_should_be_matched() 
	{
		Assert.assertTrue(driver.getTitle().contains("Fashion"),"TC is Failed as Title is not Matched");
		System.out.println("TC is Passed as Title is Matched");
	}

}
