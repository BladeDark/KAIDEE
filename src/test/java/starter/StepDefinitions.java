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


	// Page Object
	@Steps
	private static Landing_Page Landing_Page;

	
	String Dir = "C:\\Users\\ras_t\\Desktop\\Shoes";

	

	// ---------- Landing Page----------
	@Given("I am on kaidee website")
	public void givenTheUserIsOnECOM() throws IOException, InterruptedException {
		
		Landing_Page.navigateToLandingPage();
		
		
		
	}
	
	
	@When("^I click sell button$")
	public void i_click_sell_button() throws Exception {
		Thread.sleep(1000);
	   Landing_Page.click_sell_btn();

	}


	@When("^I select \"([^\"]*)\" category$")
	public void i_select_catrgory(String value) throws Exception {
	  
	   Landing_Page.select_category(value);
	
	 
	}

	@When("^I write topic name \"([^\"]*)\"$")
	public void i_write_topic_name(String value) throws Exception {
	    
		Landing_Page.write_topic(value);
		
	}

	@When("^I write price \"([^\"]*)\"$")
	public void i_write_price(String value) throws Exception {
	  
		Landing_Page.write_price(value);
		
	}

	@When("^I drop all images$")
	public void i_drop_all_images() throws Exception {
	    
	 Landing_Page.drop_image(Dir);
	}

	@When("^I fill product details$")
	public void i_fill_product_details() throws Exception {
	    Landing_Page.write_details();
	
	}

	@When("^I select product address$")
	public void i_select_product_address() throws Exception {
	 Landing_Page.select_address();
	 
	}
	
	@When("^I click sell check box$")
	public void i_click_sell_check_box() throws Exception {
		Landing_Page.click_sell_checkbox();
	   
	}


	@When("^I click second hand check box$")
	public void i_click_second_hand_check_box() throws Exception {
		Landing_Page.click_secondhand_checkbox();
	}
	
	@When("^I click submit$")
	public void i_click_submit() throws Exception {
		Landing_Page.click_submit();
		Assert.assertTrue(Landing_Page.is_insert_success());
	}
	
	
	
	
	

	

	



	

}