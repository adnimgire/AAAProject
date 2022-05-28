package pomPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPageClass
{

    WebDriver driver;
	
	WebDriverWait wait;
 
	
  	@FindBy(xpath="//input[@name='txtUsername']")
    private WebElement username;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement loginbutton;
	
	
 	
	public LogInPageClass(WebDriver driver) 
	{
		this.driver=driver;
		wait= new WebDriverWait(driver,10);
 		PageFactory.initElements(driver, this);
	}
 
	
	
	public void sendUsername(String s) 
	{
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtUsername']")));	
		username.sendKeys(s);
	}
	
	public void sendPassword(String s)
	{
 	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtPassword']")));
		password.sendKeys(s);
	}
	
	public void sendLoginButton() 
	{  
 		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Submit']")));
		loginbutton.click();
	}
	
	
	

	
	
	
}
