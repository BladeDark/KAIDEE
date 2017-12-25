package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class Flights_Page extends PageObject {
	private Method method = new Method();

	public String[] outbound_Departure_Time = new String[2];
	public String[] outbound_Arrival_Time = new String[2];
	public String[] outbound_Duration = new String[2];
	public String[] outbound_FlightNo = new String[2];

	public String[] inbound_Departure_Time = new String[2];
	public String[] inbound_Arrival_Time = new String[2];
	public String[] inbound_Duration = new String[2];
	public String[] inbound_FlightNo = new String[2];

	public int amount_flight_segment_outbound;
	public int amount_flight_segment_inbound;
	
	public String outbound_fare;
	public String inbound_fare;
	

	public boolean flight_Page_Is_Open() throws InterruptedException {
		
		WebElementFacade element = find(By.xpath("//*[@id='flightSelectList']/h3[1]"));
		Thread.sleep(1000);
		element.waitUntilVisible();
		if (element.isVisible()) {
			return true;
		} else {
			return false;
		}
	}

	// Outbound Flight
	public String get_Outbound_Date() {
		WebElementFacade element = find(By.xpath("//div[@id='flightSelectList']/div[1]/div/div[1]/div/div/div/a/h4"));
		return element.getText();
	}

	public String get_Table_Outbound_OriginAirport() {
		WebElementFacade element = find(
				By.xpath("//div[@id='flightSelectList']/div[2]/div[2]/table/tbody/tr[1]/td[1]/span"));

		String Outbound_OriginAirport = element.getText().substring(element.getText().indexOf("(") + 1);
		Outbound_OriginAirport = Outbound_OriginAirport.substring(0, 3);
		return Outbound_OriginAirport;
	}

	public String get_Table_Outbound_DestinationAirport() {
		WebElementFacade element = find(
				By.xpath("//div[@id='flightSelectList']/div[2]/div[2]/table/tbody/tr[1]/td[1]/span"));
		String Outbound_DestinationAirport = element.getText().substring(element.getText().lastIndexOf("(") + 1);
		Outbound_DestinationAirport = Outbound_DestinationAirport.substring(0, 3);

		return Outbound_DestinationAirport;
	}

	public void select_Flight_List_Outbound() throws InterruptedException {

		List<WebElementFacade> element = 
				findAll(
				".//div[@class='tabs-panels flight-list tableview-outbound']//tr[contains(@class,'row-flight')]");
		List<WebElementFacade> Is_price_display;
		List<WebElementFacade> Is_fare_display;
		boolean isPresent;
		
		

		for (int row = 1; row <= element.size() + 1; row++) {
			
		
			
			isPresent = findAll(".//div[@class='tabs-panels flight-list tableview-outbound']//tr[contains(@class,'row-flight')]["
							+ row + "]//*[@type='radio']").size() > 0;
			
			if (isPresent) {
				
				setImplicitTimeout(5, TimeUnit.SECONDS);
				
				Is_price_display = findAll(
						".//div[@class='tabs-panels flight-list tableview-outbound']//tr[contains(@class,'row-flight')]["
								+ row + "]//*[@type='radio']");
				
				Is_fare_display = findAll(
						".//div[@class='tabs-panels flight-list tableview-outbound']//tr[contains(@class,'row-flight')]["
								+ row + "]//label");
				
				Thread.sleep(5000);
				Is_price_display.get(0).waitUntilClickable();
				// Is_price_display.get(0).click();
				
				method.jsClick(Is_price_display.get(0), getDriver());
				
				
				outbound_fare = Is_fare_display.get(0).getAttribute("innerText");
				
				// keep flight information
				this.retrieve_outbound_flight_information(row);

				Thread.sleep(2000);
				break;
			} else {
				System.out.println("I cannot click");
			}
			
		

		}
		resetImplicitTimeout();
	}

	// Inbound Flight

	public String get_Inbound_Date() {
		WebElementFacade element = find(By.xpath("//div[@id='flightSelectList']/div[3]/div/div[1]/div/div/div/a/h4"));
		return element.getText();
	}
	

	public void click_Search(){
		WebElementFacade element = find(By.id("searchtrip"));
		element.click();
	}
	
	public void click_Departure(){
		WebElementFacade element = find(By.id("departdate"));
		element.click();
	}
	
	public void click_Return(){
		WebElementFacade element = find(By.id("returndate"));
		element.click();
	}

	public String get_Table_Inbound_OriginAirport() {
		WebElementFacade element = find(
				By.xpath("//div[@id='flightSelectList']/div[4]/div[2]/table/tbody/tr[1]/td[1]/span"));

		String Outbound_OriginAirport = element.getText().substring(element.getText().indexOf("(") + 1);
		Outbound_OriginAirport = Outbound_OriginAirport.substring(0, 3);
		return Outbound_OriginAirport;
	}

	public String get_Table_Inbound_DestinationAirport() {
		WebElementFacade element = find(
				By.xpath("//div[@id='flightSelectList']/div[4]/div[2]/table/tbody/tr[1]/td[1]/span"));
		String Outbound_DestinationAirport = element.getText().substring(element.getText().lastIndexOf("(") + 1);
		Outbound_DestinationAirport = Outbound_DestinationAirport.substring(0, 3);

		return Outbound_DestinationAirport;
	}

	public void select_Flight_List_Inbound() throws InterruptedException {

		List<WebElementFacade> element = findAll(
				".//div[@class='tabs-panels flight-list tableview-inbound']//tr[contains(@class,'row-flight')]");
		List<WebElementFacade> Is_price_display;
		List<WebElementFacade> Is_fare_display;
		boolean isPresent;

		
		
		for (int row = 1; row <= element.size() + 1; row++) {

			isPresent = findAll(
					".//div[@class='tabs-panels flight-list tableview-inbound']//tr[contains(@class,'row-flight')]")
							.size() > 0;

			if (isPresent) {
				
				setImplicitTimeout(5, TimeUnit.SECONDS);
				
				Is_price_display = findAll(
						".//div[@class='tabs-panels flight-list tableview-inbound']//tr[contains(@class,'row-flight')]["
								+ row + "]//*[@type='radio']");
				
				Is_fare_display = findAll(
						".//div[@class='tabs-panels flight-list tableview-inbound']//tr[contains(@class,'row-flight')]["
								+ row + "]//label");
				
				
				Thread.sleep(5000);
				Is_price_display.get(0).waitUntilClickable();
				// Is_price_display.get(0).click();
				method.jsClick(Is_price_display.get(0), getDriver());
				inbound_fare = Is_fare_display.get(0).getAttribute("innerText");
				

				//Keep flight information
				this.retrieve_inbound_flight_information(row);

				Thread.sleep(2000);
				break;
			} else {
				System.out.println("I cannot click");
			}
			
		}
		resetImplicitTimeout();
	}

	public void click_Continue() {
		
		WebElementFacade element = find(By.id("continue"));
		element.waitUntilVisible();
		element.waitUntilClickable();
		method.jsClick(element, getDriver());
	}

	private void retrieve_outbound_flight_information(int row) {

		amount_flight_segment_outbound = findAll(
				".//div[@class='tabs-panels flight-list tableview-outbound']//tr[contains(@class,'row-flight')][" + row
						+ "]/td/table/tbody/tr").size();

		List<WebElementFacade> departure_Time = findAll(
				".//div[@class='tabs-panels flight-list tableview-outbound']//tr[contains(@class,'row-flight')][" + row
						+ "]/td[1]/table/tbody/tr/td[1]/div/span");

		List<WebElementFacade> arrival_Time = findAll(
				".//div[@class='tabs-panels flight-list tableview-outbound']//tr[contains(@class,'row-flight')][" + row
						+ "]/td[1]/table/tbody/tr/td[2]/div/span");

		/*List<WebElementFacade> duration_Time = findAll(
				".//div[@class='tabs-panels flight-list tableview-outbound']//tr[contains(@class,'row-flight')][" + row
						+ "]/td[1]/table/tbody/tr/td[3]/div/span");*/

		/*List<WebElementFacade> FlightNo = findAll(
				".//div[@class='tabs-panels flight-list tableview-outbound']//tr[contains(@class,'row-flight')][" + row
						+ "]/td[1]/table/tbody/tr/td[3]/span[2]");*/

		if (amount_flight_segment_outbound > 0){
			for (int i = 0; i < amount_flight_segment_outbound; i++) {
				outbound_Departure_Time[i] = departure_Time.get(i).getText();
				outbound_Arrival_Time[i] = arrival_Time.get(i).getText();
				//outbound_Duration[i] = duration_Time.get(i).getText();
				//outbound_FlightNo[i] = FlightNo.get(i).getText();
				
			}
		}
		

	}
	
	private void retrieve_inbound_flight_information(int row) {

		amount_flight_segment_inbound = findAll(
				".//div[@class='tabs-panels flight-list tableview-inbound']//tr[contains(@class,'row-flight')][" + row
						+ "]/td/table/tbody/tr").size();

		List<WebElementFacade> departure_Time = findAll(
				".//div[@class='tabs-panels flight-list tableview-inbound']//tr[contains(@class,'row-flight')][" + row
						+ "]/td[1]/table/tbody/tr/td[1]/div/span");

		List<WebElementFacade> arrival_Time = findAll(
				".//div[@class='tabs-panels flight-list tableview-inbound']//tr[contains(@class,'row-flight')][" + row
						+ "]/td[1]/table/tbody/tr/td[2]/div/span");

		/*List<WebElementFacade> duration_Time = findAll(
				".//div[@class='tabs-panels flight-list tableview-inbound']//tr[contains(@class,'row-flight')][" + row
						+ "]/td[1]/table/tbody/tr/td[3]/div/span");*/

		/*List<WebElementFacade> FlightNo = findAll(
				".//div[@class='tabs-panels flight-list tableview-inbound']//tr[contains(@class,'row-flight')][" + row
						+ "]/td[1]/table/tbody/tr/td[3]/span[2]");*/

		if (amount_flight_segment_inbound > 0) {
			for (int i = 0; i < amount_flight_segment_outbound; i++) {
				inbound_Departure_Time[i] = departure_Time.get(i).getText();
				inbound_Arrival_Time[i] = arrival_Time.get(i).getText();
				//inbound_Duration[i] = duration_Time.get(i).getText();
				//inbound_FlightNo[i] = FlightNo.get(i).getText();

			}

		}
		
		
		
	}
	

}
