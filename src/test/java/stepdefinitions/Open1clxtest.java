package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Open1clxtest 
{
     public static WebDriver driver;
     
	@Given("the user enters the url in browser")
	public void the_user_enters_the_url_in_browser() 
	
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.1clxlite.com");
		
	}
	
	@SuppressWarnings("deprecation")
	@Then("the user sees the homepage of the site")
	public void the_user_sees_the_homepage_of_the_site() 
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
}
