package stepDef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class Google_stepDef {
	WebDriver driver;
	String title;

	@Given("Open Google Application")
	public void open_google_application() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
	}

	@When("User get Actual title")
	public void user_get_actual_title() 
	{
		title = driver.getTitle();
		System.out.println("Actual Title is: " + title);
	}

	@Then("Title should match with Google")
	public void title_should_match_with_google() 
	{
		Assert.assertEquals(title, "Google", "TC is Failed as Title is not Matching");
		System.out.println("TC is Passed");
	}

	@When("User search with valid keyword {string}")
	public void user_search_with_valid_keyword(String keyword) 
	{
		driver.findElement(By.id("APjFqb")).sendKeys(keyword);
	}

	@Then("User should get valid search results")
	public void user_should_get_valid_search_results() 
	{
		List<WebElement> values = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		for(WebElement i : values)
		{
			System.out.println(i.getText());
		}
	}
}
