package scenarios;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sctwo 
{
	WebDriver driver;
	@Given("url of TestMe {string}")
	public void url_of_TestMe(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String chromePath = "C:\\\\Users\\\\a07208trng_b4a.04.26\\\\Desktop\\\\Selenium Workspace\\\\JAR\\\\chromedriver_win32\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromePath);
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
		
	}

	@When("userone moves to signin button")
	public void userone_moves_to_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("userone writes {string} as username")
	public void userone_writes_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("userone writes {string} as password")
	public void userone_writes_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("userone moves on login button")
	public void userone_moves_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).isDisplayed());
	}


}
