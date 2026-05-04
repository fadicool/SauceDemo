package stepDefinitions;

//import static org.testng.Assert.assertTrue;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;

public class POMLoginStepDef {
		
//	new DriverManger().SetUpDriver(new ChromeConfig());
//	ChromeOptions options = new ChromeOptions();
//	options.AddUserProfilePreference("profile.password_manager_leak_detection", false);
//	options.addArguments("profile.password_manager_leak_detection", false);
	
//	WebDriverManager.firefoxdriver().setup();
//	WebDriverManager.edgedriver().setup();
//	WebDriverManager.safaridriver().setup();
	
    //WebDriverManager.chromedriver().setup();
	// Automatically sets up the driver AND returns a new ChromeDriver instance
	WebDriver driver = WebDriverManager.chromedriver().create();
	
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--start-maximized");
//	options.addArguments("--incognito");
	
	//WebDriver driver = new ChromeDriver(options);
	//WebDriver driver = new ChromeDriver();
	
	LoginPage loginpage = new LoginPage(driver);
	HomePage homepage = new HomePage(driver);

@Given("I am on the Login page of the Sauce App")
public void i_am_on_the_login_page_of_the_sauce_app() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.saucedemo.com/");
}

@When("I enter valid username and password")
public void i_enter_valid_username_and_password() {
	loginpage.enterUserName("standard_user");
	loginpage.enterPassword("secret_sauce");
}

@When("I enter valid {string} and {string}")
public void i_enter_valid_and(String usname, String psw) {
	loginpage.enterUserName(usname);
	loginpage.enterPassword(psw);
}

@And("I click the login button")
public void i_click_the_login_button() {
	loginpage.clickLoginButton();
}

@Then("I should be taken to the Home Page")
public void i_should_be_taken_to_the_home_page() {
	homepage.validateHomePage();
}
	

}
