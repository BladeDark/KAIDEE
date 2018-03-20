package pages;

import java.util.List;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class Cancel_Passenger_Page extends PageObject {
	
	private Method method = new Method();
	public void click_one_Adult(int value) {
		List<WebElementFacade> element = findAll("//*[@data-type='ADT']");
		for (int i = 0; i < value; i++) {
			element.get(i).waitUntilVisible();
			method.jsClick(element.get(i), getDriver());
			//element.get(i).click();
		}
		
	}
	public void click_one_Child(int value) {
		List<WebElementFacade> element = findAll("//*[@data-type='CHD']");
		for (int i = 0; i < value; i++) {
			element.get(i).waitUntilVisible();
			method.jsClick(element.get(i), getDriver());
		}
		
	}
	public void click_one_Infant(int value) {
		List<WebElementFacade> element = findAll("//*[@data-type='INF']");
		for (int i = 0; i < value; i++) {
			element.get(i).waitUntilVisible();
			method.jsClick(element.get(i), getDriver());
		}
		
		
	}
	
	public void click_Yes() {
		WebElementFacade element = find(By.xpath("//form[@id='cancel_passenger_form']/div[2]/div/button[2]"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_submit() {
		WebElementFacade element = find(By.xpath("//form[@id='cancel_passenger_form']/div[3]/div/button[2]"));
		element.waitUntilVisible();
		element.click();
	}
}
