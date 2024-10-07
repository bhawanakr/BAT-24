package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	WebDriver ldriver;

	public AdminPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements( rdriver,this);

	}

	// java project
	// WebElement email=driver.findElement(By.Xpath("//input[@id='Email']"));

	// Maven project
	@FindBy(xpath = "//input[@id='Email']")
	WebElement textEmail;// email

	@FindBy(xpath = "input[@id='password']")
	WebElement textPassword;// password

	@FindBy(xpath = "//button[text()='Login']")
	WebElement btnLogin;// Login

	// user defined method to perform operation on above web element

	public void setEmail(String email) {
		textEmail.clear();
		textEmail.sendKeys(email);
	}

	public void setPassword(String pwd) {
		textPassword.clear();
		textPassword.sendKeys(pwd);
	}

	public void ClickOnLogin() {
		btnLogin.click();
	}

}
