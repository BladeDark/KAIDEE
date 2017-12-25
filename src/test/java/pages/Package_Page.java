package pages;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.Random;

public class Package_Page extends PageObject {
	private Method method = new Method();
	
	public boolean is_Package_Select = false;
	
	public boolean pacakage_Page_Is_Open() {
		
		WebElementFacade element = find(By.xpath("//li[@data-idx='packages'][contains(@class,'active')]"));
		element.waitUntilVisible();
		if (element.getAttribute("class").contains("active")) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public void select_CheckBox_All_Passengers(){
		List<WebElementFacade> total_passenger = findAll(".//*[@data-entity_id]");
		if (total_passenger.size() > 0){
			for (int i = 0; i < total_passenger.size(); i++) {
				method.jsClick(total_passenger.get(i), getDriver());
		
			}
		}
	}
	
	
	public void select_One_PK_Item_outbound(){
		Random Dice = new Random(); 
		List<WebElementFacade> element = findAll(".//*[@id='from-packages']/div/ul/li/input[not(@disabled)]");
		int n = Dice.nextInt(element.size());
		//element.get(n).waitUntilVisible();
		//element.get(n).click();
		
		method.jsClick(element.get(n), getDriver());
		this.is_Package_Select = true;
		//method.jsClick(element.get(n), getDriver());
		
	}
	
	public void select_One_PK_Item_inbound(){
		Random Dice = new Random(); 
		List<WebElementFacade> element = findAll(".//*[@id='to-packages']/div/ul/li/input[not(@disabled)]");
		int n = Dice.nextInt(element.size());
		//element.get(n).waitUntilVisible();
		//element.get(n).click();
		method.jsClick(element.get(n), getDriver());
		this.is_Package_Select = true;
		//method.jsClick(element.get(n), getDriver());
		
		
	}
	
	
	
	
	public void click_Continue_Extras() {
		
		
		
		if (is_Package_Select){
			WebElementFacade element = find(By.xpath(".//*[@id='form-flights']/a[4]"));
			element.click();
			this.is_Package_Select = false;
		}else if (!is_Package_Select){
			WebElementFacade element = find(By.xpath(".//*[@id='form-flights']/a[4]"));
			element.click();
			/*WebElementFacade btn_continue = find(By.xpath("//div[@id='remind-packages']/div[2]/div/div[2]/form/div[2]/div/button[2]"));
			btn_continue.waitUntilVisible();
			btn_continue.click();*/
			this.is_Package_Select = false;
		}
		
		
		
	
	

	}
	
	public void click_Go_directly_to_Payment() {
		WebElementFacade element = find(By.id("continue-checkout"));
		element.click();
		
	}
	
	
	public void click_Inbound_Tab(){
		WebElementFacade element = find(By.xpath(".//*[@id='top-flight-switcher']/ul/li[2]/a[@aria-controls='to-packages']"));
		element.waitUntilVisible();
		element.click();
	}
	
	
	

}
