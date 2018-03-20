package pages;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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



	public void select_One_Extras_Item_For_Route_1() {
		setImplicitTimeout(5, TimeUnit.SECONDS);

		Random Dice = new Random();
		List<WebElementFacade> element = findAll(
				"//div[@id='extra-0']/div/div/div[1]/div[2]/div/ul/li[not(contains(@class,'deactivated-item'))]/div[3]/div[2]");
		int n = Dice.nextInt(element.size());

		if (element.get(n).isVisible()) {
			element.get(n).waitUntilVisible();
			element.get(n).click();
		} else {
			WebElementFacade expand = find(By.xpath("//div[@id='extra-0']/div/div/div[1]/div[1]"));
			expand.click();
			System.out.println(element.size());
			element.get(n).waitUntilVisible();
			method.jsClick(element.get(n), getDriver());
		}
		
		resetImplicitTimeout();

	}

	public void select_One_Extras_Item_For_Route_2() {
		setImplicitTimeout(5, TimeUnit.SECONDS);

		Random Dice = new Random();
		List<WebElementFacade> element = findAll(
				"//div[@id='extra-1']/div/div/div[1]/div[2]/div/ul/li[not(contains(@class,'deactivated-item'))]/div[3]/div[2]");
		int n = Dice.nextInt(element.size());
		
		if (element.get(n).isVisible()) {
			element.get(n).waitUntilVisible();
			element.get(n).click();
		} else {
			WebElementFacade expand = find(By.xpath("//div[@id='extra-1']/div/div/div[1]/div[1]"));
			expand.click();
			element.get(n).waitUntilVisible();
			method.jsClick(element.get(n), getDriver());
		}

		resetImplicitTimeout();

	}

	public void select_One_Extras_Item_For_Route_3() {
		setImplicitTimeout(5, TimeUnit.SECONDS);
		Random Dice = new Random();
		List<WebElementFacade> element = findAll(
				"//div[@id='extra-2']/div/div/div[1]/div[2]/div/ul/li[not(contains(@class,'deactivated-item'))]/div[3]/div[2]");
		int n = Dice.nextInt(element.size());
		
		if (element.get(n).isVisible()) {
			element.get(n).waitUntilVisible();
			element.get(n).click();
		} else {
			WebElementFacade expand = find(By.xpath("//div[@id='extra-2']/div/div/div[1]/div[1]"));
			expand.click();
			System.out.println(element.size());
			element.get(n).waitUntilVisible();
			method.jsClick(element.get(n), getDriver());
		}

		resetImplicitTimeout();

		
	}

	public void select_One_Extras_Item_For_Route_4() {
		setImplicitTimeout(5, TimeUnit.SECONDS);
		Random Dice = new Random();
		List<WebElementFacade> element = findAll(
				"//div[@id='extra-3']/div/div/div[1]/div[2]/div/ul/li[not(contains(@class,'deactivated-item'))]/div[3]/div[2]");
		int n = Dice.nextInt(element.size());
		
		if (element.get(n).isVisible()) {
			element.get(n).waitUntilVisible();
			element.get(n).click();
		} else {
			WebElementFacade expand = find(By.xpath("//div[@id='extra-3']/div/div/div[1]/div[1]"));
			expand.click();
			System.out.println(element.size());
			element.get(n).waitUntilVisible();
			method.jsClick(element.get(n), getDriver());
		}

		resetImplicitTimeout();
		
	}

	public void click_Route_Tab_1() {
		WebElementFacade element = find(By.xpath("//a[@aria-controls='extra-1']"));
		element.waitUntilVisible();
		element.click();
	}

	public void click_Route_Tab_2() {
		WebElementFacade element = find(By.xpath("//a[@aria-controls='extra-2']"));
		element.waitUntilVisible();
		element.click();
	}

	public void click_Route_Tab_3() {
		WebElementFacade element = find(By.xpath("//a[@aria-controls='extra-3']"));
		element.waitUntilVisible();
		element.click();
	}

	public void click_Route_Tab_4() {
		WebElementFacade element = find(By.xpath("//a[@aria-controls='extra-4']"));
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
