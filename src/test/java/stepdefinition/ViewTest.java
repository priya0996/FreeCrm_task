package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.CreateTaskPOM2;
import POM.LoginPom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ViewTest {
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
	public void user_click_s_on_login() throws Throwable {
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

	@Then("^user click on view button$")
	public void user_click_on_view_button() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.viewButton();
	}

	@Then("^user select particular task and click on view$")
	public void user_select_particular_task_and_click_on_view() throws Throwable {

		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.viewButton();
		Thread.sleep(2000);
	}

	@Then("^User should see that task$")
	public void user_should_see_that_task1() throws Throwable {
		WebDriverWait Mywait = new WebDriverWait(driver, 10);
		Mywait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //*[@id=\"dashboard-toolbar\"]/div[1]")));
		assert driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[1]")).isDisplayed();
		driver.close();

	}

	@When("^user try to add documents in the view$")
	public void user_try_to_add_documents_in_the_view() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);

		task.documents();
		Thread.sleep(2000);

	}

	@Then("^application should not add the documents\\.$")
	public void application_should_not_add_the_documents() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);

		task.documentsDropHere();
		task.getCount();

	}

}
