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
	
	
	public void select_One_PK_Item_Route_1(){
		Random Dice = new Random(); 
		List<WebElementFacade> element = findAll(".//*[@id='package-0']/div/ul/li/input[not(@disabled)]");
		int n = Dice.nextInt(element.size());
		method.jsClick(element.get(n), getDriver());
		this.is_Package_Select = true;
		//method.jsClick(element.get(n), getDriver());
		
	}
	
	public void select_One_PK_Item_Route_2(){
		Random Dice = new Random(); 
		List<WebElementFacade> element = findAll(".//*[@id='package-1']/div/ul/li/input[not(@disabled)]");
		int n = Dice.nextInt(element.size());
		//element.get(n).waitUntilVisible();
		//element.get(n).click();
		method.jsClick(element.get(n), getDriver());
		this.is_Package_Select = true;
		//method.jsClick(element.get(n), getDriver());
	}
	
	public void select_One_PK_Item_Route_3(){
		Random Dice = new Random(); 
		List<WebElementFacade> element = findAll(".//*[@id='package-2']/div/ul/li/input[not(@disabled)]");
		int n = Dice.nextInt(element.size());	
		method.jsClick(element.get(n), getDriver());
		this.is_Package_Select = true;	
	}
	
	public void select_One_PK_Item_Route_4(){
		Random Dice = new Random(); 
		List<WebElementFacade> element = findAll(".//*[@id='package-3']/div/ul/li/input[not(@disabled)]");
		int n = Dice.nextInt(element.size());
		method.jsClick(element.get(n), getDriver());
		this.is_Package_Select = true;		
	}
	
	
	
	
	public void click_Continue_Extras() {
		
		
		
		if (is_Package_Select){
			WebElementFacade element = find(By.xpath(".//*[@id='form-flights']/a[4]/span/span"));
			element.waitUntilVisible();
			method.jsClick(element, getDriver());
			
			this.is_Package_Select = false;
		}else if (!is_Package_Select){
			WebElementFacade element = find(By.xpath(".//*[@id='form-flights']/a[4]/span/span"));
			element.waitUntilVisible();
			method.jsClick(element, getDriver());
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
	
	
	public void click_Route_Tab_1(){
		WebElementFacade element = find(By.xpath(".//a[@aria-controls='package-0']"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_Route_Tab_2(){
		WebElementFacade element = find(By.xpath(".//a[@aria-controls='package-1']"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_Route_Tab_3(){
		WebElementFacade element = find(By.xpath(".//a[@aria-controls='package-2']"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_Route_Tab_4(){
		WebElementFacade element = find(By.xpath(".//a[@aria-controls='package-3']"));
		element.waitUntilVisible();
		element.click();
	}
	

}
