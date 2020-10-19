package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.productStore.utilities.DriverClass;

public class DemoApplicationPage extends DriverClass {

	By homePage = By.id("nava");
	By placeOrder = By.id("orderModal");
	By name = By.xpath("//*[@id='orderModal']//input[@id='name']");
	By country = By.xpath("//*[@id='orderModal']//input[@id='country']");
	By city = By.xpath("//*[@id='orderModal']//input[@id='city']");
	By card = By.xpath("//*[@id='orderModal']//input[@id='card']");
	By month = By.xpath("//*[@id='orderModal']//input[@id='month']");
	By year = By.xpath("//*[@id='orderModal']//input[@id='year']");
	By cartAmount = By.id("totalp");
	By successPlaceholder = By.className("sa-placeholder");
	By messageBox = By.xpath("//*[contains(@class,'sweet-alert')] /p");

	public WebElement gethomePage() throws Exception {
		return driver.findElement(homePage);
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public WebElement getCategorytype(String categoryName) {
		return driver.findElement(By.xpath("//a[@id='cat']/following-sibling::a[contains(text(),'" + categoryName + "')]"));
	}

	public WebElement getProductByName(String productName) {
		return driver.findElement(By.xpath("//*[contains(text(),'" + productName + "')]"));
	}

	public WebElement getButtonByText(String button) {
		return driver.findElement(By.xpath("//*[contains(text(),'" + button + "')]"));
	}

	public WebElement getLinkByTextOnApplicationheader(String linkText) {
		return driver.findElement(By.xpath("//div[@id='navbarExample']//a[contains(text(),'" + linkText + "')]"));
	}

	public WebElement deleteFromCartByProductName(String productName) {
		return driver.findElement(By.xpath("//td[contains(text(),'" + productName + "')]/following-sibling::td/a[text()='Delete']"));
	}

	public WebElement setName() {
		return driver.findElement(name);
	}

	public WebElement setCountry() {
		return driver.findElement(country);
	}

	public WebElement setCity() {
		return driver.findElement(city);
	}

	public WebElement setCard() {
		return driver.findElement(card);
	}

	public WebElement setYear() {
		return driver.findElement(year);
	}

	public WebElement setMonth() {
		return driver.findElement(month);
	}

	public WebElement getPlaceHolderModal() {
		return driver.findElement(placeOrder);
	}

	public WebElement getTotalCartAmount() {
		return driver.findElement(cartAmount);
	}

	public WebElement getMessageBox() {
		return driver.findElement(messageBox);
	}
	public WebElement getSuccessMessage(){
		return driver.findElement(successPlaceholder);
	}

}
