package stepdefinition;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.CreateTaskPOM2;
import POM.LoginPom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidTitle {
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

	@When("^user enters invalid data in title abd click on save$")
	public void user_enters_invalid_data_in_title_abd_click_on_save() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.createButton();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		task.titleText("ABC  @     -1  23");
		task.savebutton();

	}

	@Then("^user shrould see error message and task should not create$")
	public void user_shrould_see_error_message_and_task_should_not_create() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		boolean b = task.checktitle();
		assertTrue(b);
		driver.close();

	}

}
