package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class ThemeForest_stepDef 
{
	
	WebDriver driver;
	
	@Given("Open ThemeForest application")
	public void open_theme_forest_application() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://themeforest.net/category/ecommerce");
	}

	@When("User get the title of Fomepage")
	public void user_get_the_title_of_fomepage() 
	{
		System.out.println(driver.getTitle());
	}

	@Then("Title of Fome page should be matched")
	public void title_of_fome_page_should_be_matched() 
	{
		Assert.assertTrue(driver.getTitle().contains("eCommerce"),"TC is Failed as Title is not Matched");
		System.out.println("TC is Passed as Title is Matched");
	}

	@When("User Open the Code page")
	public void user_open_the_code_page() 
	{
		driver.findElement(By.xpath("//a[text()='Code']")).click();
	}

	@When("User get the title of Code page")
	public void user_get_the_title_of_code_page() 
	{
		System.out.println(driver.getTitle());
	}

	@Then("Title of Code page should be matched")
	public void title_of_code_page_should_be_matched() 
	{
		Assert.assertTrue(driver.getTitle().contains("Code"),"TC is Failed as Title is not Matched");
		System.out.println("TC is Passed as Title is Matched");
	}

	@When("User Open the Video page")
	public void user_open_the_video_page() 
	{
		driver.findElement(By.xpath("//a[text()='Video']")).click();
	}

	@When("User get the title of Video page")
	public void user_get_the_title_of_video_page() 
	{
		System.out.println(driver.getTitle());
	}

	@Then("Title of Mobile page Video be matched")
	public void title_of_mobile_page_video_be_matched() 
	{
		Assert.assertTrue(driver.getTitle().contains("Video"),"TC is Failed as Title is not Matched");
		System.out.println("TC is Passed as Title is Matched");
	}

	@When("User Open the Audio page")
	public void user_open_the_audio_page() 
	{
		driver.findElement(By.xpath("//a[text()='Audio']")).click();
	}

	@When("User get the title of Audio page")
	public void user_get_the_title_of_audio_page() 
	{
		System.out.println(driver.getTitle());
	}

	@Then("Title of Audio page should be matched")
	public void title_of_audio_page_should_be_matched() 
	{
		Assert.assertTrue(driver.getTitle().contains("Audio"),"TC is Failed as Title is not Matched");
		System.out.println("TC is Passed as Title is Matched");
	}

}
