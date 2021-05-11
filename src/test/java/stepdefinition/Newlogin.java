package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.CreateTaskPOM2;
import POM.LoginPom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Newlogin {

	WebDriver driver;

	@Given("^browser is open$")
	public void browser_is_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PASHOKJA\\Desktop\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		LoginPom loginpage = PageFactory.initElements(driver, LoginPom.class);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpage.inputemail("priyankajawalkar09@gmail.com");
		loginpage.inputpassword("Priya@123");
		Thread.sleep(2000);

	}

	@When("^user click's on login$")
	public void useer_clicks_on_login() throws Throwable {
		LoginPom loginpage = PageFactory.initElements(driver, LoginPom.class);
		loginpage.clicklogin();
	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		task.clickNavigationbar();
		task.taskButton();
		Thread.sleep(2000);
	}

	@Then("^user click on create button$")
	public void user_click_on_create_button() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.createButton();
		Thread.sleep(2000);

	}

	@Then("^user fills the data$")
	public void user_fills_the_data() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.titleText("Miss Priya");
		Thread.sleep(2000);

		task.assignedTo();
		Thread.sleep(2000);

		task.selectDueDate();
		task.selectDate();

		task.closeDate();
		task.selectDate1();

		task.decriptionText("Description");
		Thread.sleep(2000);

		task.identifierText("Identifier");
		Thread.sleep(2000);

		task.priority();
		Thread.sleep(2000);
		task.selectrpriority();
		Thread.sleep(2000);
		task.status();
		Thread.sleep(2000);
		task.selectStatus();
		Thread.sleep(2000);

		task.accessButton();
		Thread.sleep(2000);

		task.clickaccessfield();
		Thread.sleep(2000);

		task.contactName("Priyanka Jawalkar");
		Thread.sleep(2000);

	}

	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.savebutton();
		driver.close();
	}
}
