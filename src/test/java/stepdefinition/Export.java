package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.CreateTaskPOM2;
import POM.LoginPom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Export {
	WebDriver driver;

	@Test
	@Given("^User goes to login page$")
	public void user_goes_to_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PASHOKJA\\Desktop\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("^User enters valid credential$")
	public void user_enters_valid_credential() throws Throwable {
		LoginPom loginpage = PageFactory.initElements(driver, LoginPom.class);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpage.inputemail("priyankajawalkar09@gmail.com");
		loginpage.inputpassword("Priya@123");
		Thread.sleep(2000);
	}

	@When("^User selects tasks section from sidebar menu$")
	public void user_selects_tasks_section_from_sidebar_menu() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.taskButton();
		Thread.sleep(3000);
	}

	@Then("^User should be redirected to tasks dashboard$")
	public void user_should_be_redirected_to_the_Tasks_dashboard() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.dashboard();
		Thread.sleep(5000);
	}

	@When("^User selects tasks from dashboard and clicks on export option$")
	public void user_selects_tasks_from_dashboard_and_clicks_on_export_option() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.clickexportcnf();
		Thread.sleep(2000);
		task.clickexp();
		Thread.sleep(5000);
		task.clickexportcnf();
		Thread.sleep(2000);
	}

	@Then("^Tasks should be exported to documents section$")
	public void deals_should_be_exported_to_documents_section() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.clickdocument();
		Thread.sleep(2000);
		task.dashboard();
		Thread.sleep(2000);
		task.clickexportcheck();
		Thread.sleep(5000);
		driver.close();
	}

}
