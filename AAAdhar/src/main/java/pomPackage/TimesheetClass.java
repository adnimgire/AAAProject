package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimesheetClass
{
	WebDriver driver;
	WebDriverWait wait;
	
	 @FindBy(xpath="//span[text()='Timesheets']")
	 private WebElement Timesheets;
	 
	 @FindBy(xpath="//input[@name='time[employeeName]']")
	 private WebElement EmployeeName;
	 
	 @FindBy(xpath="//input[@value='View']")
	 private WebElement ViewButton;
	 
	 
	 public TimesheetClass (WebDriver driver)
	 {
		 this.driver=driver;
		 wait= new WebDriverWait(driver, 10);
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void timesheets()
	 {
		 Timesheets.click();
	 }
	 
	 public void employeename()
	 {
		 EmployeeName.sendKeys("Jordan Mathews");
	 }
	 
	 public void viewbutton()
	 {
		 ViewButton.sendKeys("Jordan Mathews");
	 }
	 
}
