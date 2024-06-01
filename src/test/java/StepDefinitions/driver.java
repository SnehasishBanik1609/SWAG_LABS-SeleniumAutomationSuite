package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ObjectRepository.SwagLabsOR;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.ProductsPage;

public class driver {

	static WebDriver driver = null;
	
	public static void main(String args[]) {
		
		/**
		 * 	Functionality: Test SWAGLABS Application
		 * 		STEP 1: Login as a standard user.
		 * 		STEP 2: Sort the product list by price from low to high.
		 * 		STEP 3: Add the top 3 products to the cart.
		 * 		STEP 4: Go To the cart and proceed to checkout successfully.
		 * 		STEP 5: Logout from the application.
		 */
		
		/*
		 * Test Data Required:
		 * 		Application URL | username | password | Product sorting option | user-details to checkout
		 */
		String applicationURL = "https://www.saucedemo.com/v1/";
		String username = "standard_user";
		String password = "secret_sauce";
		String productSortingOption = "Price (low to high)";
		String user_FirstName = "Snehasish";
		String user_LastName = "Banik";
		String user_PostalCode = "700118";
		
		System.out.println("|| -TEST DATA- ||");
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println("productSortingOption: " + productSortingOption);
		System.out.println("user's First Name: " + user_FirstName);
		System.out.println("user's Last Name: " + user_LastName);
		System.out.println("user's Postal Code: " + user_LastName);
		System.out.println();
		
		// Page Objects
		LoginPage _user = new LoginPage();
		ProductsPage _product = new ProductsPage();
		CheckoutPage _checkOut = new CheckoutPage();
		LogoutPage _logout = new LogoutPage();
		
		// Configure and Launch Chrome Driver
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is: "+projectPath);
		System.getProperty("webdriver.chrome.driver", projectPath+"/src/main/resources/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(applicationURL);
		System.out.println("Hit URL -> " + applicationURL);
		System.out.println("User is on Login page");
		
		
		/**
		 * --BEGIN TEST
		 */
		
		_user.userLogin(driver, username, password);
		
		_product.sortProductList(driver, productSortingOption);
		_product.addTopThreeProductsToCart(driver);
		_product.goToCart(driver);
		
		_checkOut.checkOutCart(driver);
		_checkOut.enterCheckoutInfo(driver, user_FirstName, user_LastName, user_PostalCode);
		_checkOut.checkoutOverview(driver);
		_checkOut.verifySuccessfulCheckout(driver);
		
		_logout.logoutApplication(driver);
		
		/**
		 * --END TEST
		 */
		
		driver.close();
	
	} // END OF MAIN


} // END OF CLASS
