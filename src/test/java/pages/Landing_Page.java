package pages;

import net.thucydides.core.annotations.DefaultUrl;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://ecom-staging-dat.worldticket.net/")
public class Landing_Page extends PageObject {

	
	public int count = 0;
	private boolean is_first_time = true;
	
	
	private Method method = new Method();
	private boolean is_login_facebook = false;
	private boolean is_advertisement_close_homepage = false;

	public void click_close_banner() {
		Actions actions = new Actions(getDriver());
		WebElementFacade element = find(By.xpath(".//a[@data-name='Login']"));
		element.waitUntilVisible();
		actions.moveToElement(element);
		actions.click().build().perform();
	}

	public void navigateToLandingPage() {
	
	

		if (!is_login_facebook){
			this.open();
			getDriver().manage().window().maximize();
			this.click_close_banner();
			this.click_login();
			this.click_fblogin();
			this.set_email();
			this.set_password();
			this.click_loginOnFacebook();
			is_login_facebook = true;
		}else{
			this.open();
		}
		
		
		if (is_first_time){
			is_first_time = false;
		}else{
			count++;
		}
	
		
	}

	public void click_login() {
		WebElementFacade element = find(By.xpath(".//a[@data-name='Login']"));
		element.waitUntilVisible();
		method.jsClick(element, getDriver());

	}

	public void click_fblogin() {
		WebElementFacade element = find(By.id("fb-login"));
		element.waitUntilVisible();
		element.click();
	}

	public void set_email() {

		for (String handle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(handle);
		}

		WebElementFacade element = find(By.id("email"));
		//element.sendKeys("ras_thaitay@hotmail.com");
		element.sendKeys("Revalution_blue@hotmail.com");
	}

	public void set_password() {
		WebElementFacade element = find(By.id("pass"));
		element.waitUntilVisible();
		//element.sendKeys("bladedark@19580");
		element.sendKeys("022129125");
	}

	public void click_loginOnFacebook() {

		WebElementFacade element = find(By.name("login"));
		element.waitUntilVisible();
		element.click();
	}
	
	private void get_current_window(){
		for (String handle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(handle);
		}
	}

	public void drop_image(String path,int count) {

		WebElementFacade element = find(By.xpath("//*[@id='upload-photo']/div/div[2]/div/input"));

		File main_folder = new File(path);

		String[] names = main_folder.list();

		if (main_folder.isDirectory()) {
			File sub_folder = new File(path + "\\" + names[count]);
			if (sub_folder.isDirectory()) {
				String[] images = sub_folder.list();
				
				for (int i=0;i<images.length;i++){
					
					element.sendKeys(path + "\\" + names[count] + "\\" + images[i]);
				}
				count++;
			}
		}

		

	}

	public void click_sell_btn() {
		this.get_current_window();
		WebElementFacade element = find(By.id("bar-sell-button"));
		element.waitUntilVisible();
		element.click();
	}

	public void select_category(String value) throws InterruptedException {
		WebElementFacade element = find(By.id("category"));
		element.waitUntilVisible();
		element.click();
		
		
		Thread.sleep(500);
		
		WebElementFacade element_2 = find(By.xpath("//span[@data-category-id='96']"));
		element_2.waitUntilVisible();
		element_2.click();
		
		if (value.equalsIgnoreCase("Male")){
			WebElementFacade element_3 = find(By.xpath("//span[@data-category-id='128']"));
			element_3.waitUntilVisible();
			element_3.click();
		}else{
			WebElementFacade element_3 = find(By.xpath("//span[@data-category-id='127']"));
			element_3.waitUntilVisible();
			element_3.click();
		}
	}

	public void select_address() throws InterruptedException {
		WebElementFacade element = find(By.xpath("//span[@tabindex='6']"));
		element.waitUntilVisible();
		element.click();
		
		Thread.sleep(500);

		WebElementFacade element_2 = find(By.xpath("//a[@data-province-id='9']"));
		element_2.waitUntilVisible();
		element_2.click();
		
		Thread.sleep(500);

		WebElementFacade element_3 = find(By.xpath("//a[@data-district-id='45']"));
		element_3.waitUntilVisible();
		element_3.click();

	}

	public void write_topic(String text) {
		WebElementFacade element = find(By.id("topic"));
		element.waitUntilVisible();
		element.clear();
		element.sendKeys(text + " " + "");
	}

	public void write_price(String text) {
		WebElementFacade element = find(By.id("price"));
		element.waitUntilVisible();
		element.sendKeys(text);
	}

