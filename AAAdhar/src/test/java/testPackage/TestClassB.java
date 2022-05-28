package testPackage;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojoPackege.Pojo;
import pomPackage.ApplyLeavePage;
import pomPackage.AssignLeaveClass;
import pomPackage.HomePageClass;
import pomPackage.LeaveListTabClass;
import pomPackage.LogInPageClass;
import pomPackage.MyLeavepage;
import pomPackage.MyTimesheetpage;
import pomPackage.TimesheetClass;
import utilityPackage.UtilityClass;

public class TestClassB extends Pojo
{

	WebDriver driver;
	LogInPageClass login;
	HomePageClass home;
	AssignLeaveClass assignleave;
	LeaveListTabClass leavelist;
	TimesheetClass timesheet;
	ApplyLeavePage applyleave;
	MyLeavepage myleave;
	MyTimesheetpage mytimesheet;
	
	
	
	
	@BeforeClass
	public void beforeclass()
	{
		driver=openChromeBrowser();	 
 	}
	
	@BeforeMethod
	public void beforemethod()
	{

	}
	
	@Test
	public void verifyLogInPage()
	{

//		login= new LogInPageClass(driver);
//		login.sendUsername();
//		login.sendPassword();
//		login.sendLoginButton();
		
		 String Actual = driver.getCurrentUrl();
		 System.out.println(Actual);
         String Expected = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";	 
         Assert.assertEquals(Actual, Expected);
        // Assert.assertNotEquals(Actual, Expected);
         
         boolean result = driver.findElement(By.xpath("//span[text()='Assign Leave']")).isDisplayed();
         System.out.println(result);       
         Assert.assertTrue(result);
        // Assert.assertFalse(result);
        // Assert.fail();
         
         SoftAssert soft= new SoftAssert();
// 		soft.assertEquals(Actual, Expected);
// 		soft.assertEquals(Actual, Expected);
// 		soft.assertTrue(result);
// 		soft.assertFalse(result);
// 		soft.fail();
// 		soft.assertAll();

	}
	
	@Test(priority = 1)
	public void verifyAssignLeave() throws IOException
	{
		assignleave= new AssignLeaveClass(driver);
		assignleave.assignleave();
		assignleave.employeename();
		assignleave.leavetype();
		assignleave.asignfromdate();
		assignleave.asigntodate();
		assignleave.partialdays();
		assignleave.comment();
		assignleave.asssigbutton();
		//assignleave.asignfromdate();
		 UtilityClass.captureScreenshots(driver);

		
		String Actual = driver.getCurrentUrl();
		System.out.println(Actual);
		String Expected = "https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave";
		Assert.assertEquals(Actual, Expected);
//		Assert.assertNotEquals(Actual, Expected);
		
		boolean result = driver.findElement(By.xpath("//input[@name='assignleave[txtEmployee][empName]']")).isDisplayed();
        System.out.println(result);
        Assert.assertTrue(result);
//      Assert.assertFalse(result);        
//        Assert.fail();
        
        SoftAssert soft= new SoftAssert();
//		soft.assertEquals(Actual, Expected);
//		soft.assertEquals(Actual, Expected);
//		soft.assertTrue(result);
//		soft.assertFalse(result);
//		soft.fail();
//		soft.assertAll();

     
	}
	
	@Test(priority = 2)
	public void verifyLeaveList() throws IOException
	{
		leavelist= new LeaveListTabClass(driver);
		leavelist.leavelisttab();
		leavelist.fromdate();
		leavelist.todate();
		leavelist.pendingapproval();
		leavelist.employeeName();
		leavelist.subunit();
		leavelist.searchbutton();
		 UtilityClass.captureScreenshots(driver);

		
		String Actual = driver.getCurrentUrl();
		System.out.println(Actual);
		String Expected = "https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList";
		Assert.assertEquals(Actual, Expected);
//		Assert.assertNotEquals(Actual, Expected);
	}
	
	@Test(priority = 3)
	public void verifyTimesheet() throws IOException
	{
		  timesheet= new TimesheetClass(driver);
		  timesheet.timesheets();
		  timesheet.employeename();
		  timesheet.viewbutton();
		 UtilityClass.captureScreenshots(driver);

		  
		    String Actual = driver.getCurrentUrl();
			System.out.println(Actual);
			String Expected = "https://opensource-demo.orangehrmlive.com/index.php/time/viewEmployeeTimesheet";
			Assert.assertEquals(Actual, Expected);
//			Assert.assertNotEquals(Actual, Expected);

	}
	
	@Test(priority = 4)
	public void verifyApplyLeave() throws IOException
	{
		  applyleave= new ApplyLeavePage(driver);
		  applyleave.applyleave();
		  UtilityClass.captureScreenshots(driver);


		    String Actual = driver.getCurrentUrl();
			System.out.println(Actual);
			String Expected = "https://opensource-demo.orangehrmlive.com/index.php/leave/applyLeave";
			Assert.assertEquals(Actual, Expected);
//			Assert.assertNotEquals(Actual, Expected);

	}
	
	@Test(priority = 5)
	public void verifyMyLeave() throws IOException 
	{
		  myleave= new MyLeavepage(driver);
		  myleave.myleave();
		  myleave.fromdate();
		  myleave.todate();
 		  myleave.pendingapproval();
		  myleave.searchbutton();
		 UtilityClass.captureScreenshots(driver);

		  
		    String Actual = driver.getCurrentUrl();
			System.out.println(Actual);
			String Expected = "https://opensource-demo.orangehrmlive.com/index.php/leave/viewMyLeaveList";
			Assert.assertEquals(Actual, Expected);
//			Assert.assertNotEquals(Actual, Expected);

	}
	
	@Test(priority = 6)
	public void verifyMyTimesheet() throws IOException
	{
		 mytimesheet= new MyTimesheetpage(driver);
         mytimesheet.mytimesheet();
         mytimesheet.timesheetforweek();
		 UtilityClass.captureScreenshots(driver);

         
            String Actual = driver.getCurrentUrl();
			System.out.println(Actual);
			String Expected = "https://opensource-demo.orangehrmlive.com/index.php/time/viewMyTimesheet?timesheetStartDateFromDropDown=2022-05-02&selectedIndex=1&employeeId=7";
			Assert.assertEquals(Actual, Expected);
//			Assert.assertNotEquals(Actual, Expected);

	}
	

	 
	@AfterMethod
	public void aftermethod()
	{
		
		home= new HomePageClass(driver);
		home.dashboard();
 		
 
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.quit();
	}
	

}
