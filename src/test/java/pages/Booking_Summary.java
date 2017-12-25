package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;


public class Booking_Summary extends PageObject {
	private Method method = new Method();
	//Booking summary for Outbound
	
		public String get_Summary_Outbound_OriginAirport() {
	
			WebElementFacade element = find(By.xpath(".//*[@class='item departure-flight-item clearfix']/span[1]"));
			element.waitUntilVisible();
			String text = element.getAttribute("innerText");
			String Outbound_OriginAirport = text.substring(text.indexOf("(") + 1);
			Outbound_OriginAirport = Outbound_OriginAirport.substring(0, 3);
			return Outbound_OriginAirport;
		}

		public String get_Summary_Outbound_DestinationAirport() {
		
			WebElementFacade element = find(By.xpath(".//*[@class='item departure-flight-item clearfix']/span[1]"));
			element.waitUntilVisible();
			String text = element.getAttribute("innerText");
			String Outbound_DestinationAirport = text.substring(text.lastIndexOf("(") + 1);
			Outbound_DestinationAirport = Outbound_DestinationAirport.substring(0, 3);

			return Outbound_DestinationAirport;
		}
		
		public String get_Summary_Outbound_FlightNo_DepartureTime_DepartureDate(String input,String segment) {
			
			
			List<WebElementFacade> element = findAll(
					".//*[@class='item departure-flight-item clearfix']/div/div["+ segment +"]/span[contains(.,'"+ input +"')]");
			
			element.get(0).waitUntilVisible();
			return element.get(0).getAttribute("innerText");
		}
		
		public String get_Total(){
			WebElementFacade element = find(By.id("summary-total-price"));
			element.waitUntilVisible();
			return element.getAttribute("innerText");
		}
		
		//Booking Summary For Inbound
		
		public String get_Summary_Inbound_OriginAirport() {
		
			WebElementFacade element = find(By.xpath(".//*[@class='item return-flight-item clearfix']/span[1]"));
			element.waitUntilVisible();
			String text = element.getAttribute("innerText");
			String Outbound_OriginAirport = text.substring(text.indexOf("(") + 1);
			Outbound_OriginAirport = Outbound_OriginAirport.substring(0, 3);
			return Outbound_OriginAirport;
		}

		public String get_Summary_Inbound_DestinationAirport() {
			
			WebElementFacade element = find(By.xpath(".//*[@class='item return-flight-item clearfix']/span[1]"));
			element.waitUntilVisible();
			String text = element.getAttribute("innerText");
			String Outbound_DestinationAirport = text.substring(text.lastIndexOf("(") + 1);
			Outbound_DestinationAirport = Outbound_DestinationAirport.substring(0, 3);

			return Outbound_DestinationAirport;
		}
		
		public String get_Summary_Inbound_FlightNo_DepartureTime_DepartureDate(String input,String segment) {
		
			List<WebElementFacade> element = findAll(
					".//*[@class='item return-flight-item clearfix']/span[2]/div["+ segment +"]/span[contains(.,'"+ input + "')]");
			
			element.get(0).waitUntilVisible();
			return element.get(0).getAttribute("innerText");
		}
		
		


}
