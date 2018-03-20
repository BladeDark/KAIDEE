package starter;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import pages.*;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions extends PageObject {

	private String TravelType;

	// Page Object
	@Steps
	private static Landing_Page Landing_Page;

	private static Flights_Page Flights_Page;
	private static Booking_Summary Booking_Summary;
	private static Passenger_Page Passenger_Page;

	@Steps
	private static Checkout_Page Checkout_Page;

	@Steps
	private static ThankYou_Page ThankYou_Page;

	private static Package_Page Package_Page;
	private static DIBS DIBS;
	private static Emerchantpay Emerchantpay;
	private static Extras_Page Extras_Page;
	private static LogIn_Page LogIn_Page;
	private static Manage_Booking_Page Manage_Booking_Page;
	private static Cancel_Passenger_Page Cancel_Passenger_Page;

	// ---------- Landing Page----------
	@Given("I am on world ticket website")
	public void givenTheUserIsOnECOM() throws IOException {

		try {
			Landing_Page.navigateToLandingPage();
		} catch (UnhandledAlertException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		} catch (NoSuchElementException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		}

	}

	@Given("^I select language to \"([^\"]*)\"$")
	public void i_select_language_to(String input) throws Throwable {

		Landing_Page.select_Language(input);

	}

	@When("^I select \"([^\"]*)\" on origin airport$")
	public void i_select_on_origin_airport(String input) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.select_Origin_Airport(input);
	}

	@When("^I select \"([^\"]*)\" on destination airport$")
	public void i_select_on_destination_airport(String input) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Landing_Page.select_Destination_airport(input);
	}

	@When("^I select available departure date$")
	public void i_select_available_departure_date() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.clickNext_DepartDate();
		Landing_Page.select_Available_Departure_Date();
	}

	@When("^I select available departure date for change date$")
	public void i_select_available_departure_date_for_change_date() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.select_Available_Departure_Date();
	}

	@When("^I select available return date$")
	public void i_select_available_return_date() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.clickNext_ReturnDate();
		Landing_Page.select_Available_Return_Date();
	}

	@When("^I select available return date for change date$")
	public void i_select_available_return_date_for_change_date() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.select_Available_Return_Date();
	}

	@When("^I select \"([^\"]*)\" for travel type$")
	public void i_select_for_travel_type(String input) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (input.equalsIgnoreCase("OneWay")) {

			Landing_Page.select_OneWay_TravelType();
			TravelType = input;
		} else if (input.equalsIgnoreCase("Return")) {
			TravelType = input;
			Landing_Page.select_Return_TravelType();
		}

	}

	@When("^I select \"([^\"]*)\" for passenger type$")
	public void i_select_for_passenger_type(String input) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.select_Passenger_Type(input);
	}

	@When("^I click expand passenger$")
	public void i_click_expand_passenger() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.expand_Passenger();
	}

	@When("^I select \"([^\"]*)\" Adult$")
	public void i_select_Adult(String input) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.select_Adult(input);
	}

	@When("^I select \"([^\"]*)\" Child$")
	public void i_select_Child(String input) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.select_Child(input);
	}

	@When("^I select \"([^\"]*)\" Infant$")
	public void i_select_Infant(String input) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.select_Infant(input);
	}

	@When("^I click search button$")
	public void i_click_search_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Landing_Page.click_Search();
	}

	// ---------- Flight Page----------
	@Then("^I am on flight page$")
	public void i_am_on_selected_Flights_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		try {
			Assert.assertTrue(Flights_Page.flight_Page_Is_Open());
		} catch (UnhandledAlertException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		} catch (NoSuchElementException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		}

	}

	@Then("^I check information must show as selected on flight page$")
	public void i_check_information_must_show_as_selected_on_Flights_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		if (TravelType.equalsIgnoreCase("OneWay")) {
			// Table

			Assert.assertTrue(Flights_Page.get_Outbound_Date().contains(Landing_Page.departdate));
			Assert.assertTrue(Flights_Page.get_Table_Outbound_OriginAirport().contains(Landing_Page.origin_Airport));
			Assert.assertTrue(
					Flights_Page.get_Table_Outbound_DestinationAirport().contains(Landing_Page.destination_Airport));

			// Summary
			/*
			 * this.booking_summary_check_outbound();
			 * 
			 * Assert.assertTrue(Booking_Summary.get_Total().contains(
			 * Flights_Page.outbound_fare));
			 */

		} else if (TravelType.equalsIgnoreCase("Return")) {
			// table Outbound
			Assert.assertTrue(Flights_Page.get_Outbound_Date().contains(Landing_Page.departdate));
			Assert.assertTrue(Flights_Page.get_Table_Outbound_OriginAirport().contains(Landing_Page.origin_Airport));
			Assert.assertTrue(
					Flights_Page.get_Table_Outbound_DestinationAirport().contains(Landing_Page.destination_Airport));

			// table Inbound
			Assert.assertTrue(Flights_Page.get_Inbound_Date().contains(Landing_Page.returndate));
			Assert.assertTrue(
					Flights_Page.get_Table_Inbound_OriginAirport().contains(Landing_Page.destination_Airport));
			Assert.assertTrue(
					Flights_Page.get_Table_Inbound_DestinationAirport().contains(Landing_Page.origin_Airport));

			// Summary outbound
			// this.booking_summary_check_outbound();
			// Summary Inbound
			// this.booking_summary_check_inbound();

			/*
			 * String outbound_price = Flights_Page.outbound_fare;
			 * outbound_price = outbound_price.substring(0,
			 * outbound_price.indexOf(" "));
			 * 
			 * String inbound_price = Flights_Page.inbound_fare; inbound_price =
			 * inbound_price.substring(0, inbound_price.indexOf(" "));
			 * 
			 * outbound_price = outbound_price.replace(",", ""); inbound_price =
			 * inbound_price.replace(",", "");
			 * 
			 * System.out.println(outbound_price);
			 * System.out.println(inbound_price);
			 * 
			 * float total = Float.parseFloat(outbound_price) +
			 * Float.parseFloat(inbound_price);
			 * Assert.assertTrue(Booking_Summary.get_Total().contains(String.
			 * valueOf(total)));
			 */

		}

	}

	@Then("^I select outbound flight list$")
	public void i_select_outbound_flight_list() throws Throwable {
		try {
			Flights_Page.select_Flight_List_Outbound();
		} catch (UnhandledAlertException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		} catch (NoSuchElementException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		}

	}

	@Then("^I select inbound flight list$")
	public void i_select_inbound_flight_list() throws Throwable {
		Flights_Page.select_Flight_List_Inbound();
	}

	@Then("^I click continue button on flight page$")
	public void i_click_continue_button_on_flight() throws Throwable {
		Flights_Page.click_Continue();
	}

	// -------------- Passenger page ---------------------
	@Then("^I am on passenger page$")
	public void i_am_on_passenger_page() throws Throwable {

		try {
			Assert.assertTrue(Passenger_Page.passenger_Page_Is_Open());
		} catch (UnhandledAlertException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		} catch (NoSuchElementException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		}

	}

	@Then("^I click proceed as a guest$")
	public void i_click_proceed_as_a_guest() throws Throwable {
		Passenger_Page.click_Proceed_as_a_guest();
	}

	@Then("^I fill all information of all passengers$")
	public void i_fill_all_information_of_all_passengers() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Passenger_Page.fill_passengers_information();
		Passenger_Page.copy_contact_passenger_infomration();
	}

	@Then("^I click Go directly to payment on passenger page$")
	public void i_click_Go_directly_to_payment() throws Throwable {

		Passenger_Page.click_Go_directly_to_Payment();

	}

	@Then("^I click Go directly to payment on package page$")
	public void i_click_Go_directly_to_payment_package() throws Throwable {
		Package_Page.is_Package_Select = false;
		Package_Page.click_Go_directly_to_Payment();

	}

	@Then("^I click Go directly to payment on extras page$")
	public void i_click_Go_directly_to_payment_extras() throws Throwable {
		Extras_Page.click_Go_directly_to_Payment();

	}

	@Then("^I click Continue on extras page")
	public void i_click_continue_extras() throws Throwable {
		Extras_Page.click_Continue();

	}

	// ------------------- Check out page ----------------
	@Then("^I am on Check out page$")
	public void i_am_on_Check_out_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		try {
			Assert.assertTrue(Checkout_Page.checkout_Page_Is_Open());
		} catch (UnhandledAlertException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		} catch (NoSuchElementException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		}

	}

	@Then("^I check information on Check out page on additional feature$")
	public void i_check_information_on_additional_feature() throws Throwable {
		if (Landing_Page.theme.equalsIgnoreCase("NORMAL")) {
			String Get_Total = Booking_Summary.get_Total();
			Checkout_Page.get_sum_fare(Get_Total);
		}else{
			
		}
		
	}

	@Then("^I check information on Check out page$")
	public void i_check_information_on_Check_out_page() throws Throwable {

		if (Landing_Page.theme.equalsIgnoreCase("NORMAL")) {
			if (TravelType.equalsIgnoreCase("OneWay")) {

				// check total amount
				String Grand_Total = Checkout_Page.get_Grand_Total();
				String Get_Total = Booking_Summary.get_Total();

				Checkout_Page.get_chk_fare(Grand_Total);
				Checkout_Page.get_sum_fare(Get_Total);
				Assert.assertTrue(Grand_Total.contains(Get_Total));

			} else if (TravelType.equalsIgnoreCase("Return")) {

				// check total amount
				String Grand_Total = Checkout_Page.get_Grand_Total();
				String Get_Total = Booking_Summary.get_Total();
				Checkout_Page.get_chk_fare(Grand_Total);
				Checkout_Page.get_sum_fare(Get_Total);
				Assert.assertTrue(Grand_Total.contains(Get_Total));

			}
		} else {
			if (TravelType.equalsIgnoreCase("OneWay")) {

				// check total amount
				String Grand_Total = Checkout_Page.get_Grand_Total();
	

				Checkout_Page.get_chk_fare(Grand_Total);

			} else if (TravelType.equalsIgnoreCase("Return")) {

				// check total amount
				String Grand_Total = Checkout_Page.get_Grand_Total();	
				Checkout_Page.get_chk_fare(Grand_Total);
			

			}
		}

	}

	@Then("^I pay with \"([^\"]*)\" payment and check agreement$")
	public void i_pay_with_payment(String input) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		if (input.equalsIgnoreCase("Cash")) {
			Checkout_Page.click_CashOnDelivery_Payment();
			Checkout_Page.click_Agreement();
			Checkout_Page.click_Place_Order();
		} else if (input.equalsIgnoreCase("DIBS")) {
			Checkout_Page.click_DIBS_Payment();
			Checkout_Page.click_Agreement();
			Checkout_Page.click_Place_Order();

			Assert.assertTrue(DIBS.visa_IsVisible());
			DIBS.click_Visa();
			DIBS.set_CardNumber("4711100000000000");
			DIBS.set_ExpiryMonth("06");
			DIBS.set_ExpiryYear("24");
			DIBS.set_CVC("684");
			DIBS.click_Validate_payment();

		} else if (input.equalsIgnoreCase("Emerchantpay")) {

			Checkout_Page.click_eMerchant_Payment();
			Checkout_Page.click_Agreement();
			Checkout_Page.click_Place_Order();

			Assert.assertTrue(Emerchantpay.customerEmail_IsVisible());
			Emerchantpay.set_CustomerEmail("normal_atm@worldticket.net");
			Emerchantpay.set_Firstname("Narongsak");
			Emerchantpay.set_Lastname("Sakulchaikaew");
			Emerchantpay.set_Address1("BKK");
			Emerchantpay.set_City("BKK");
			Emerchantpay.set_Zipcode("10120");

			Emerchantpay.set_Cardholder("Narongsak Sakulchaikaew");
			Emerchantpay.set_Cardnumber("4711100000000000");
			Emerchantpay.set_Expiry_Month("6");
			Emerchantpay.set_Expiry_Year("2024");
			Emerchantpay.set_CVV("684");
			Emerchantpay.click_ackBox();
			Emerchantpay.click_Pay();
		} else if (input.equalsIgnoreCase("Debit/Credit")) {
			Checkout_Page.click_DebitCreditAC();
			Checkout_Page.click_Agreement();
			Checkout_Page.click_Place_Order();

		}

	}

	@Then("^I check booking is successful$")
	public void i_check_booking_is_successful() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		ThankYou_Page.get_Record_Locator();
		String rloc = ThankYou_Page.record_locator;
		ThankYou_Page.get_rloc(rloc);

		Assert.assertTrue(ThankYou_Page.get_ThankYou_Message());
		Assert.assertTrue(ThankYou_Page.check_Error());

	}

	public void booking_summary_check_outbound() {
		int outbound_segnment = 1;
		for (int i = 0; i < Flights_Page.amount_flight_segment_outbound; i++) {

			String summary_outbound = Booking_Summary.get_Summary_Outbound_FlightNo_DepartureTime_DepartureDate(
					Flights_Page.outbound_FlightNo[i], String.valueOf(outbound_segnment));
			Assert.assertTrue(
					Booking_Summary.get_Summary_Outbound_OriginAirport().contains(Landing_Page.origin_Airport));
			Assert.assertTrue(Booking_Summary.get_Summary_Outbound_DestinationAirport()
					.contains(Landing_Page.destination_Airport));
			// Assert.assertTrue(summary_outbound.contains(Flights_Page.outbound_FlightNo[i]));
			Assert.assertTrue(summary_outbound.contains(Flights_Page.outbound_Departure_Time[i]));
			Assert.assertTrue(summary_outbound.contains(Landing_Page.departdate));
			outbound_segnment = outbound_segnment + 1;
		}

	}

	public void booking_summary_check_inbound() {
		int inbound_segnment = 1;
		for (int j = 0; j < Flights_Page.amount_flight_segment_inbound; j++) {
			String summary_inbound = Booking_Summary.get_Summary_Inbound_FlightNo_DepartureTime_DepartureDate(
					Flights_Page.inbound_FlightNo[j], String.valueOf(inbound_segnment));
			Assert.assertTrue(
					Booking_Summary.get_Summary_Inbound_OriginAirport().contains(Landing_Page.destination_Airport));
			Assert.assertTrue(
					Booking_Summary.get_Summary_Inbound_DestinationAirport().contains(Landing_Page.origin_Airport));
			// Assert.assertTrue(summary_inbound.contains(Flights_Page.inbound_FlightNo[j]));
			Assert.assertTrue(summary_inbound.contains(Flights_Page.inbound_Departure_Time[j]));
			Assert.assertTrue(summary_inbound.contains(Landing_Page.returndate));
			inbound_segnment = inbound_segnment + 1;
		}
	}

	@Then("^I click continue on passenger page$")
	public void i_click_continue_on_passenger_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Passenger_Page.click_Continue_AddOns();
	}

	@Then("^I am on Package page$")
	public void i_am_on_package_page() throws Throwable {

		try {
			Package_Page.pacakage_Page_Is_Open();
		} catch (UnhandledAlertException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		} catch (NoSuchElementException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		}

	}

	@Then("^I select all passenger on package$")
	public void i_select_all_passengers() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Package_Page.select_CheckBox_All_Passengers();

	}

	@Then("^I change to first route tab on package$")
	public void i_change_to_first_route_tab_on_package() throws Throwable {

		Package_Page.click_Route_Tab_1();
	}

	@Then("^I change to second route tab on package$")
	public void i_change_to_second_route_tab_on_package() throws Throwable {

		Package_Page.click_Route_Tab_2();
	}

	@Then("^I change to third route tab on package$")
	public void i_change_to_third_route_tab_on_package() throws Throwable {

		Package_Page.click_Route_Tab_3();
	}

	@Then("^I change to fourth route tab on package$")
	public void i_change_to_fourth_route_tab_on_package() throws Throwable {

		Package_Page.click_Route_Tab_4();
	}

	@Then("^I change to first route tab on extras$")
	public void i_change_to_first_route_tab_on_extras() throws Throwable {
		Extras_Page.click_Route_Tab_1();
	}

	@Then("^I change to second route tab on extras$")
	public void i_change_to_second_route_tab_on_extras() throws Throwable {
		Extras_Page.click_Route_Tab_2();
	}

	@Then("^I change to third route tab on extras$")
	public void i_change_to_third_route_tab_on_extras() throws Throwable {
		Extras_Page.click_Route_Tab_3();
	}

	@Then("^I change to fourth route tab on extras$")
	public void i_change_to_fourth_route_tab_on_extras() throws Throwable {
		Extras_Page.click_Route_Tab_4();
	}

	@Then("^I select one of all packages for first route$")
	public void i_select_one_of_all_packages_for_1_route() throws Throwable {
		Package_Page.select_One_PK_Item_Route_1();
	}

	@Then("^I select one of all packages for second route$")
	public void i_select_one_of_all_packages_for_2_route() throws Throwable {
		Package_Page.select_One_PK_Item_Route_2();
	}

	@Then("^I select one of all packages for third route$")
	public void i_select_one_of_all_packages_for_3_route() throws Throwable {
		Package_Page.select_One_PK_Item_Route_3();
	}

	@Then("^I select one of all packages for fourth route$")
	public void i_select_one_of_all_packages_for_4_route() throws Throwable {
		Package_Page.select_One_PK_Item_Route_4();
	}

	@Then("^I click continue on package page$")
	public void i_click_continue_on_passenger() throws Throwable {

		Package_Page.click_Continue_Extras();
	}

	@Then("^I am on extras page$")
	public void i_am_on_extras_page() throws Throwable {

		try {
			Extras_Page.extras_Page_Is_Open();
		} catch (UnhandledAlertException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		} catch (NoSuchElementException f) {
			try {

				Alert alert = getDriver().switchTo().alert();
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		}

	}

	@Then("^I select all passenger on extras$")
	public void i_select_all_passenger_on_extras_inbound() throws Throwable {

		Extras_Page.select_CheckBox_All_Passengers();
	}

	@Then("^I select one of all extras for first route$")
	public void i_select_one_of_all_extras_for_route_1() throws Throwable {
		Extras_Page.select_One_Extras_Item_For_Route_1();
	}

	@Then("^I select one of all extras for second route$")
	public void i_select_one_of_all_extras_for_route_2() throws Throwable {
		Extras_Page.select_One_Extras_Item_For_Route_2();
	}

	@Then("^I select one of all extras for third route$")
	public void i_select_one_of_all_extras_for_route_3() throws Throwable {
		Extras_Page.select_One_Extras_Item_For_Route_3();
	}

	@Then("^I select one of all extras for fourth route$")
	public void i_select_one_of_all_extras_for_route_4() throws Throwable {
		Extras_Page.select_One_Extras_Item_For_Route_4();
	}

	@Then("^I fill Record Locator and Last name$")
	public void i_fill_Record_Locator_and_Last_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LogIn_Page.set_Record_Locator(ThankYou_Page.record_locator);
		LogIn_Page.set_LastName(Passenger_Page.lastname);
	}

	@Then("^I click Login button on login page for Record Locator$")
	public void i_click_Login_button_on_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LogIn_Page.click_LogIn_for_RecordLocator();
	}

	@Given("^I login normal user successfully$")
	public void i_login_successfully() throws Throwable {

		if (Landing_Page.theme.equalsIgnoreCase("NORMAL")) {
			if (!Landing_Page.is_Member_Login()) {
				Landing_Page.click_Account();
				LogIn_Page.set_Email("normal_atm@worldticket.net");
				LogIn_Page.set_Password("atm1234");
				LogIn_Page.click_LogIn_for_User();
				Landing_Page.click_Home_Menu();
				Assert.assertTrue(Landing_Page.is_Member_Login());

			} else if (Landing_Page.is_Corporate_login()) {
				Landing_Page.click_logOut();
				Landing_Page.click_Account();
				LogIn_Page.set_Email("normal_atm@worldticket.net");
				LogIn_Page.set_Password("atm1234");
				LogIn_Page.click_LogIn_for_User();
				Landing_Page.click_Home_Menu();
				Assert.assertTrue(Landing_Page.is_Member_Login());
			}

		} else {

			Landing_Page.click_LogIn();
			LogIn_Page.click_login();
			LogIn_Page.set_Email("normal_atm@worldticket.net");
			LogIn_Page.set_Password("atm1234");
			LogIn_Page.click_LogIn_for_User();
			Assert.assertTrue(Landing_Page.Check_Member_Login_withLogOutText());
			LogIn_Page.click_DAT_Img();
		}

	}

	@Given("^I Login with rloc and lastname$")
	public void i_login_with_rloc_and_lastname() {

		if (Landing_Page.theme.equalsIgnoreCase("NORMAL")) {
			if (!Landing_Page.is_Member_Login()) {
				Landing_Page.click_Account();
				LogIn_Page.set_Record_Locator(ThankYou_Page.record_locator);
				LogIn_Page.set_LastName("WorldTicket");
				LogIn_Page.click_LogIn_for_RecordLocator();
				Assert.assertTrue(Landing_Page.is_Member_Login());
			} else {
				Landing_Page.click_LogIn();
				LogIn_Page.set_Record_Locator(ThankYou_Page.record_locator);
				LogIn_Page.set_LastName("WorldTicket");
				LogIn_Page.click_LogIn_for_RecordLocator();
				Assert.assertTrue(Landing_Page.Check_Member_Login_withLogOutText());
				LogIn_Page.click_DAT_Img();
			}

		}

	}

	@Given("^I login corporate user successfully$")
	public void i_login_corporate_successfully() throws Throwable {

		if (Landing_Page.theme.equalsIgnoreCase("NORMAL")) {
			if (!Landing_Page.is_Member_Login()) {
				Landing_Page.click_Account();
				LogIn_Page.set_Email("corporate_atm@worldticket.net");
				LogIn_Page.set_Password("atm1234");
				LogIn_Page.click_LogIn_for_User();
				Landing_Page.click_Home_Menu();
				Assert.assertTrue(Landing_Page.is_Member_Login());

			} else if (!Landing_Page.is_Corporate_login()) {
				Landing_Page.click_logOut();
				Landing_Page.click_Account();
				LogIn_Page.set_Email("corporate_atm@worldticket.net");
				LogIn_Page.set_Password("atm1234");
				LogIn_Page.click_LogIn_for_User();
				Landing_Page.click_Home_Menu();
				Assert.assertTrue(Landing_Page.is_Member_Login());
			}
		} else {
			Landing_Page.click_LogIn();
			LogIn_Page.click_login();
			LogIn_Page.set_Email("corporate_atm@worldticket.net");
			LogIn_Page.set_Password("atm1234");
			LogIn_Page.click_LogIn_for_User();
			Assert.assertTrue(Landing_Page.Check_Member_Login_withLogOutText());
		}

	}

	@Then("^I click Manage Booking on Thank you page$")
	public void i_click_Manage_Booking_on_Thank_you_page() {
		ThankYou_Page.click_Manage_Booking();

	}

	@Then("^I am on Manage Booking page$")
	public void i_am_on_Manage_Booking_page() {
		Assert.assertTrue(Manage_Booking_Page.manage_booking_Is_Open().contains("FLIGHT BOOKING"));

	}

	@Then("^I click on buy extras on Manage Booking Page$")
	public void i_click_on_buy_extras_on_Manage_Booking_Page() {
		Manage_Booking_Page.click_Buy_Extras();
	}

	@Then("^I click on change name on Manage Booking Page$")
	public void i_click_on_change_name_on_Manage_Booking_Page() {
		Manage_Booking_Page.click_Change_Name();
	}

	@Then("^I click on cancel flight on Manage Booking Page$")
	public void i_click_on_cancel_flight_on_Manage_Booking_Page() {
		Manage_Booking_Page.click_Cancel_Flight();
	}

	@Then("^I click on cancel booking on Manage Booking Page$")
	public void i_click_on_cancel_booking_on_Manage_Booking_Page() {
		Manage_Booking_Page.click_Cancel_Booking();
	}

	@Then("^I click on cancel passenger on Manage Booking Page$")
	public void i_click_on_cancel_passenger_on_Manage_Booking_Page() {
		Manage_Booking_Page.click_Cancel_Passenger();
	}

	@Then("^I click on change date on Manage Booking Page$")
	public void i_click_on_change_date_on_Manage_Booking_Page() {
		Manage_Booking_Page.click_Change_Date();
	}

	@Then("^I select all passenger on change name form$")
	public void i_select_all_passenger() {
		Manage_Booking_Page.select_All_Passengers_on_ch_form();

		Manage_Booking_Page.click_Yes_On_Changename_form();
	}

	@Then("^I select one passenger on change name form$")
	public void i_select_one_passenger() {
		Manage_Booking_Page.select_one_Passengers_on_ch_form();

		Manage_Booking_Page.click_Yes_On_Changename_form();
	}

	@Then("^I change name for all passengers$")
	public void i_change_name_for_all_passengers() {
		Passenger_Page.change_name_all_passenger();
	}

	@Then("^I click outbound segment on change date form$")
	public void i_click_outbound_segment() {
		Manage_Booking_Page.click_outbound_segment();
	}

	@Then("^I click inbound segment on change date form$")
	public void i_click_inbound_segment() {
		Manage_Booking_Page.click_inbound_segment();
	}

	@Then("^I click Yes on rebook form$")
	public void i_click_yes_on_rebook_form() {
		Manage_Booking_Page.click_Yes_On_Rebook_form();
	}

	@Then("^I click departure date on booking form$")
	public void i_click_departure_date_on_booking_form() {
		Flights_Page.click_Departure();
	}

	@Then("^I click return date on booking form$")
	public void i_click_return_date_on_booking_form() {
		Flights_Page.click_Return();
	}

	@Then("^I click cancel outbound flight on cancelled form$")
	public void i_click_outbound_on_cancel_form() {
		Manage_Booking_Page.click_cancel_outbound();
	}

	@Then("^I click cancel inbound flight on cancelled form$")
	public void i_click_inbound_form_on_cancel_form() {
		Manage_Booking_Page.click_cancel_inbound();
	}

	@Then("^I click Yes on cancelled flight form$")
	public void i_click_yes_on_cancell_flight_form() {
		Manage_Booking_Page.click_Yes_on_Cancellation_Flight();
		Assert.assertTrue(Manage_Booking_Page.check_success_cancel());
	}

	@Then("^I click Yes on cancelled passenger form$")
	public void i_click_yes_on_cancell_passenger_form() {
		Cancel_Passenger_Page.click_Yes();
	}

	@Then("^I click submit on cancelled passenger form$")
	public void i_click_submit_on_cancell_passenger_form() {
		Cancel_Passenger_Page.click_submit();
		Assert.assertTrue(Manage_Booking_Page.check_success_cancel());
	}

	@Then("^I click Yes on cancelled booking form$")
	public void i_click_yes_on_cancell_booking_form() {
		Manage_Booking_Page.click_Yes_on_Cancellation_Booking();
		Assert.assertTrue(Manage_Booking_Page.check_success_cancel());
	}

	@Then("^I click search button on change date$")
	public void i_click_search_button_on_change_date() {
		Flights_Page.click_Search();

	}

	@Then("^I click to cancel \"(.*)\" adult on cancel passenger form$")
	public void i_click_adult_to_cancel_on_cancel_passenger_form(int input) throws Throwable {
		Cancel_Passenger_Page.click_one_Adult(input);
	}

	@Then("^I click to cancel \"(.*)\" child on cancel passenger form$")
	public void i_click_child_to_cancel_on_cancel_passenger_form(int input) throws Throwable {
		Cancel_Passenger_Page.click_one_Child(input);
	}

	@Then("^I click to cancel \"(.*)\" infant on cancel passenger form$")
	public void i_click_infant_to_cancel_on_cancel_passenger_form(int input) throws Throwable {
		Cancel_Passenger_Page.click_one_Infant(input);
	}

}
