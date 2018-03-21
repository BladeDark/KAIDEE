package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class Emerchantpay_Page extends PageObject {
	
	private Method method = new Method();

	public boolean customerEmail_IsVisible() {
		boolean element = isElementVisible(By.id("wpf_form_customer_email"));
		return element;
	}

	public void set_CustomerEmail(String input) {
		WebElementFacade element = find(By.id("wpf_form_customer_email"));
		element.clear();
		element.sendKeys(input);
	}

	public void set_Firstname(String input) {
		WebElementFacade element = find(By.id("wpf_form_billing_address_first_name"));
		element.clear();
		element.sendKeys(input);
	}

	public void set_Lastname(String input) {
		WebElementFacade element = find(By.id("wpf_form_billing_address_last_name"));
		element.clear();
		element.sendKeys(input);

	}

	public void set_Address1(String input) {
		WebElementFacade element = find(By.id("wpf_form_billing_address_address1"));
		element.clear();
		element.sendKeys(input);
	}

	public void set_City(String input) {
		WebElementFacade element = find(By.id("wpf_form_billing_address_city"));
		element.clear();
		element.sendKeys(input);
	}

	public void set_Zipcode(String input) {
		WebElementFacade element = find(By.id("wpf_form_billing_address_zip_code"));
		element.clear();
		element.sendKeys(input);
	}

	public void set_Cardholder(String input) {
		WebElementFacade element = find(By.id("wpf_form_card_holder"));
		element.clear();
		element.sendKeys(input);
	}

	public void set_Cardnumber(String input) {
		WebElementFacade element = find(By.id("wpf_form_card_number"));
		element.clear();
		element.sendKeys(input);
	}

	public void set_Expiry_Month(String input) {
		WebElementFacade element = find(By.id("wpf_form_expiration_date_2i"));
		element.selectByValue(input);

	}

	public void set_Expiry_Year(String input) {
		WebElementFacade element = find(By.id("wpf_form_expiration_date_1i"));
		element.selectByValue(input);

	}

	public void set_CVV(String input) {
		WebElementFacade element = find(By.id("wpf_form_requires_cvv"));
		element.sendKeys(input);
	}

	public void click_ackBox() {

		WebElementFacade element = find(By.xpath("//label[@for='wpf_form_tac']"));
		method.jsClick(element, getDriver());
		

	}

	public void click_Pay(){

		WebElementFacade element = find(By.name("commit"));
		method.jsClick(element, getDriver());

	}

}
