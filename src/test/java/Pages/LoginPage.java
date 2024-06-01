package Pages;

import org.openqa.selenium.WebElement;

import ObjectRepository.SwagLabsOR;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public void userLogin(WebDriver driver, String username, String password) {
		
		System.out.println("|| Login Page ||");
		
		WebElement elm_username = driver.findElement(SwagLabsOR.USERNAME);
		WebElement elm_password = driver.findElement(SwagLabsOR.PASSWORD);
		WebElement elm_loginButton = driver.findElement(SwagLabsOR.LOGIN_BUTTON);
		
		//Assertions
		Assert.assertTrue("[ERROR]: username field is NOT enabled!", elm_username.isEnabled());
		Assert.assertTrue("[ERROR]: password field is NOT enabled!", elm_password.isEnabled());
		Assert.assertTrue("[ERROR]: login button is NOT enabled!", elm_password.isEnabled());
		
		System.out.println("Entering Username...");
		elm_username.sendKeys(username);
		System.out.println("Entered!");
		System.out.println("Entering Password...");
		elm_password.sendKeys(password);
		System.out.println("Entered!");
		System.out.println("Clicking on Login Button...");
		elm_loginButton.click();
		System.out.println("Clicked!");
		System.out.println("Landed on Products Page!!");
		System.out.println("\n" + "|| Exit ||" + "\n");
	}
	
}
