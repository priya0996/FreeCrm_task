//package stepdefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import POM.CreateTaskPOM2;
//import POM.LoginPom;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class View_Edit_Delete {
//
//	WebDriver driver;
//
//	@Given("^User navigates to login page of FreeCRM$")
//	public void user_navigates_to_login_page_of_FreeCRM() throws Throwable {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\PASHOKJA\\Desktop\\chromedriver.exe");
//		this.driver = new ChromeDriver();
//		driver.get("https://ui.cogmento.com/");
//		driver.manage().window().maximize();
//	}
//
//	@When("^User enters his/her username and password$")
//	public void user_enters_his_her_username_and_password() throws Throwable {
//		LoginPom loginpage=PageFactory.initElements(driver, LoginPom.class);
//		//Thread.sleep(3000);	
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//		loginpage.inputemail("priyankajawlkar09@gmail.com");
//		loginpage.inputpassword("Priya@123");
//		loginpage.clicklogin();
//	}
//	
//	@Then("^User should login and be on home page of FreeCRM$")
//	public void user_should_login_and_be_on_home_page_of_FreeCRM() throws Throwable {
//		CreateTaskPOM2 task=PageFactory.initElements(driver, CreateTaskPOM2.class);
//		Thread.sleep(3000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//		task.clickNavigationbar();
//		task.taskButton();
//	    
//	}
//
//	@When("^User select particular task and click on view$")
//	public void user_select_particular_task_and_click_on_view() throws Throwable {
//	    
//	}
//
//	@Then("^User should see that task with details$")
//	public void user_should_see_that_task_with_details() throws Throwable {
//		
//	   	}
//	@When("^user try to add documents in the view$")
//	public void user_try_to_add_documents_in_the_view() throws Throwable {
//	    
//	}
//
//	@Then("^application should not add the documents\\.$")
//	public void application_should_not_add_the_documents() throws Throwable {
//	   
//	}
//
//
//	@When("^User select particular task and click on Edit$")
//	public void user_select_particular_task_and_click_on_Edit() throws Throwable {
//	    
//	}
//
//	@Then("^User should edit task and click on save$")
//	public void user_should_edit_task_and_click_on_save() throws Throwable {
//	    
//	}
//
//	@Then("^User should  be able to see edited task$")
//	public void user_should_be_able_to_see_edited_task() throws Throwable {
//	  
//	}
//
//	@When("^User select particular task and click on delete$")
//	public void user_select_particular_task_and_click_on_delete() throws Throwable {
//	    
//	}
//
//	@Then("^User should see task in bin$")
//	public void user_should_see_task_in_bin() throws Throwable {
//	    
//	}
//
//	@Then("^User select multiple cases and clicks on delete$")
//	public void user_select_multiple_cases_and_clicks_on_delete() throws Throwable {
//	   
//	}
//
//	@Then("^User should see cases in bin$")
//	public void user_should_see_cases_in_bin() throws Throwable {
//	    
//	}
//	*/
//	
//}
