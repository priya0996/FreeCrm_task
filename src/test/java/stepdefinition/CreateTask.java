package stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.CreateTaskPOM2;
import POM.LoginPom;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
public class CreateTask {
	
	private ChromeDriver driver;
	private String desc;
	
	
	@Test(priority=1)
	@Given("^user is on  login page$")
	public void user_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PASHOKJA\\Desktop\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();

	}
	@Test(priority=2)
	@When("^user enters valid  Email and password$")
	public void user_enters_valid_Email_and_password(DataTable arg1) throws Throwable {
		LoginPom loginpage=PageFactory.initElements(driver, LoginPom.class);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpage.inputemail("priyankajawalkar09@gmail.com");
		loginpage.inputpassword("Priya@123");
		loginpage.clicklogin();
	}
	@Test(priority=3)
	@Then("^user is in home page$")
	public void user_is_in_home_page() throws Throwable {
		CreateTaskPOM2 task=PageFactory.initElements(driver, CreateTaskPOM2.class);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		task.clickNavigationbar();
		task.taskButton();
	}
	@Test(priority=4)
	@Then("^user clicks on Tasks link in left navbar$")
	public void user_clicks_on_Tasks_link_in_left_navbar() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[7]")).click();
	}
	@Test(priority=5)
	@Then("^user should redirected to Task page$")
	public void user_should_redirected_to_Task_page() throws Throwable {
		Thread.sleep(10000);
	    String text = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[2]/div/div/input")).getText();
	    Assert.assertEquals(text, "Task");
	    
	}
	@Test(priority=6)
	@Given("^User click on create button$")
	public void user_click_on_create_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button/i")).click();
		
	}
	@Test(priority=7)
	@Given("^user is directed to create task page$")
	public void user_is_directed_to_create_task_page() throws Throwable {
		String text = driver.findElement(By.xpath("//div[@class=\'ui header item mb5 light-black\']")).getText();
	    Assert.assertEquals(text, "Create new Task");
		
		
	}
	@Test(priority=8)
	@When("^user fill the fields like  \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_fill_the_fields_like(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    	
	
	
	}
	
	@Test(priority=9)
	@When("^user clicks on save button$")
	public void user_clicks_on_save_button() throws Throwable {
		driver.findElement(By.xpath("//button[@class=\"ui linkedin button\"]//i")).click();
		
	}
	@Test(priority=10)
	@Then("^user should redirected to task detail page$")
	public void user_should_redirected_to_task_detail_page() throws Throwable {
		boolean isDisplay = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[1]/div")).isDisplayed();
		Assert.assertTrue(isDisplay);
		//driver.close();
	}
	@Test(priority=11)
	@When("^User enters title and click on save$")
	public void user_enters_title_and_click_on_save() throws Throwable {
		CreateTaskPOM2 task1=PageFactory.initElements(driver, CreateTaskPOM2.class);
		task1.createButton();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		task1.titleText("title_1");
		task1.savebutton();
	}
	@Test(priority=12)
	@Then("^User should see the  on dashboard$")
	public void user_should_see_the_title_on_dashboard() throws Throwable {
		CreateTaskPOM2 task1=PageFactory.initElements(driver,CreateTaskPOM2.class);
		driver.get("https://ui.cogmento.com/task");
		WebDriverWait Mywait=new WebDriverWait(driver,10);
		Mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("title_1")));
		assert driver.findElement(By.linkText("title_1")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assert driver.findElement(By.linkText("title_1")).isDisplayed();
		driver.close();
	}
	@Test(priority=13)
	@When("^Users enters other field Assined_to,Title,Status and click on save$")
	public void users_enters_other_field_Assined_to_Title_Status_and_click_on_save() throws Throwable {
		CreateTaskPOM2 task1=PageFactory.initElements(driver, CreateTaskPOM2.class);
		driver.get("https://ui.cogmento.com/cases");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		task1.createButton();
		File credentials=new File("C:\\FreeCRM\\NewSprint2\\task1.xlsx");
		FileInputStream fis = new FileInputStream(credentials);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String Assigned_to=sheet1.getRow(0).getCell(0).getStringCellValue();
		task1.assignedTo();
		String des=sheet1.getRow(0).getCell(1).getStringCellValue();
		task1.titleText(des);
		String identifier=sheet1.getRow(0).getCell(2).getStringCellValue();
		task1.identifierText(identifier);
		task1.savebutton();
		
	}
	@Test(priority=14)

	@Then("^User should see a error message$")
	public void user_should_see_a_error_message() throws Throwable {
		assert driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/div/input")).isDisplayed();
		driver.close();
	}	
	
}
