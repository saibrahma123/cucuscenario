package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scfour 
{
	WebDriver driver;
	@Given("url is {string}")
	public void url_is(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String chPath = "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\a07208trng_b4a.04.26\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Selenium Workspace\\\\\\\\\\\\\\\\JAR\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chPath);
		driver = new ChromeDriver();
		driver.get(string);
	}

	@When("akhi goes on signin button")
	public void akhi_goes_on_signin_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("akhi types {string} as usernam")
	public void akhi_types_as_usernam(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("akhi types {string} as pasword")
	public void akhi_types_as_pasword(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("akhi click on login button")
	public void akhi_click_on_login_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
	}

	@When("akhi types {string} in searchbarr")
	public void akhi_types_in_searchbarr(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("myInput")).sendKeys(string);
	}

	@When("akhi click on finddetails button")
	public void akhi_click_on_finddetails_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("akhi finds for cart symbol")
	public void akhi_finds_for_cart_symbol() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}


}
