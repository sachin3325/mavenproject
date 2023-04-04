package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Maret_Sigin_Testing 
{
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	
	
	@Given("the user enters sigin page by clicking SignIn Buttton")
	public void the_user_enters_sigin_page_by_clicking_sign_in_buttton() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://maret.1clx.in/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement signinbtn=driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
		signinbtn.click();
		
		
	}

	@When("the user enters the {string}  and {string}")
	public void the_user_enters_the_and(String string, String string2) throws InterruptedException 
	{
		WebElement enterusername=driver.findElement(By.xpath("//input[@id='email']"));
		enterusername.sendKeys(string);
		Thread.sleep(3000);
		WebElement enterpass=driver.findElement(By.xpath("//input[@id='password']"));
		enterpass.sendKeys(string2);
		Thread.sleep(3000);

	}

	@Then("the User clicks the Login button")
	public void the_user_clicks_the_login_button() 
	{
		WebElement loginbtn=driver.findElement(By.xpath("//body/div[@id='app']/main[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]"));
		loginbtn.click();

	}

	@Then("User gets the results depends upon the credentials")
	public void user_gets_the_results_depends_upon_the_credentials() throws InterruptedException
	{
		
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//a[@id='logout-icon']"));
		logout.click();	
	  
	}

}
