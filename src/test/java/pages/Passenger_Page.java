package pages;

import java.text.Format;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class Passenger_Page extends PageObject {
	
	private Method method = new Method();
	
	public String title;
	public String firstname;
	public String lastname;
	public String email;
	public String country;
	public String mobilephone;

	public boolean passenger_Page_Is_Open() {
	
		WebElementFacade element = find(By.xpath("//li[@data-idx='passengers'][contains(@class,'active')]"));
		element.waitUntilVisible();
		if (element.getAttribute("class").contains("active")) {
			return true;
		} else {
			return false;
		}
	}

	public void click_Proceed_as_a_guest() {
		
		WebElementFacade element = find(By.id("as_guest"));
		element.waitUntilVisible();
		element.click();
	}

	private String get_passenger_type(String index) {
		WebElementFacade element = find(By.id("passenger_"+ index +""));
		return element.getAttribute("class");
	}

	private WebElementFacade element_Title(String index) {
		WebElementFacade element = find(
				By.id("passenger_title_" + index +""));
		return element;
	}

	private WebElementFacade element_FirstName(String index) {
		WebElementFacade element = find(
				By.id("passenger_firstname_"+ index +""));
		return element;
	}

	private WebElementFacade element_LastName(String index) {
		WebElementFacade element = find(
				By.id("passenger_lastname_"+ index +""));
		return element;
	}

	private WebElementFacade element_Email(String index) {
		WebElementFacade element = find(
				By.id("passenger_email_"+ index +""));
		return element;
	}

	private WebElementFacade element_Country(String index) {
		WebElementFacade element = find(
				By.id("passenger_country_id_"+ index +""));
		return element;
	}

	private WebElementFacade element_MobilePhone(String index) {
		WebElementFacade element = find(
				By.id("passenger_mobile_"+ index +""));
		return element;
	}
	
	private WebElementFacade element_Telephone(String index) {
		WebElementFacade element = find(
				By.id("passenger_telephone_"+ index +""));
		return element;
	}
	
	private WebElementFacade element_Date(String index) {
		WebElementFacade element = find(
				By.id("passenger_day_"+ index +""));
		return element;
	}
	
	private WebElementFacade element_Month(String index) {
		WebElementFacade element = find(
				By.id("passenger_month_"+ index +""));
		return element;
	}
	
	private WebElementFacade element_Year(String index) {
		WebElementFacade element = find(
				By.id("passenger_year_"+ index +""));
		return element;
	}
	

	private WebElementFacade element_copy_contact_information() {
		WebElementFacade element = find(By.id("contactinfo-copyfrom"));
		return element;
	}

	private WebElementFacade element_contact_Title() {
		WebElementFacade element = find(By.id("contact_title"));
		return element;
	}

	private WebElementFacade element_contact_FistName() {
		WebElementFacade element = find(By.id("contact_firstname"));
		return element;
	}

	private WebElementFacade element_contact_LastName() {
		WebElementFacade element = find(By.id("contact_lastname"));
		return element;
	}

	private WebElementFacade element_contact_Email() {
		WebElementFacade element = find(By.id("contact_email"));
		return element;
	}

	private WebElementFacade element_contact_Country() {
		WebElementFacade element = find(By.id("contact_country_id"));
		return element;
	}

	private WebElementFacade element_contact_MobilePhone() {
		WebElementFacade element = find(By.id("contact_mobile"));
		return element;
	}

	private WebElementFacade element_contact_Telephone() {
		WebElementFacade element = find(By.id("contact_telephone"));
		return element;
	}
	
	
	

	public void click_Go_directly_to_Payment() {
		WebElementFacade element = find(By.id("continue-checkout"));
		element.click();
		
	}

	public void click_Go_to_Copy() {
		WebElementFacade element = find(By.id("btnCopyFrom"));
		element.waitUntilVisible();
		method.jsClick(element, getDriver());

	}
	public void click_Continue_AddOns() {
		WebElementFacade element = find(By.xpath(".//*[@id='form-flights']/a[2]"));
		element.click();
	}
	
	
	
	
	

	public void fill_passengers_information() {
		List<WebElementFacade> total_passenger = findAll(".//*[@id='passengerDetailRows']/div");
		
		setImplicitTimeout(1, TimeUnit.SECONDS);
		if (total_passenger.size() > 0) {
			
			
			for (int i = 0; i < total_passenger.size(); i++) {
				
				if (this.get_passenger_type(String.valueOf(i)).equalsIgnoreCase("passenger clearfix ADT")) {
					
					Format year_formatter = new SimpleDateFormat("YYYY");
					Format month_formatter = new SimpleDateFormat("MM");
					Format date_formatter = new SimpleDateFormat("dd");

					String year = year_formatter.format(new Date());
					int int_year = Integer.parseInt(year);
					int_year = int_year - 20 ;
					year = String.valueOf(int_year);
					String month = month_formatter.format(new Date());
					String date = date_formatter.format(new Date());
					
					
					this.element_Title(String.valueOf(i)).selectByValue("Mr.");
					this.element_FirstName(String.valueOf(i)).sendKeys("ATM_" + i);
					this.element_LastName(String.valueOf(i)).sendKeys("WorldTicket");
					
					if (this.element_Year(String.valueOf(i)).isVisible()){
						this.element_Year(String.valueOf(i)).selectByValue(year);
					}
					
					if (this.element_Month(String.valueOf(i)).isVisible()) {
						this.element_Month(String.valueOf(i)).selectByValue(month);
					}
					
					if (this.element_Date(String.valueOf(i)).isVisible()){
						this.element_Date(String.valueOf(i)).selectByValue(date);
					}
					
					
					
					if (this.element_Email(String.valueOf(i)).isVisible()){
						this.element_Email(String.valueOf(i)).sendKeys("nas@worldticket.net");
					}
					
					
					this.element_Country(String.valueOf(i)).selectByValue("TH");
					this.element_MobilePhone(String.valueOf(i)).sendKeys("12345678");
					
					if (this.element_Telephone(String.valueOf(i)).isVisible()) {
						this.element_Telephone(String.valueOf(i)).sendKeys("12345678");
					}
				
					

				} else if (this.get_passenger_type(String.valueOf(i)).equalsIgnoreCase("passenger clearfix CHD")) {
					
					Format year_formatter = new SimpleDateFormat("YYYY");
					Format month_formatter = new SimpleDateFormat("MM");
					Format date_formatter = new SimpleDateFormat("dd");

					String year = year_formatter.format(new Date());
					int int_year = Integer.parseInt(year);
					int_year = int_year - 5 ;
					year = String.valueOf(int_year);
					String month = month_formatter.format(new Date());
					String date = date_formatter.format(new Date());
					
					this.element_Title(String.valueOf(i)).selectByValue("Mr.");
					this.element_FirstName(String.valueOf(i)).sendKeys("ATM_" + i);
					this.element_LastName(String.valueOf(i)).sendKeys("WorldTicket");
					this.element_Year(String.valueOf(i)).selectByValue(year);
					this.element_Month(String.valueOf(i)).selectByValue(month);
					this.element_Date(String.valueOf(i)).selectByValue(date);
					
					
					
				} else if (this.get_passenger_type(String.valueOf(i)).equalsIgnoreCase("passenger clearfix INF")) {
					
					Format year_formatter = new SimpleDateFormat("YYYY");
					Format month_formatter = new SimpleDateFormat("MM");
					Format date_formatter = new SimpleDateFormat("dd");

					String year = year_formatter.format(new Date());
					int int_year = Integer.parseInt(year);
					int_year = int_year - 1 ;
					year = String.valueOf(int_year);
					String month = month_formatter.format(new Date());
					String date = date_formatter.format(new Date());
					
					
					this.element_Title(String.valueOf(i)).selectByValue("Mr.");
					this.element_FirstName(String.valueOf(i)).sendKeys("ATM_" + i);
					this.element_LastName(String.valueOf(i)).sendKeys("WorldTicket");
					this.element_Year(String.valueOf(i)).selectByValue(year);
					this.element_Month(String.valueOf(i)).selectByValue(month);
					this.element_Date(String.valueOf(i)).selectByValue(date);
				}
			
			}
		}
		
		resetImplicitTimeout();

	}
	
	public void change_name_all_passenger() {
		List<WebElementFacade> total_passenger = findAll(".//*[@id='passengerDetailRows']/div");
		int row = 0;
		setImplicitTimeout(1, TimeUnit.SECONDS);
		if (total_passenger.size() > 0) {
			
			
			
			for (int i = 0; i < total_passenger.size(); i++) {
				
				if (this.get_passenger_type(String.valueOf(i)).equalsIgnoreCase("passenger clearfix ADT")) {
					
					Format year_formatter = new SimpleDateFormat("YYYY");
					Format month_formatter = new SimpleDateFormat("MM");
					Format date_formatter = new SimpleDateFormat("dd");

					String year = year_formatter.format(new Date());
					int int_year = Integer.parseInt(year);
					int_year = int_year - 20 ;
					year = String.valueOf(int_year);
					String month = month_formatter.format(new Date());
					String date = date_formatter.format(new Date());
					
					
					this.element_FirstName(String.valueOf(i)).clear();
					this.element_FirstName(String.valueOf(i)).sendKeys("Change_" + i);
					
					if (this.element_Year(String.valueOf(i)).isVisible()){
						this.element_Year(String.valueOf(i)).selectByValue(year);
					}
					
					if (this.element_Month(String.valueOf(i)).isVisible()){
						this.element_Month(String.valueOf(i)).selectByValue(month);
					}
				
					if (this.element_Date(String.valueOf(i)).isVisible()){
						this.element_Date(String.valueOf(i)).selectByValue(date);
					}
					
			

				} else if (this.get_passenger_type(String.valueOf(i)).equalsIgnoreCase("passenger clearfix CHD")) {
					
					Format year_formatter = new SimpleDateFormat("YYYY");
					Format month_formatter = new SimpleDateFormat("MM");
					Format date_formatter = new SimpleDateFormat("dd");

					String year = year_formatter.format(new Date());
					int int_year = Integer.parseInt(year);
					int_year = int_year - 5 ;
					year = String.valueOf(int_year);
					String month = month_formatter.format(new Date());
					String date = date_formatter.format(new Date());
					
					this.element_FirstName(String.valueOf(i)).clear();
					this.element_FirstName(String.valueOf(i)).sendKeys("Change_" + i);
					
					this.element_Year(String.valueOf(i)).selectByValue(year);
					this.element_Month(String.valueOf(i)).selectByValue(month);
					this.element_Date(String.valueOf(i)).selectByValue(date);
					
					
					
				} else if (this.get_passenger_type(String.valueOf(i)).equalsIgnoreCase("passenger clearfix INF")) {
					
					Format year_formatter = new SimpleDateFormat("YYYY");
					Format month_formatter = new SimpleDateFormat("MM");
					Format date_formatter = new SimpleDateFormat("dd");

					String year = year_formatter.format(new Date());
					int int_year = Integer.parseInt(year);
					int_year = int_year - 1 ;
					year = String.valueOf(int_year);
					String month = month_formatter.format(new Date());
					String date = date_formatter.format(new Date());
					
					
					this.element_FirstName(String.valueOf(i)).clear();
					this.element_FirstName(String.valueOf(i)).sendKeys("Change_" + i);
					this.element_Year(String.valueOf(i)).selectByValue(year);
					this.element_Month(String.valueOf(i)).selectByValue(month);
					this.element_Date(String.valueOf(i)).selectByValue(date);
				}
			
			}
		}
		
		resetImplicitTimeout();

	}

	public void copy_contact_passenger_infomration() throws InterruptedException {
		this.element_copy_contact_information().selectByValue("0");
		this.click_Go_to_Copy();

		title = this.element_contact_Title().getValue();
		firstname = this.element_contact_FistName().getValue();
		lastname = this.element_contact_LastName().getValue();
		//email = this.element_contact_Email().getValue();
		
		if (this.element_contact_Email().getValue().isEmpty()) {
			this.element_contact_Email().sendKeys("nas@worldticket.net");
		}
		country = this.element_contact_Country().getValue();
		mobilephone = this.element_contact_MobilePhone().getValue();


	}
}
