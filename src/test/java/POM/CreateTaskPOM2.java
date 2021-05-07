package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateTaskPOM2 {
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"main-nav\"]/div[6]")
	WebElement Navigationbar;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/div[6]/a/span")
	WebElement Taskbutton;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement Createbutton;
	
	@FindBy(xpath= "//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/div/input")
	WebElement Title;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[1]/div/div")
	Select AssignedTo;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[1]/div/textarea")
	WebElement Decription;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[8]/div/div/div/input")
	WebElement Identifier;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div")
	Select Priority;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[2]/div/div")
	Select Status;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement Savebutton;
	

	public CreateTaskPOM2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickNavigationbar() {
		
		Actions act=new Actions(driver);
		act.moveToElement(Navigationbar).build().perform();
	}

    public void createButton()
    {
    	Createbutton.click();
    }

    public void taskButton()
    {
    	Taskbutton.click();
    }

    public void titleText(String title)
    {
    	Title.sendKeys(title);
    }

    
    public void assignedTo()
    {
    	AssignedTo.selectByIndex(0);
    }

    public void decriptionText(String des)
    {
    	Decription.sendKeys(des);
    }

    public void identifierText(String ide)
    {
    	Identifier.sendKeys(ide);
    }
    public void priority()
    {
    	 Priority.selectByIndex(0);
    }
    
    public void status()
    {
    	 Status.selectByIndex(0);
    } 
    public void savebutton()
    {
    	Savebutton.click();
    }
}
