package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LogIn_Page extends PageObject  {

	public String get_Title(){
		WebElementFacade element = find(By.xpath(".//title"));
		return element.getAttribute("innerText");
	}
	
	public void set_Record_Locator(String input){
		WebElementFacade element = find(By.id("record"));
		element.sendKeys(input);
	}
	public void set_LastName(String input){
		WebElementFacade element = find(By.id("last_name"));
		element.sendKeys(input);
	}
	
	public void click_LogIn_for_RecordLocator(){
		WebElementFacade element = find(By.id("send-openam"));
		element.click();
	}
	
	public void click_LogIn_for_User(){
		WebElementFacade element = find(By.id("send2"));
		element.click();
	}
	
	public void set_Email(String input){
		WebElementFacade element = find(By.id("email"));
		element.sendKeys(input);
	}
	
	public void set_Password(String input){
		WebElementFacade element = find(By.id("pass"));
		element.sendKeys(input);
	}
	
	public void click_login(){
		WebElementFacade element = find(By.id("tab-2"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_DAT_Img(){
		WebElementFacade element = find(By.xpath("//a[@class='logo logo--regular']/img"));
		element.waitUntilVisible();
		element.click();
	}
	
	
	

	
}
