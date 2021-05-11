package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.CreateTaskPOM2;
import POM.DealModulePOM;
import POM.LoginPom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class View_Edit_Delete_task {
	WebDriver driver;

	@Test
	@Given("^User navigates to Login page$")
	public void user_navigates_to_Login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PASHOKJA\\Desktop\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	@When("^User Enters valid credentials$")
	public void user_Enters_valid_credentials() throws Throwable {
		LoginPom loginpage = PageFactory.initElements(driver, LoginPom.class);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpage.inputemail("priyankajawalkar09@gmail.com");
		loginpage.inputpassword("Priya@123");
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	@When("^User selects tasks section from sidebar menu$")
	public void user_selects_Deals_section_from_sidebar_menu() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.clickNavigationbar();
		task.taskButton();
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	@Then("^User should be redirected to Tasks dashboard$")
	public void user_should_be_redirected_to_Tasks_dashboard() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.clickNavigationbar();
		Thread.sleep(5000);
	}

	@Test(priority = 4)
	@When("^User selects the  from dashboard by clicking on view icon$")
	public void user_selects_the_task_from_dashboard_by_clicking_on_view_icon() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.viewButton();

	}

	@Test(priority = 5)
	@Then("^Existing tasks should be visible with all details$")
	public void existing_task_should_be_visible_with_all_details() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		Thread.sleep(3000);
		task.viewButton();
		driver.close();
	}

	@Test(priority = 6)
	@When("^User selects the deal from dashboard by clicking on edit icon$")
	public void user_selects_the_deal_from_dashboard_by_clicking_on_edit_icon() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.editButton();
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	@Then("^User should be able to edit the deal$")
	public void user_should_be_able_to_edit_the_deal() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		Thread.sleep(3000);
		task.editButton();
		driver.close();
	}

	@Test(priority = 8)
	@When("^User selects the tasks from dashboard by clicking on delete icon$")
	public void user_selects_the_tasks_from_dashboard_by_clicking_on_delete_icon() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.deleteButton();
		Thread.sleep(3000);
		task.deleteButtonAlert();
		Thread.sleep(3000);
	}

	@Test(priority = 10)
	@Then("^User should be able to see task in bin$")
	public void user_should_be_able_to_see_task_in_bin() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.clickBinTasksbutton();
		Thread.sleep(2000);
		task.clickBinTasksbutton();
		Thread.sleep(4000);
		driver.close();
	}
}
