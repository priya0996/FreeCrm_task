package stepdefinition;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.junit.Test;
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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class InvalidDate {

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
		task.createButton();
		Thread.sleep(2000);

	}

	@Then("^user select particular task and click on view$")
	public void user_select_particular_task_and_click_on_view() throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.viewButton();
		Thread.sleep(2000);
	}

	@Then("^user should see that task$")
	public void user_should_see_that_task() throws Throwable {
		WebDriverWait Mywait = new WebDriverWait(driver, 10);
		Mywait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //*[@id=\"dashboard-toolbar\"]/div[1]")));
		assert driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[1]")).isDisplayed();
		driver.close();

	}

	@When("^user try to add privious date in the  close date$")
	public void user_try_to_add_privious_date_in_the_close_date() throws Throwable {

		driver.switchTo()
				.frame(driver.findElement(By.className("calendarField react-datepicker-ignore-onclickoutside")));
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div[1]/div/input"))
				.click();

		String DueDate = "11/05/2021";
		String currDateStr = driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"))
				.getText();

		Date setDate = new SimpleDateFormat("dd/MM/yyyy").parse(DueDate);
		Date CloseDate = new SimpleDateFormat("MMMM yyyy").parse(currDateStr);

		int monthDiff = Months
				.monthsBetween(new DateTime(CloseDate).withDayOfMonth(1), new DateTime(setDate).withDayOfMonth(1))
				.getMonths();
		boolean isFuture = true;
		if (monthDiff < 0) {
			isFuture = false;
			monthDiff = -1 * monthDiff;
		}
		for (int i = 0; i < monthDiff; i++) {
			if (isFuture)
				driver.findElement(By.xpath(
						"//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div[2]/div[2]/div/div/button[2]"))
						.click();
			else
				driver.findElement(By.xpath(
						"//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div[2]/div[2]/div/div/button[1]"))
						.click();
		}

		String day;
		day = new SimpleDateFormat("dd").format(setDate);
		driver.findElement(By.xpath("//a[text()='" + Integer.parseInt(day) + "']")).click();
	}

	@Then("^application should not add the old date than due date it must be same  date or next date\\.$")
	public void application_should_not_add_the_old_date_than_due_date_it_must_be_same_date_or_next_date()
			throws Throwable {
		CreateTaskPOM2 task = PageFactory.initElements(driver, CreateTaskPOM2.class);
		task.selectDueDate();
		task.selectDate();

		task.closeDate();
		task.selectDate1();

		driver.close();
	}

}
