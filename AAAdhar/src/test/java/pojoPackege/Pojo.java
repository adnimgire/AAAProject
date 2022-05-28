package pojoPackege;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo
{

	public WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Browser\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
	
	
}
