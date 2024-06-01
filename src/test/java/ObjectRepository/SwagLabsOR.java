package ObjectRepository;

import org.openqa.selenium.By;

public class SwagLabsOR {

	//	LOGIN PAGE
	public static final By USERNAME = By.id("user-name");
	public static final By PASSWORD = By.id("password");
	public static final By LOGIN_BUTTON = By.id("login-button");
	
	// PRODUCTS PAGE
	public static final By SORT_PRODUCT = By.className("product_sort_container");
	public static final By INVENTORY_ITEMS = By.className("inventory_item");
	public static final By ADD_TO_CART_BUTTONS = By.xpath("//button[contains(text(),'ADD TO CART')]");
	public static final By CART_ON_TOP = By.cssSelector("path[fill='currentColor']");
	public static final By CHECKOUT_BTN = By.cssSelector("a.btn_action.checkout_button");
	
	// CHECKOUT PAGE
	public static final By FIRSTNAME = By.id("first-name");
	public static final By LASTNAME = By.id("last-name");
	public static final By POSTALCODE = By.id("postal-code");
	public static final By CONTINUE_BTN = By.cssSelector("input.btn_primary.cart_button");
	public static final By FINISH_BTN = By.cssSelector("a.btn_action.cart_button");
	public static final By ACKNOWLEDGEMENT = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");
	
	// LOGOUT PAGE
	public static final By BURGER_BTN = By.xpath("//div[@class='bm-burger-button']//following-sibling::button");
	public static final By LOGOUT_SIDEBAR = By.id("logout_sidebar_link");
	
	
	
	
}
