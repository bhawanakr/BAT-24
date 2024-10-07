package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class AddNewCustPage {
	
	WebDriver ldriver;
	
	public AddNewCustPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);//used to initize web element 
	}
	
	

}
