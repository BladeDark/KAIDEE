package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import starter.*;

@DefaultUrl("https://ecom-staging-dat.worldticket.net/")
public class Landing_Page extends PageObject {

	private Method method = new Method();

	public String origin_Airport;
	public String destination_Airport;
	public String departdate;
	public String returndate;
	
	
	private String URL = CucumberTestSuite.URL;
	
	private boolean Is_write_build = false;

	public void navigateToLandingPage() throws IOException {
		
		if (!Is_write_build ) {
			method.setWindowSize(getDriver());
			setImplicitTimeout(5, TimeUnit.SECONDS);
			getDriver().get(URL);
			URL = this.getBuildversion();
			this.WriteFile();
			resetImplicitTimeout();
			Is_write_build = true;
			this.open();
		}else{
			method.setWindowSize(getDriver());
			this.open();
		}
		
		this.open();
		
	}
	
	private boolean check_txtLanguage(String language){
		
		WebElementFacade element = find(
				By.xpath(".//*[@id='lang-switcher-wrapper-regular']/div/a/span/span[@class='value']"));
		
		element.waitUntilVisible();
		
		if (element.getText().equalsIgnoreCase(language)){
			
			return true;
			
		}else{
			return false;
		}
	}

	public void select_Language(String input) {
		
		boolean chk_language = check_txtLanguage(input);
		
			if (!chk_language){
				WebElementFacade element = find(
						By.xpath(".//*[@id='lang-switcher-wrapper-regular']/div/a/span/span[@class='caret']"));
				element.waitUntilVisible();
				withAction().moveToElement(element).perform();
				/*method.move_holdElement(element, getDriver());

				WebElementFacade click_Language = find(
						By.xpath(".//*[@class='dropdown-content left-hand']//*[text()='" + input + "']"));
				click_Language.waitUntilVisible();
				method.move_holdElement(click_Language, getDriver());
				click_Language.click();*/
			}


	
	}

	public void select_OneWay_TravelType() {

		WebElementFacade element = find(By.id("traveltype-one-way"));
		method.jsClick(element, getDriver());

	}
	
	public void click_logout(){
		
		WebElementFacade element = find(By.xpath("//div[@id='header-account']/ul/li[@class=' last']/a"));
		element.waitUntilVisible();
		element.click();
		
	}

	public void select_Return_TravelType() {

		WebElementFacade element = find(By.id("traveltype-return"));
		method.jsClick(element, getDriver());

	}

	public void select_Origin_Airport(String input) throws InterruptedException  {
		WebElementFacade element = find(By.id("origin"));
		// method.input_DisabledField(getDriver(), element);
		Thread.sleep(500);
		element.clear();
		element.sendKeys(input);
		WebElementFacade clickOrigin = find(By.xpath(".//*[@id='originselect']//*[contains(text(),'" + input + "')]"));
		Thread.sleep(500);
		clickOrigin.waitUntilVisible();
		clickOrigin.click();

		origin_Airport = input;

	}

	@Step
	public void select_Destination_airport(String input) throws InterruptedException {
		WebElementFacade element = find(By.id("destination"));
		// method.input_DisabledField(getDriver(), element);
		element.clear();
		element.sendKeys(input);

		WebElementFacade clickDestination = find(
				By.xpath(".//*[@id='destinationselect']//*[contains(text(),'" + input + "')]"));
		Thread.sleep(1000);
		clickDestination.waitUntilClickable();
		clickDestination.click();

		destination_Airport = input;
		
		
	}
	
	
	public void clickNext_DepartDate() throws InterruptedException{
		
		WebElementFacade element = find(By.xpath("//*[@id='departdatebox']//*[@title='Next']"));
		Thread.sleep(1500);
		element.waitUntilClickable();
		method.jsClick(element, getDriver());
		
	}
	
	
	public void select_Available_Departure_Date() throws InterruptedException {
		Random Dice = new Random(); 
		Thread.sleep(1000);
		List<WebElementFacade> element = findAll(
				"//*[@id='departdatebox']//*[@data-handler='selectDay']/a");
		int n = Dice.nextInt(element.size());
		element.get(n).waitUntilVisible();
		method.jsClick(element.get(n), getDriver());

		WebElementFacade txt_departdate = find(By.id("departdate"));
		departdate = txt_departdate.getValue();
		
		this.display_departure_date(departdate);

	}
	
		@Step("Departure date is: {0}") 
		 public void display_departure_date(String rloc) {
			
		}
	
	public void clickNext_ReturnDate() throws InterruptedException{
		
		WebElementFacade element = find(By.xpath("//*[@id='returndatebox']//*[@title='Next']"));
		Thread.sleep(1000);
		element.waitUntilClickable();
		method.jsClick(element, getDriver());
	}

