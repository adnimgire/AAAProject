package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignLeaveClass 
{

	WebDriver driver;
	WebDriverWait wait;
	Select list;
	
     @FindBy(xpath="//span[text()='Assign Leave']")
     private WebElement assignleave;
     
     @FindBy(xpath="//input[@name='assignleave[txtEmployee][empName]']")
     private WebElement employeename;
     
     @FindBy(xpath="//select[@name='assignleave[txtLeaveType]']")
     private WebElement leavetype;
     
     
     @FindBy(xpath="//input[@id='assignleave_txtFromDate']")
     private WebElement asignfromdate;
     
     @FindBy(xpath="//input[@id='assignleave_txtToDate']")
     private WebElement asigntodate;
     
     @FindBy(xpath="//select[@name='assignleave[partialDays]']")
     private WebElement partialdays;
     
     @FindBy(xpath="//textarea[@name='assignleave[txtComment]']")
     private WebElement comment;
     
     @FindBy(xpath="//input[@id='assignBtn']")
     private WebElement asssigbutton;
     
     @FindBy(xpath="//input[@id='confirmOkButton']")
     private WebElement confirmOKbutton;
     
    
     public AssignLeaveClass(WebDriver driver)
     {
    	 this.driver=driver;
    	 wait= new WebDriverWait(driver, 10 );
     	 PageFactory.initElements(driver, this);
     }
     
     public void assignleave()
     {
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[text()='Assign Leave']")));
         assignleave.click();
     }
     public void employeename()
     {
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Employee Name ']")));
    	 employeename.sendKeys("Jordan Mathews");
     }
     
     public void leavetype()
     {
    	 list= new Select(leavetype);
    	 list.selectByVisibleText("US - Vacation");
     }
     
     public void asignfromdate()
     {
    	 asignfromdate.sendKeys("2022-05-15");
     }
     
     public void asigntodate()
     {
    	 asigntodate.sendKeys("2022-05-25");
     }
     
     public void partialdays()
     {
    	 list= new Select(partialdays);
    	 list.selectByVisibleText("None");
     }
     
     public void comment()
     {
    	 comment.sendKeys("please grant me the leave.");
     }
     
     public void asssigbutton()
     {
    	 asssigbutton.click();
     }
     
     public void confirmOKbutton()
     {
    	 confirmOKbutton.click();
     }
     
   
    

	
	
	
}
