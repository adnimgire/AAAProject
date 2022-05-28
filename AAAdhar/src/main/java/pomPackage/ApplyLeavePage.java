package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplyLeavePage
{
	WebDriver driver;
	WebDriverWait wait;
	
	
	 @FindBy(xpath="//span[text()='Apply Leave']")
	 private WebElement ApplyLeave;
	 
	 public ApplyLeavePage(WebDriver driver)
	 {
		 this.driver=driver;
		 wait= new WebDriverWait(driver,10);
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void applyleave()
	 {
		 ApplyLeave.click();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
