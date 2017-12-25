package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DIBS extends PageObject {

	public boolean visa_IsVisible() {
		boolean element = isElementVisible(By.id("paytypeLink_VISA"));
		return element;
	}

	public void click_Visa() {
		WebElementFacade element = find(By.id("paytypeLink_VISA"));
		element.waitUntilVisible();
		element.click();

	}

	public void set_CardNumber(String input) {
		WebElementFacade element = find(By.id("auth_cardno"));
		element.sendKeys(input);
	}

	public void set_ExpiryMonth(String input) {
		WebElementFacade element = find(By.id("auth_expmon"));
		element.sendKeys(input);
	}

	public void set_ExpiryYear(String input) {
		WebElementFacade element = find(By.id("auth_expyear"));
		element.sendKeys(input);
	}

	public void set_CVC(String input) {
		WebElementFacade element = find(By.id("auth_cvc"));
		element.sendKeys(input);
	}
	
	public void click_Validate_payment(){
		WebElementFacade element = find(By.id("btnAuthSubmit"));
		element.click();
	}
	}

