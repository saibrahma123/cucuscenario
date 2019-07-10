package scenarios;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scthree 
{ 
	WebDriver driver;
	@Given("url of test {string}")
	public void url_of_test(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String cPath = "C:\\\\\\\\Users\\\\\\\\a07208trng_b4a.04.26\\\\\\\\Desktop\\\\\\\\Selenium Workspace\\\\\\\\JAR\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", cPath);
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	}

	@When("ram clicks on signin button")
	public void ram_clicks_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("ram enters {string} as username")
	public void ram_enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("ram enter {string} as password")
	public void ram_enter_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("ram clicks on login button")
	public void ram_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
	}

	@When("ram enters {string} in the search bar")
	public void ram_enters_in_the_search_bar(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("myInput")).sendKeys(string);
	}

	@When("ram clicks on finddetails button")
	public void ram_clicks_on_finddetails_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.findElement(By.name("val")).click();
				driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("ram clicks on addtocard button")
	public void ram_clicks_on_addtocard_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@When("ram clicks on cart button")
	public void ram_clicks_on_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	}

	@When("ram clicks on checkout buton")
	public void ram_clicks_on_checkout_buton() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	}

	@When("ram clicks on procedtopay button")
	public void ram_clicks_on_procedtopay_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	}

	@When("ram selects type of bank")
	public void ram_selects_type_of_bank() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//label[contains(text(),'IndusInd Bank')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'IDBI Bank')]")).click();
	}

	@When("ram clicks on continue button")
	public void ram_clicks_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	}

	@When("ram enter {string} as user")
	public void ram_enter_as_user(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys(string);
	}

	@When("ram enter {string} as pwd")
	public void ram_enter_as_pwd(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys(string);
	}

	@When("ram clicks on logon button")
	public void ram_clicks_on_logon_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	}

	@When("ram enter {string} as transactionid")
	public void ram_enter_as_transactionid(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("transpwd")).sendKeys(string);
	}

	@When("ram clicks on paynow")
	public void ram_clicks_on_paynow() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	}

	@Then("ram check for order details page")
	public void ram_check_for_order_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Assert.assertEquals("Order Details", driver.getTitle());
	}




}
