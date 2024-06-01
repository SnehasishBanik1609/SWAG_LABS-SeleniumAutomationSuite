package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ObjectRepository.SwagLabsOR;

public class ProductsPage {

	public void sortProductList(WebDriver driver, String option) {
		
		System.out.println("|| Products Page ||");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement dropdownElm = driver.findElement(SwagLabsOR.SORT_PRODUCT);
		Assert.assertTrue("[ERROR]: Dropdown is NOT enabled!", dropdownElm.isEnabled());
		Select dropdown = new Select(dropdownElm);
		System.out.println("Selecting dropdown...");
		dropdown.selectByVisibleText(option);
		System.out.println("Selected!!");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	}
	
	public void addTopThreeProductsToCart(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		List<WebElement> items = driver.findElements(SwagLabsOR.INVENTORY_ITEMS);
		List<WebElement> buttons = driver.findElements(SwagLabsOR.ADD_TO_CART_BUTTONS);
		for(int i = 0; i < Math.min(items.size(), 3); i++) 
		{
			if(!buttons.isEmpty()) {
				WebElement iTH_button = buttons.get(i);
				Assert.assertTrue("[ERROR]: Button NOT enabled!", iTH_button.isDisplayed());
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				System.out.println("Clicking on ADD TO CART button "+(i+1));
				iTH_button.click();
				System.out.println("Clicked!!");
			}
			else {
				Assert.fail("ADD TO CART, button NOT found..!");
			}
		}
		System.out.println();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	}
	
	public void goToCart(WebDriver driver) {
		
		WebElement cart = driver.findElement(SwagLabsOR.CART_ON_TOP);
		Assert.assertTrue("[ERROR]: Top Cart NOT enabled!", cart.isEnabled());
		System.out.println("Clicking on Cart on Top...");
		cart.click();
		System.out.println("Clicked!");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		System.out.println("\n" + "|| Exit ||" + "\n");
	}
	
	

	
	
}