	public void select_Available_Return_Date() throws InterruptedException {
		Random Dice = new Random(); 
		Thread.sleep(1000);
		List<WebElementFacade> element = findAll(
				"//*[@id='returndatebox']//*[@data-handler='selectDay']/a");
		int n = Dice.nextInt(element.size());
		element.get(n).waitUntilVisible();
		method.jsClick(element.get(n), getDriver());
		WebElementFacade txt_departdate = find(By.id("returndate"));
		returndate = txt_departdate.getValue();
		
		this.display_return_date(returndate);

	}
	
		@Step("Return date is: {0}") 
		 public void display_return_date(String rloc) {
			
		}

	public void select_Passenger_Type(String input) {

		WebElementFacade element = find(By.xpath(".//*[text()='" + input + "']"));
		element.waitUntilVisible();
		element.click();
	}

	public void expand_Passenger() {
		WebElementFacade element = find(By.id("select-child-note"));
		method.jsClick(element, getDriver());
		//element.click();
	}

	public void select_Adult(String input) {
		WebElementFacade element = find(By.id("select-adult"));
		element.selectByValue(input);
	}

	public void select_Child(String input) throws InterruptedException {
		setImplicitTimeout(3, TimeUnit.SECONDS);
		WebElementFacade isUMNRdisplay = find(By.xpath("//*[@id='umnr-text-modal']//button[@class='btn button btn-checkout']"));
		WebElementFacade element = find(By.id("select-child"));
		
		if (isUMNRdisplay.isCurrentlyVisible()){
			Thread.sleep(500);
			isUMNRdisplay.click();
			element.selectByValue(input);
		}else{
		
			element.selectByValue(input);
			
			if (isUMNRdisplay.isCurrentlyVisible()){
				Thread.sleep(500);
				isUMNRdisplay.click();
			}
		}
		
	
		
		resetImplicitTimeout();

	}

	public void select_Infant(String input) {
		WebElementFacade element = find(By.id("select-infant"));
		element.selectByValue(input);
	}

	public void click_Search() {
		WebElementFacade element = find(By.id("btnSearch"));
		element.click();
	}

	// Menu
	public void click_Home_Menu() {
		WebElementFacade element = find(By.xpath(".//*[@id='nav']/li[4]/a"));
		element.click();
	}

	public void click_Booking_Menu() {
		WebElementFacade element = find(By.xpath(".//*[@id='nav']/li[5]/a"));
		element.click();
	}

	public void click_New_Menu() {
		WebElementFacade element = find(By.xpath(".//*[@id='nav']/li[6]/a"));
		element.click();
	}

	public void click_OnlineCheckIn_Menu() {
		WebElementFacade element = find(By.xpath(".//*[@id='nav']/li[7]/a"));
		element.click();
	}

	public void click_BeforeDeparture_Menu() {
		WebElementFacade element = find(By.xpath(".//*[@id='nav']/li[8]/a"));
		element.click();
	}

	public void click_InTheAir_Menu() {
		WebElementFacade element = find(By.xpath(".//*[@id='nav']/li[9]/a"));
		element.click();
	}

	public void click_AfterTravel_Menu() {
		WebElementFacade element = find(By.xpath(".//*[@id='nav']/li[10]/a"));
		element.click();
	}

	public void click_Extra_Menu() {
		WebElementFacade element = find(By.xpath(".//*[@id='nav']/li[11]/a"));
		element.click();
	}

	public void click_Account() {
		WebElementFacade element = find(By.xpath("//*[@id='header-account']/ul/li[1]/a"));
		element.click();
	}

	public void click_LogIn() {
		WebElementFacade element = find(By.xpath("//a[text()='Log In']"));
		element.click();
	}
	
	
	public boolean is_Member_Login(){
		
		WebElementFacade element = find(By.xpath(".//*[@id='header-account']/ul/li[2]/a"));
		
		if (element.getText().equalsIgnoreCase("Log in") || element.getText().equalsIgnoreCase("Log ind")){
			return false;
		}else{
			return true;
		}
	}
	
	private String getBuildversion(){
		WebElementFacade element = find(By.xpath("xhtml:html/xhtml:body/xhtml:pre"));
		
		
		if (element.isVisible()) {
			return element.getText();
		}else{
			return "No build";
		}
	}
	
	private void WriteFile() throws IOException{
		FileInputStream in = new FileInputStream("./serenity.properties");
		Properties props = new Properties();
		props.load(in);
		in.close();

		PrintWriter pw = new PrintWriter(new FileOutputStream("./serenity.properties"));
		props.setProperty("serenity.project.name", "ECOM Report build " + this.URL);
		props.list(pw);
		pw.flush();
		pw.close();
		
	}
	
	
	
	

}
