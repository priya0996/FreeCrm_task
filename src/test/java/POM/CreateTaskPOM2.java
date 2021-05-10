package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateTaskPOM2 {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/div[6]")

	WebElement Navigationbar;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/div[6]/a/span")
	WebElement Taskbutton;

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement Createbutton;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/div/input")
	WebElement Title;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[1]/div/div")
	WebElement AssignedTo;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[1]/div/textarea")
	WebElement Decription;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[8]/div/div/div/input")
	WebElement Identifier;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div")
	WebElement Priority;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[2]/div/div")
	WebElement Status;

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement Savebutton;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[4]/td[7]/a[1]/button/i")
	WebElement Viewbutton;

	

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[1]/td[7]/a[2]/button/i")
	WebElement Editbutton;
	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[1]/td[7]/a[3]/button/i")
	WebElement Deletebutton;
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	WebElement DeletebuttonAlert;
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[1]")
	WebElement CancelbuttonAlert;
	@FindBy(xpath = "//*[@id=\"top-header-menu\"]/div[2]/div[2]/button[2]/i")
	WebElement Binbutton;
	@FindBy(xpath = "//a[@class='item']//i[@class='comments large icon']")
	WebElement Bintasks;
	@FindBy(xpath = "//tbody/tr[7]/td[1]/div[1]/label[1]")
	WebElement Checkbox1task;
	@FindBy(xpath = "//th[@class='collapsing']//label")
	WebElement BincheckboxAll;
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div")
	WebElement Restoreselectedbutton;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[1]/a[5]")
	WebElement Documents;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]")
	WebElement DropFileHere;
		
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]")
	WebElement UploadedDocs;
	
	public void documents() 
	{
		Documents.click();
	}

	public void documentsDropHere() 
	{
		DropFileHere.sendKeys("C:\\Users\\PASHOKJA\\Desktop\\dropfiles.docx");
	}
	public boolean getCount()
	{
        if(new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/a"))).size() > 0) 
        {
        	 return false;
        }
        
        {
        	 return true;
        }
           
	}
	
	public CreateTaskPOM2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickNavigationbar() {

		Actions act = new Actions(driver);
		act.moveToElement(Navigationbar).build().perform();
	}

	public void createButton() {
		Createbutton.click();
	}

	public void taskButton() {
		Taskbutton.click();
	}

	public void titleText(String title) {
		Title.sendKeys(title);
	}

	public void assignedTo() {

		AssignedTo.sendKeys("Priyanka Jawalkar");
	}

	public void decriptionText(String des) {
		Decription.sendKeys(des);
	}

	public void identifierText(String ide) {
		Identifier.sendKeys(ide);
	}

	public void priority() {
		Priority.sendKeys("High");
	}

	public void status() {
		Status.sendKeys("Reviewing");
	}

	public void savebutton() {
		Savebutton.click();
	}

	public void viewButton() {
		Viewbutton.click();
	}

	

	public void editButton() {
		Editbutton.click();
	}

	public void deleteButton() {
		Deletebutton.click();
	}

	public void deleteButtonAlert() {
		DeletebuttonAlert.click();
	}

	public void cancelButtonAlert() {
		CancelbuttonAlert.click();
	}

	public void clickBinbutton() {
		Binbutton.click();
	}

	public void clickBinTasksbutton() {
		Bintasks.click();
	}

	public void bincheckBox1Task() {
		Checkbox1task.click();
	}

	public void bincheckBoxCaseAll() {
		BincheckboxAll.click();
	}

	public void restoreSelectedButton() {
		Restoreselectedbutton.click();
	}

}
