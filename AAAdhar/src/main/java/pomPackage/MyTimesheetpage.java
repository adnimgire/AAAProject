package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyTimesheetpage
{
	WebDriver driver;
	WebDriverWait wait;
	Select list;
	
	 @FindBy(xpath="//span[text()='My Timesheet']")
	 private WebElement MyTimesheet;
	 
	 @FindBy(xpath="//select[@name='startDates']")
	 private WebElement TimesheetForWeek;
	 
 	 public MyTimesheetpage(WebDriver driver)
	 {
		 this.driver=driver;
		 wait= new WebDriverWait(driver, 10);
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void mytimesheet()
	 {
		 MyTimesheet.click();
	 }
	 
	 public void timesheetforweek()
	 {
		list= new Select(TimesheetForWeek);
		list.selectByVisibleText("2022-05-02 to 2022-05-08");
	 }
}