	public void write_details() {
		WebElementFacade element = find(By.id("detail"));
		element.waitUntilVisible();
		element.sendKeys("สนใจติดต่อสอบถามได้เลยครับ มีตำหนิตรงไหนเราบอกหมด" + "\n" + "Line: @thaiblue" + "\n"
				+ "เราขายแต่ของแท้นะครับ ไม่แท้ยินดีคืนเงินเต็มจำนวน" + "\n" + "EMS: 80 ลงทะเบียน 60" + "\n" + "\n"
				+ "facebook: https://www.facebook.com/thaiblueshop/" + "\n"
				+ "Instagram: https://www.instagram.com/thaiblueshop/" + "\n"
				+ "Website: http://thaiblue.lnwshop.com/");
	}

	public void click_sell_checkbox() {
		WebElementFacade element = find(By.xpath("//input[@id='radio'][@value='2']"));
		element.waitUntilVisible();
		element.click();
	}

	public void click_secondhand_checkbox() {
		WebElementFacade element = find(By.xpath("//input[@id='radio_type'][@value='2']"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_submit() {
		WebElementFacade element = find(By.xpath("//button[@tabindex='8']"));
		element.waitUntilVisible();
		element.click();
	}
	
	public boolean is_insert_success() {
		WebElementFacade element = find(By.xpath("//*[@id='main']/div/div/div/span"));
		
		if (element.isVisible()){
			return true;
		}else{
			return false;
		}
	}
	
	
	public void click_profile() {
		this.get_current_window();
		
		WebElementFacade element = find(By.xpath("//*[@id='user-menu-item']/p/span/a/span[2]"));
		element.waitUntilVisible();
		element.click();
	}
	
	public void click_myAdvert() {
		
		
		WebElementFacade element = find(By.xpath("//a[@accesskey='a']"));
		element.waitUntilVisible();
		element.click();
		
	}
	
	public void click_close_advertise_on_myAdvert(){
		
		if (!is_advertisement_close_homepage) {
			WebElementFacade element = find(By.xpath("//a[@class='df-icon-dfclose']"));
			element.waitUntilVisible();
			element.click();
			is_advertisement_close_homepage = true;
		}
		
	
		
	}
	
	
	
	public void remove_first_advertisement(String topic,String imagePath) throws InterruptedException{
		
		
		
			this.click_profile();
			this.click_myAdvert();
			this.click_close_advertise_on_myAdvert();
			
	
		
		
		
		WebElementFacade element = find(By.xpath("//*[@id='member-page']/div/section/div/div/ul/li[1]/a"));
		
		boolean Is_advertise_visible = element.isVisible() ;
		boolean first_time = false ;
		
		do {
			
			if (first_time) {
				this.click_profile();
				this.click_myAdvert();
				this.click_close_advertise_on_myAdvert();
				
			}
			
			this.click_first_advertisement();
			this.click_edit_advertisement();
			
			this.click_edit_advertisement_popup();
			
			this.write_topic(topic);
			this.delete_picture();
			this.drop_image_editcase(imagePath);
			this.click_submit();
			this.is_insert_success();
			Thread.sleep(8000);
			first_time = true;
			
			
			
		}while(Is_advertise_visible);
		
		
		
	}
	
	private void click_first_advertisement(){
		WebElementFacade element = find(By.xpath("//*[@id='member-page']/div/section/div/div/ul/li[1]/a"));
		element.waitUntilVisible();
		element.click();
		
	}
	
	private void click_edit_advertisement(){
		WebElementFacade element = find(By.xpath("//ul[@class='additional-info  reset']/li[6]/a"));
		element.waitUntilVisible();
		element.click();
	}
	
	private void click_edit_advertisement_popup(){
		
		
			WebElementFacade element = find(By.xpath("//div[@class='item-action-modal']/a[1]"));
			element.waitUntilVisible();
			element.click();
		
		}
		
	
	
	private void delete_picture() throws InterruptedException{
		List<WebElementFacade> element = findAll("//ul[@class='list-image reset']/li");
		WebElementFacade remove_element = find(By.xpath("//ul[@class='list-image reset']/li[1]/span[1]"));
		
		for (int i=0;i<element.size();i++) {
			remove_element.waitUntilVisible();
			remove_element.click();
			
		}
	}
	
	
	private void drop_image_editcase(String path) {
		WebElementFacade element = find(By.xpath("//*[@id='upload-photo']/div/div[2]/div/input"));
		element.sendKeys(path);
	}


	
	
}
