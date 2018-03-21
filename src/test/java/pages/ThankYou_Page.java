package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class ThankYou_Page extends PageObject {
	
	public String record_locator;
	
	public boolean get_ThankYou_Message() {
		
		setImplicitTimeout(5, TimeUnit.SECONDS);
		WebElementFacade element = find(By.xpath(".//*[@class='main container']/div/div[2]/div[2]/div[1]/h1"));
		resetImplicitTimeout();
		if (element.isVisible()){
			return true;
			
		}else{
			return false;
		}
			
		
	
	}
	
	public boolean check_Error(){
		setImplicitTimeout(5, TimeUnit.SECONDS);
		
		//*[@class='error-msg']
		//boolean isVisible = isElementVisible(By.xpath("//*[@class='error-msg']"));
		WebElementFacade element = find(By.xpath("//*[@class='error-msg']"));
		boolean isVisible = element.isVisible();
		//boolean isVisible = withTimeoutOf(5, TimeUnit.SECONDS).el
		resetImplicitTimeout();
		
		
		if (isVisible){
			return false;
			
		}else{
			return true;
		}
	}
	
	
	public void get_Record_Locator(){
		WebElementFacade element = find(By.xpath(".//h3[@class='ref-num']"));
		element.waitUntilVisible();
		record_locator = element.getAttribute("innerText");
		record_locator = record_locator.substring(record_locator.lastIndexOf(":") + 1);
		//remove white space
		record_locator = record_locator.replaceAll(" ","");
	}
	
	@Step("Record locator is: {0}") 
	 public void get_rloc(String rloc) {
                
   }
	
	

	
	public void click_Manage_Booking(){
		WebElementFacade element = find(By.xpath("//div[@class='order-icon go-booking']/a"));
		element.click();
	}

}
