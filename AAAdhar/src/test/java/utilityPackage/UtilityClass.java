package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	
	 

	
	public static void captureScreenshots(WebDriver driver) throws IOException
	{
		Date date= new Date();
		
		SimpleDateFormat d= new SimpleDateFormat("dd-MM-yyyy__hh-mm-ss");
		String s= d.format(date);
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("E:\\1.2 JAVA SCREENSHOTS\\IMG"+s+".jpeg");
		
		FileHandler.copy(src, dest);
	}
	
	
	public static  String xlDataFetch(int row, int cell) throws EncryptedDocumentException, IOException
	{
		String path= "D:\\Documents\\eseltojava.xlsx";
		
		FileInputStream file= new FileInputStream(path);
		
	    Sheet v = WorkbookFactory.create(file).getSheet("akshay");
	    String s = v.getRow(row).getCell(cell).getStringCellValue();
	    System.out.println(s);
	    return s;
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
      
//		for (int i=0; i<=5; i++)
//		{
//		
//		  String s= v.getRow(i).getCell(0).getStringCellValue();
//		  System.out.print(s);
//		   for (int j=i; j<=i;j++)
//		   {
//			   String s1= v.getRow(i).getCell(1).getStringCellValue();
//		      System.out.print("     "+s1);
//		   }
//		
//		System.out.println();
//		}
// 		
	}
	
	
	
	
	
}
