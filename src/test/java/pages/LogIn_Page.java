package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LogIn_Page extends PageObject  {

	public void get_login(){
		WebElementFacade element = find(By.xpath(".//a[@data-name='Login']"));
		element.click();
	}
}