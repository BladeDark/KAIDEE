package pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.steadystate.css.parser.Locatable;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class Method extends PageObject{

	public String getDayOfWeek(int year, int month, int day) throws ParseException {

		String dateString = String.format("%d-%d-%d", year, month, day);
		Date date = new SimpleDateFormat("yy-M-d").parse(dateString);
		String dayOfWeek = new SimpleDateFormat("E", Locale.ENGLISH).format(date);
		dayOfWeek = dayOfWeek.substring(0, 2) + ".";
		return dayOfWeek;
	}

	public String convertMonth(String month) {

		if (month.equals("01")) {
			month = "Jan";
		} else if (month.equals("02")) {
			month = "Feb";
		} else if (month.equals("03")) {
			month = "Mar";
		} else if (month.equals("04")) {
			month = "Apr";
		} else if (month.equals("05")) {
			month = "May";
		} else if (month.equals("06")) {
			month = "Jun";
		} else if (month.equals("07")) {
			month = "Jul";
		} else if (month.equals("08")) {
			month = "Aug";
		} else if (month.equals("09")) {
			month = "Sep";
		} else if (month.equals("10")) {
			month = "Oct";
		} else if (month.equals("11")) {
			month = "Nov";
		} else if (month.equals("12")) {
			month = "Dec";
		}
		return month;

	}

	public String subStringAirport(String airport) {
		airport = airport.substring(airport.indexOf("(") + 1);
		airport = airport.substring(0, 3);

		return airport;
	}

	// click hidden element
	public void jsClick(WebElementFacade element, WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("return arguments[0].click();", element);
	}

	public void setWindowSize(WebDriver driver) {
		driver.manage().window().setSize(new Dimension(1920, 1080));
		
		//1920x1080
		//1600x900
	}

	public void input_DisabledField(WebDriver driver,WebElementFacade element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('disabled')", element);
	}
	
	/*public void ScrollToElement(WebDriver driver,WebElementFacade element){	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}*/
	
	public void ScrollToSpecificElement(WebDriver driver,WebElementFacade element) throws InterruptedException{	
		Point hoverItem = element.getLocation();
		((JavascriptExecutor)driver).executeScript("return window.title;");  
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+(hoverItem.getY())+");"); 
	}
	
	public void move_holdElement(WebElementFacade element,WebDriver driver){
		Actions abc = new Actions(driver);
		abc.moveToElement(element).perform();
	}
	

}
