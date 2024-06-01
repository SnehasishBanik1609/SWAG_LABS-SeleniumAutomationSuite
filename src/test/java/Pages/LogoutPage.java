package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ObjectRepository.SwagLabsOR;

public class LogoutPage {

	
	public void logoutApplication(WebDriver driver) {
		
		System.out.println("|| Logging Out Application ||");
		WebElement sidebarMenu = driver.findElement(SwagLabsOR.BURGER_BTN);
		WebElement logout = driver.findElement(SwagLabsOR.LOGOUT_SIDEBAR);
		System.out.println("Clicking on sidebar menu...");
		Assert.assertTrue("[ERROR]: Sidebar menu is disabled!", sidebarMenu.isEnabled());
		sidebarMenu.click();
		System.out.println("Clicked!");
		System.out.println("Clicking on logout link...");
		Assert.assertTrue("[ERROR]: Logout link is disabled!", logout.isEnabled());
		logout.click();
		System.out.println("Clicked!");
		System.out.println("\n" + "|| Logged Out ||" + "\n");
	}
	
	
	
}
