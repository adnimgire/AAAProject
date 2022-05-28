package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyLeavepage
{
	WebDriver driver;
	WebDriverWait wait;
	Actions act;
	
	 @FindBy(xpath="//span[text()='My Leave']")
	 private WebElement MyLeave;
	 
	 @FindBy(xpath="//input[@name='leaveList[calFromDate]']")
	 private WebElement FromDate;
	 
	 @FindBy(xpath="//input[@name='leaveList[calToDate]']")
	 private WebElement ToDate;
	 
	 @FindBy(xpath="//input[@value='1']")
	 private WebElement PendingAprroval;
	 
	 @FindBy(xpath="//input[@value='Search']")
	 private WebElement SearchButton;
	 
	 
	 public MyLeavepage(WebDriver driver)
	 {
		 this.driver=driver;
		 wait= new WebDriverWait(driver, 10);
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void myleave()
	 {
		 MyLeave.click();
	 }
	 
	 public void fromdate()
	 {
		 FromDate.sendKeys("2022-05-15");
	 }
	 
	 public void todate()
	 {
		 ToDate.sendKeys("2022-05-25");
	 }
	 
	 public void pendingapproval()
	 {
		 act= new Actions(driver);
		 act.click(PendingAprroval).perform();
	 }
	 
	 public void searchbutton()
	 {
		 SearchButton.click();
	 }
	 
	 
	 
	 
}	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
