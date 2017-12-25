package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class Extras_Page extends PageObject {
	private Method method = new Method();

	public boolean extras_Page_Is_Open() {

		WebElementFacade element = find(By.xpath("//li[@data-idx='extras'][contains(@class,'active')]"));
		element.waitUntilVisible();
		if (element.getAttribute("class").contains("active")) {
			return true;
		} else {
			return false;
		}
	}

	public void select_CheckBox_All_Passengers() {
		List<WebElementFacade> total_passenger = findAll(".//*[@data-entity_id]");
		if (total_passenger.size() > 0) {
			for (int i = 0; i < total_passenger.size(); i++) {
				method.jsClick(total_passenger.get(i), getDriver());

			}
		}
	}

	public void select_One_Extras_Item_outbound() {
		
		
		List<WebElementFacade> element= findAll("//div[@id='from-extras']//div[@style='visibility: visible;']/div[@class='inc button btn-checkout']");
		
		element.get(0).waitUntilVisible();
		element.get(0).click();
		// method.jsClick(element_click, getDriver());
	}

	public void select_One_Extras_Item_inbound() {
		
		List<WebElementFacade> element = findAll("//div[@id='to-extras']//div[@style='visibility: visible;']/div[@class='inc button btn-checkout']");
		element.get(0).waitUntilVisible();
		element.get(0).click();
		
		// method.jsClick(element_click, getDriver());

	
	}

	public void click_Inbound_Tab() {
		WebElementFacade element = find(
				By.xpath(".//*[@id='top-flight-switcher']/ul/li[2]/a[@aria-controls='to-extras']"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_Go_directly_to_Payment() {
		WebElementFacade element = find(By.id("continue-checkout"));
		element.click();
		
	}
	
	public void click_Continue() {
		WebElementFacade element = find(By.id("continue"));
		element.click();
		
	}

}
