package pages;

import net.thucydides.core.pages.PageObject;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;

public class Manage_Booking_Page extends PageObject {

	Method method = new Method();

	public boolean manage_booking_Is_Open() {
		WebElementFacade element = find(By.xpath("//div[@class='block-title']/h4"));
		
		if (element.isVisible()){
			return true;
		}else{
			return false;
		}
		
	}

	public void click_Buy_Extras() {
		WebElementFacade element = find(By.xpath("//*[@class='order-icon buy-extra']/a/span")); 
		element.waitUntilVisible();
		method.jsClick(element, getDriver());
	}

	public void click_Change_Name() {
		WebElementFacade element = find(By.xpath("//a[@data-target='#change-name']/span")); 
		element.waitUntilVisible();
		method.jsClick(element, getDriver());
	}

	public void click_Change_Date() {
		WebElementFacade element = find(By.xpath("//a[@data-target='#change-date']/span"));
		element.waitUntilVisible();
		method.jsClick(element, getDriver());
	}
	
	public void click_Cancel_Flight() {
		WebElementFacade element = find(By.xpath("//a[@data-target='#cancel-segment']/span"));
		element.waitUntilVisible();
		method.jsClick(element, getDriver());
	}
	
	public void click_Cancel_Booking() {
		WebElementFacade element = find(By.xpath("//a[@data-target='#cancel-popup']/span"));
		element.waitUntilVisible();
		method.jsClick(element, getDriver());
	}
	
	public void click_Cancel_Passenger() {
		WebElementFacade element = find(By.xpath("//a[@data-target='#cancel-passenger']/span"));
		element.waitUntilVisible();
		method.jsClick(element, getDriver());
	}


	public void select_All_Passengers_on_ch_form() {
		List<WebElementFacade> element = findAll("//input[contains(@id,'change-passenger')]");

		for (int i = 0; i < element.size(); i++) {
			element.get(i).waitUntilVisible();
			element.get(i).click();
		}
	}
	
	public void select_one_Passengers_on_ch_form() {
		Random Dice = new Random();
		
		List<WebElementFacade> element = findAll("//input[contains(@id,'change-passenger')]");
		int n = Dice.nextInt(element.size());
		element.get(n).waitUntilVisible();
		element.get(n).click();
		
		
	}

	public void click_Yes_On_Changename_form() {
		WebElementFacade element = find(By.xpath("//form[@id='ch_name_form']/div[2]/div/button[2]"));
		element.waitUntilVisible();
		element.click();
	}

	public void click_outbound_segment() {
		WebElementFacade element = find(By.id("change-segment-outbound"));
		element.waitUntilVisible();
		element.click();
		
	}

	public void click_inbound_segment() {
		WebElementFacade element = find(By.id("change-segment-inbound"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_Yes_On_Rebook_form(){
		WebElementFacade element = find(By.xpath("//form[@id='ch_date_form']/div[2]/div/button[2]"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_cancel_outbound(){
		WebElementFacade element = find(By.id("cancel-segment-outbound"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_cancel_inbound(){
		WebElementFacade element = find(By.id("cancel-segment-inbound"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_Yes_on_Cancellation_Flight(){
		WebElementFacade element = find(By.xpath("//*[@id='cancel_form']/div[2]/div/button[2]"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_Yes_on_Cancellation_Booking(){
		WebElementFacade element = find(By.xpath("//*[@id='cancel-popup']/div[2]/div//*[@id='cancel-modal']"));
		element.waitUntilVisible();
		element.click();
	}
	
	
	public boolean check_success_cancel(){
		WebElementFacade element = find(By.xpath("//li[@class='success-msg']"));
		
		if (element.isVisible()){
			return true;
		}else{
			return false;
		}
		
	}
	


}
