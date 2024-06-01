package Pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ObjectRepository.SwagLabsOR;

public class CheckoutPage {

	
	public void checkOutCart(WebDriver driver) {
		
		System.out.println("|| Checkout Page ||");
		WebElement checkoutBtn = driver.findElement(SwagLabsOR.CHECKOUT_BTN);
		Assert.assertTrue("[ERROR]: Checkout button is NOT enabled!", checkoutBtn.isEnabled());
		System.out.println("Clicking on Checkout button...");
		checkoutBtn.click();
		System.out.println("Clicked!!");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	public void enterCheckoutInfo(WebDriver driver, String firstName, String lastName, String postalCode) {
		
		WebElement fName = driver.findElement(SwagLabsOR.FIRSTNAME);
		WebElement lName = driver.findElement(SwagLabsOR.LASTNAME);
		WebElement zipcode = driver.findElement(SwagLabsOR.POSTALCODE);
		WebElement continue_btn = driver.findElement(SwagLabsOR.CONTINUE_BTN);
		
		//Assertion
		Assert.assertTrue("[ERROR]: First Name input field is NOT enabled!", fName.isEnabled());
		Assert.assertTrue("[ERROR]: Last Name input field is NOT enabled!", lName.isEnabled());
		Assert.assertTrue("[ERROR]: Postal code input field is NOT enabled!", zipcode.isEnabled());
		Assert.assertTrue("[ERROR]: Continue button is NOT enabled!", continue_btn.isEnabled());
		
		System.out.println("Entering first Name...");
		fName.sendKeys(firstName);
		System.out.println("Entered!");
		System.out.println("Entering last Name...");
		lName.sendKeys(lastName);
		System.out.println("Entered!");
		System.out.println("Entering postal code...");
		zipcode.sendKeys(postalCode);
		System.out.println("Entered!");
		System.out.println("Clicking on CONTINUE button...");
		continue_btn.click();
		System.out.println("Clicked!");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	}
	
	public void checkoutOverview(WebDriver driver) {
		
		WebElement finish_btn = driver.findElement(SwagLabsOR.FINISH_BTN);
		Assert.assertTrue("[ERROR]: Finish button is NOT enabled!", finish_btn.isEnabled());
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("argument[0].scrollIntoView(true);", finish_btn);
		
		System.out.println("Clicking on FINISH button...");
		finish_btn.click();
		System.out.println("Clicked!");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	public void verifySuccessfulCheckout(WebDriver driver) {
		
		WebElement ack = driver.findElement(SwagLabsOR.ACKNOWLEDGEMENT);
		System.out.println("Verifying acknowledgement message and checking out!!");
		Assert.assertTrue("[ERROR]: Acknowledgement Messaege NOT displayed!", ack.isDisplayed());
		System.out.println("Acknowledgement verified...Successfully checked out!!");
		System.out.println("\n" + "|| Exit ||" + "\n");
		
	}
	
	
}
