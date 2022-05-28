package testPackage;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojoPackege.Pojo;
import pomPackage.AssignLeaveClass;
import pomPackage.HomePageClass;
import pomPackage.LogInPageClass;
import utilityPackage.UtilityClass;

public class TestClassA extends Pojo
{

	WebDriver driver;
	LogInPageClass login;
	HomePageClass home;
	AssignLeaveClass assignleave;

	
	@BeforeClass
	public void beforeclass() throws IOException 
	{
		 driver=openChromeBrowser();
		 UtilityClass.captureScreenshots(driver);
	     
	}
	
	@BeforeMethod
	public void beforemethod()
	{
        System.out.println("before method");
		
	}
	
	@Test
	public void verifyLoginPage() throws IOException 
	{
 		login= new LogInPageClass(driver);
		login.sendUsername(UtilityClass.xlDataFetch(1, 0));
		login.sendPassword(UtilityClass.xlDataFetch(1, 1));
		login.sendLoginButton();
		UtilityClass.captureScreenshots(driver);
//		UtilityClass.xlDataFetch();
		
		String Actual= driver.getCurrentUrl();
		System.out.println(Actual);
		String Expected = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		Assert.assertEquals(Actual, Expected);
//		Assert.assertNotEquals(Actual, Expected);
		
		boolean result = driver.findElement(By.xpath("//b[text()='Dashboard']")).isDisplayed();
		//System.out.println(result);
		Assert.assertTrue(result);
		//Assert.assertFalse(result);
		//Assert.fail();

		SoftAssert soft= new SoftAssert();
//		soft.assertEquals(Actual, Expected);
//		soft.assertEquals(Actual, Expected);
//		soft.assertTrue(result);
//		soft.assertFalse(result);
//		soft.fail();
//		soft.assertAll();

	}
//	
	@Test(priority = 1)
	public void verifyHomePage() throws InterruptedException, IOException
	{
 		 home= new HomePageClass(driver);
		 home.homepage();
 		 home.assignleave();
 		 home.leavelist();
 		 home.timesheets();
 		 home.applyleave();
 		 home.myleave();
 		 home.mytimesheet();
		 UtilityClass.captureScreenshots(driver);

		 String Actual= driver.getCurrentUrl();
		 System.out.println(Actual);
		 String Expected = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
			
	     Assert.assertEquals(Actual, Expected);
	 //  Assert.assertEquals(Actual, Expected);
       
		boolean result = driver.findElement(By.xpath("//b[text()='Dashboard']")).isDisplayed();
		System.out.println(result);
		//Assert.assertTrue(result);
     	//Assert.assertFalse(result);
		//Assert.fail();
		 
		SoftAssert soft= new SoftAssert();
//		soft.assertEquals(Actual, Expected);
//		soft.assertEquals(Actual, Expected);
//		soft.assertTrue(result);
//		soft.assertFalse(result);
//		soft.fail();
//		soft.assertAll();

		 
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.quit();
	}
	
	
	
	
}
