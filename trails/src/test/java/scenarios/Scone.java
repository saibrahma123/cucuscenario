package scenarios;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scone 
{
	WebDriver driver;
	@Given("url of TestMeApp {string}")
	public void url_of_TestMeApp(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String chromePath = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium Workspace\\JAR\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromePath);
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
		//Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		//Assert.assertTrue(driver.findElement(By.linkText("Log in")).isDisplayed());
	}

	@When("user clicks on signup button")
	public void user_clicks_on_signup_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("user types {string} as username")
	public void user_types_as_username(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("user types {string} as firstname")
	public void user_types_as_firstname(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("firstName")).sendKeys(string);
	}

	@When("user types {string} as lastname")
	public void user_types_as_lastname(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("lastName")).sendKeys(string);
	}

	@When("user types {string} as password")
	public void user_types_as_password(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("user types {string} as confirmpassword")
	public void user_types_as_confirmpassword(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("pass_confirmation")).sendKeys(string);
	}

	@When("user selects male as gender")
	public void user_selects_male_as_gender() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.cssSelector("input[value=\'Female\']")).click();
		//driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
	}

	@When("user types {string} as emailid")
	public void user_types_as_emailid(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("emailAddress")).sendKeys(string);
	}
	@When("user types {string} as mobilenumber")
	public void user_types_as_mobilenumber(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
	}

	@When("user types {string} dateofbirth")
	public void user_types_dateofbirth(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("dob")).sendKeys(string);
	}

	@When("user types {string} as address")
	public void user_types_as_address(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("address")).sendKeys(string);
	}

	@When("user selects the security question")
	public void user_selects_the_security_question() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Select sel=new Select(driver.findElement(By.name("securityQuestion")));
		sel.selectByIndex(1);
		
	}

	@When("user enter {string} as security answer")
	public void user_enter_as_security_answer(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("answer")).sendKeys(string);
	}

	@Then("user clicks on register button")
	public void user_clicks_on_register_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Submit")).click();
	}

}
