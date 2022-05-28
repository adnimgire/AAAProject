package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageClass
{
    WebDriver driver;
	
	WebDriverWait wait;
 
	

	 @FindBy(xpath="//b[text()='Dashboard']")
     private WebElement dashboard;
	 
	 @FindBy(xpath="//span[text()='Assign Leave']")
     private WebElement AssignLeave;
	 
	 @FindBy(xpath="//span[text()='Leave List']")
	 private WebElement LeaveList;
		
	 @FindBy(xpath="//span[text()='Timesheets']")
	 private WebElement Timesheets;
	 
	 @FindBy(xpath="//span[text()='Apply Leave']")
	 private WebElement ApplyLeave;
	 
	 @FindBy(xpath="//span[text()='My Leave']")
	 private WebElement MyLeave;
	 
	 @FindBy(xpath="//span[text()='My Timesheet']")
	 private WebElement MyTimesheet;
	 
	 
	 public HomePageClass(WebDriver driver)
	 {
		 this.driver=driver;
		 wait= new WebDriverWait(driver, 30);
		 PageFactory.initElements(driver, this);
	 }
     
	public void homepage()
	{
  	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Dashboard']")));
      boolean dashtab = dashboard.isDisplayed();
      System.out.println(dashtab);
      if(dashtab==true)
      {
    	  String s=dashboard.getText();
    	  System.out.println(s);
      }
	}
	 
	 public void assignleave()
	 {
	   	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Assign Leave']")));
	    AssignLeave.isDisplayed();
	 }
	 
	 public void leavelist()
	 {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Leave List']")));
		LeaveList.isDisplayed();
	 }
	 
	 public void timesheets()
	 {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Timesheets']")));
		Timesheets.isDisplayed();
	 }
	 
	 public void applyleave()
	 {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Apply Leave']")));
		ApplyLeave.isDisplayed();
	 }
	 
	 public void myleave()
	 {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My Leave']")));
		MyLeave.isDisplayed();
	 }
	 
	 public void mytimesheet()
	 {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My Timesheet']")));
		MyTimesheet.isDisplayed();
	 }
	 
	  public void dashboard()
	     {
	    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Dashboard']")));
	    	 dashboard.click();
	     }
	     
}
