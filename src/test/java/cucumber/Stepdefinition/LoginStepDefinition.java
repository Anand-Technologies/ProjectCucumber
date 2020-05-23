package cucumber.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {

	static WebDriver driver;
	@Given("^User is on Flipkart login page$")
	public void user_is_on_Flipkart_login_page() {
	   WebDriverManager.chromedriver().version("79").setup();
	   driver = new ChromeDriver();
	   driver.get("https://www.facebook.com");
	}

	@When("^user enter the username and password$")
	public void user_enter_the_username_and_password() throws InterruptedException {
	 WebElement email = driver.findElement(By.id("email"));
	 email.sendKeys("anandtesting45@gmail.com");
	 WebElement pass = driver.findElement(By.id("pass"));
	 pass.sendKeys("333999");
	}
	

	@Then("^user click the Login button$")
	public void user_click_the_Login_button() {
	   driver.findElement(By.id("u_0_b")).click();
	}
}
