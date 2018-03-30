package pages;

import net.thucydides.core.annotations.DefaultUrl;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://ecom-staging-dat.worldticket.net/")
public class Landing_Page extends PageObject {

	private Method method = new Method();
	private int count = 0;
	
	private boolean is_login_facebook = false;

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
		element.sendKeys("ras_thaitay@hotmail.com");
		//element.sendKeys("Revalution_blue@hotmail.com");
	}

	public void set_password() {
		WebElementFacade element = find(By.id("pass"));
		element.waitUntilVisible();
		element.sendKeys("bladedark@19580");
		//element.sendKeys("022129125");
	}

	public void click_loginOnFacebook() {

		WebElementFacade element = find(By.name("login"));
		element.waitUntilVisible();
		element.click();
	}

	public void drop_image(String path) {

		WebElementFacade element = find(By.xpath("//*[@id='upload-photo']/div/div[2]/div/input"));

		File main_folder = new File(path);

		int fileCount = main_folder.list().length;

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
		for (String handle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(handle);
		}
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
		element.sendKeys(text + " " + "สภาพดีมากครับ");
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
	
	

}
