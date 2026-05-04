package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username_Field = By.id("user-name");
	By password_Field = By.id("password");
	By login_Button = By.id("login-button");
	
	public LoginPage(WebDriver driverX) {
		this.driver = driverX;
	}
	
	
	public void enterUserName(String usname) {
		 //driver.findElement(By.id("user-name")).sendKeys(usname);	
		 driver.findElement(username_Field).sendKeys(usname);
	}
	
	public void enterPassword(String psw) {
		 //driver.findElement(By.id("password")).sendKeys(psw);
		 driver.findElement(password_Field).sendKeys(psw);
	}
	
	public void clickLoginButton() {
		//driver.findElement(By.id("login-button")).click(); 
		 driver.findElement(login_Button).click();
	}
	
	public void userLogin(String usname, String psw) {
		driver.findElement(username_Field).sendKeys(usname);
		driver.findElement(password_Field).sendKeys(psw);
		driver.findElement(login_Button).click();
	}

}
