package cucupackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("user should be in log in page")
	public void user_should_be_in_log_in_page() {
		System.setProperty("webdriver,chromedriver","path/to/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("welcome to facebook");
		
	
	}

	@When("user should enter valid details")
	public void user_should_enter_valid_details() {
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("tanuja");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456trgh");
		System.out.println("you have entered valid credentials");
	    
	}

	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page()  {
	   driver.findElement(By.name("login")).click();//only name this
	   System.out.println("successfully logged in");
	  
	driver.quit();
	}


}