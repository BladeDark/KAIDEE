package pages;

import java.util.List;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class Checkout_Page extends PageObject {
	Method method = new Method();

	public boolean checkout_Page_Is_Open() {

		WebElementFacade element = find(By.xpath("//li[@data-idx='checkout'][contains(@class,'active')]"));
		element.waitUntilVisible();
		if (element.getAttribute("class").contains("active")) {
			return true;
		} else {
			return false;
		}
	}

	// Contact information

	public String get_Fullname() {
		WebElementFacade element = find(By.xpath(".//*[@id='collapse-contact']/div/div[1]"));
		return element.getText();
	}

	public String get_Email() {
		WebElementFacade element = find(By.xpath(".//*[@id='collapse-contact']/div/div[2]"));
		return element.getText();
	}

	public String get_Country() {
		WebElementFacade element = find(By.xpath(".//*[@id='collapse-contact']/div/div[4]"));
		return element.getText();
	}

	public String get_Mobilephone() {
		WebElementFacade element = find(By.xpath(".//*[@id='collapse-contact']/div/div[5]"));
		return element.getText();
	}

	// Outbound table summary

	public String get_Table_Outbound_FlightNo() {
		WebElementFacade element = find(
				By.xpath(".//div[@id='collapse-booking']/div[1]/div[1]/table//tbody/tr[2]/td[1]"));
		return element.getText();
	}

	public String get_Table_Outbound_OriginAirport() {

		WebElementFacade element = find(
				By.xpath(".//div[@id='collapse-booking']/div[1]/div[1]/table/tbody/tr[1]/td[2]"));

		String Outbound_OriginAirport = element.getText().substring(element.getText().indexOf("(") + 1);
		Outbound_OriginAirport = Outbound_OriginAirport.substring(0, 3);
		return Outbound_OriginAirport;

	}

	public String get_Table_Outbound_DestinationAirport() {
		WebElementFacade element = find(
				By.xpath(".//div[@id='collapse-booking']/div[1]/div[1]/table/tbody/tr[1]/td[2]"));
		String Outbound_DestinationAirport = element.getText().substring(element.getText().lastIndexOf("(") + 1);
		Outbound_DestinationAirport = Outbound_DestinationAirport.substring(0, 3);

		return Outbound_DestinationAirport;
	}

	public String get_Table_Outbound_DepartureTime() {
		WebElementFacade element = find(
				By.xpath(".//div[@id='collapse-booking']/div[1]/div[1]/table/tbody/tr[1]/td[3]/div[1]"));
		return element.getText();
	}

	public String get_Table_Outbound_ArrivalTime() {
		WebElementFacade element = find(
				By.xpath(".//div[@id='collapse-booking']/div[1]/div[1]/table//tbody/tr[1]/td[3]/div[2]"));
		return element.getText();
	}

	// Inbound table summary

	public String get_Table_Inbound_FlightNo() {
		WebElementFacade element = find(
				By.xpath(".//div[@id='collapse-booking']/div[2]/div[1]/table//tbody/tr[2]/td[1]"));
		return element.getText();
	}

	public String get_Table_Inbound_OriginAirport() {

		WebElementFacade element = find(
				By.xpath(".//div[@id='collapse-booking']/div[2]/div[1]/table/tbody/tr[1]/td[2]"));

		String Outbound_OriginAirport = element.getText().substring(element.getText().indexOf("(") + 1);
		Outbound_OriginAirport = Outbound_OriginAirport.substring(0, 3);
		return Outbound_OriginAirport;

	}

	public String get_Table_Inbound_DestinationAirport() {
		WebElementFacade element = find(
				By.xpath(".//div[@id='collapse-booking']/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
		String Outbound_DestinationAirport = element.getText().substring(element.getText().lastIndexOf("(") + 1);
		Outbound_DestinationAirport = Outbound_DestinationAirport.substring(0, 3);

		return Outbound_DestinationAirport;
	}

	public String get_Table_Inbound_DepartureTime() {
		WebElementFacade element = find(
				By.xpath(".//div[@id='collapse-booking']/div[2]/div[1]/table/tbody/tr[1]/td[3]/div[1]"));
		return element.getText();
	}

	public String get_Table_Inbound_ArrivalTime() {
		WebElementFacade element = find(
				By.xpath(".//div[@id='collapse-booking']/div[2]/div[1]/table//tbody/tr[1]/td[3]/div[2]"));
		return element.getText();
	}

	// Payment method
	public void click_CashOnDelivery_Payment() {
		WebElementFacade element = find(By.id("p_method_cashondelivery"));

		method.jsClick(element, getDriver());

	}

	public void click_DIBS_Payment() {
		WebElementFacade element = find(By.id("p_method_Dibsfw"));
		method.jsClick(element, getDriver());
	}

	public void click_eMerchant_Payment() {
		WebElementFacade element = find(By.id("p_method_emerchantpay_checkout"));
		method.jsClick(element, getDriver());
	}

	public void click_Agreement() {
		WebElementFacade element = find(By.xpath("//input[contains(@id,'agreement')]"));
		method.jsClick(element, getDriver());
		
	}

	public void click_Place_Order() {
		WebElementFacade element = find(By.id("checkout-btn"));
		method.jsClick(element, getDriver());
	
	}
	
	public void click_DebitCreditAC() {
		WebElementFacade element = find(By.id("p_method_wt_corporate_debit"));
		method.jsClick(element, getDriver());
	
	}

	public String get_Grand_Total() {
		WebElementFacade element = find(By.xpath(".//*[@id='shopping-cart-totals-table']/tfoot/tr/td[2]/strong/span"));
		return element.getAttribute("innerText");
	}
	
	
	@Step("Booking summary fare is: {0}") 
	 public void get_sum_fare(String fare) {
               
  }
	
	@Step("Check out fare is: {0}") 
	 public void get_chk_fare(String fare) {
              
 }
	
	
	

}
