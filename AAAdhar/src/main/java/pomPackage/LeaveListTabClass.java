package pomPackage;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeaveListTabClass 
{

	WebDriver driver;
	WebDriverWait wait;
	Actions act;
	Select list;
	
	
	
	@FindBy(xpath="//span[text()='Leave List']")
	private WebElement leavelist;
	
	@FindBy(xpath="//input[@name='leaveList[calFromDate]']")
    private WebElement Fromdate;
	
	@FindBy(xpath = "//input[@name='leaveList[calToDate]']")
	private WebElement Todate;
	
	@FindBy(xpath = "//input[@value='0']")
	private WebElement Cancelled;
	
	@FindBy(xpath = "//input[@name='leaveList[txtEmployee][empName]']")
	private WebElement EmployeeName;
	
	@FindBy(xpath = "//select[@name='leaveList[cmbSubunit]']")
	private WebElement Subunit;
	
	@FindBy(xpath = "//input[@name='btnSearch']")
	private WebElement SearchButton;
	
	
	
	
	
	public LeaveListTabClass(WebDriver driver)
	{
		this.driver=driver;
		wait= new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}
	
	
	public void leavelisttab()
	{
		leavelist.click();
	}
	
	public void fromdate()
	{
		Fromdate.sendKeys("2022-05-15");
	}
	
	public void todate()
	{
		Todate.sendKeys("2022-05-25");
	}
	
	public void pendingapproval()
	{
		act= new Actions(driver);
		act.moveToElement(Cancelled).click().perform();
	}	 
	
	public void employeeName()
	{
		EmployeeName.sendKeys("Jordan Mathews");
	}
		
	public void subunit()
	{
		list= new Select(Subunit);
		list.selectByVisibleText("Engineering");
	}
	
	public void searchbutton()
	{
		SearchButton.click();
	}
	
	
	
	
}
