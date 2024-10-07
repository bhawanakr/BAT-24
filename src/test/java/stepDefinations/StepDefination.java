package stepDefinations;

import org.testng.annotations.AfterMeth;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.time.Duration;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.handler.codec.http.multipart.FileUpload;
import pageObjects.AdminPage;
import utilities.ReadConfig;

public class StepDefination extends Base {

	// Hooks in BDD cucumber
	// @Before
	@Before
	public void setup() throws Exception {
		System.out.println("Set up method will execute before each scenario");

		readConfig = new ReadConfig();// creating object of readconfig java class
		String browserValue = readConfig.getBrowser();// firefox

		if (browserValue.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(2000);

		} else if (browserValue.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(2000);

		} else if (browserValue.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(2000);

		}
	}

	

	@Given("User Lanch Chrome Browser")
	public void user_lanch_chrome_browser() throws Exception {

		admin = new AdminPage(driver);

	}

	@When("User open url {string}")
	public void user_open_url(String Url) throws Exception {
		driver.get(Url);
		Thread.sleep(2000);

	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password, AdminPage admin) {
		admin.setEmail(email);
		admin.setPassword(password);

	}

	@When("User click on Login button")
	public void user_click_on_login_button(AdminPage admin) {

		admin.ClickOnLogin();

	}

	@Then("User verify page title shoud be {string}")
	public void user_verify_page_title_shoud_be(String title) {
		Object AssertJUnit;
		assertEquals("Dashboard / nopCommerce administration", title);
		
	}
		//Add new customer



@When("User click on customers menu")
public void user_click_on_customers_menu() {
    
}

@When("User click on customers menu item")
public void user_click_on_customers_menu_item() {
    }

@When("User User click on new add button")
public void user_user_click_on_new_add_button() {
    
}

@Then("User can view add new customer page")
public void user_can_view_add_new_customer_page() {
    
}

@When("User enter customer info as {string} and {string} and {string} and {string} and {string} and {string} and {string}")
public void user_enter_customer_info_as_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
   }

@When("User click on save button")
public void user_click_on_save_button() {
    
}

@Then("User can view Dashboard")
public void user_can_view_dashboard() {
    
}

@Then("User can view conformation msg {string}")
public void user_can_view_conformation_msg(String string) {
    
}



	
	
	
		

	

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}
	

	@After

	public void teardown(Scenario sc) throws Exception {
		System.out.println("Teardown method will execute after each scenario");
		if (sc.isFailed()) {
		
			String filePath = "C:\\Software\\QE24_Software\\BAT_24_Maven_project\\Screnshot\\FailedScreenshot.png";
			// 1.concertweb driver takescreenshot
			TakesScreenshot scrshot = (TakesScreenshot) driver;

			// 2. we can call get screenshotas
			File scrFile = scrshot.getScreenshotAs(OutputType.FILE);

			File destFile = new File(filePath);
			// 3. we have to copy scrfile refrance to past it into destFile

			driver.quit();
				
		}	

	}
		}

	

	
	
