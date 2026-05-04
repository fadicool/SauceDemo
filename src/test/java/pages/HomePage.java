package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;

	By homePageHeader = By.className("shopping_cart_link");
	By errorMessageButton = By.className("error-button");
	
	
	public HomePage(WebDriver driverX) {
		this.driver = driverX;
	}
	
	public void validateHomePageX() {
		//WebElement element = driver.findElement(errorMessageButton);
		
		if(driver.findElement(errorMessageButton).isDisplayed()) {
		    //Pass
			System.out.println("Sorry your Login credentials are INCORRECT. Please TRY AGAIN");
		   // System.out.println("You have successfully LOGGED in");
			driver.findElement(errorMessageButton).click();
		    driver.close();
		}
		else {
		    //Fail
			  System.out.println("You have successfully LOGGED in");
		    //System.out.println("Sorry your Login credentials are INCORRECT. Please TRY AGAIN");
		    driver.close();
		}
			
	}
	
	public void validateHomePage() {
		 driver.close();
	}
	
}
