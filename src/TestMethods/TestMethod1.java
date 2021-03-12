package TestMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;









import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMethod1 {
	public WebDriver driver;
	public FileInputStream f;
	public Workbook wb;
	public Sheet s;
	
	//Method Name:LaunchApp
	//Description:Method for Application Launch
	//Date of Design:22/02/2021
	//Designer:Abhishek
	//Reviewer:Sapna
	public void LaunchApp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashk1234\\Desktop\\Framework\\jar\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	    //Method Name:excel_con
		//Description:Connect the Excel to fetch the test data
		//Date of Design:22/02/2021
		//Designer:Abhishek
		//Reviewer:Sapna
	public void excel_con(String xlpath, String sname) throws Exception
	{
		 f=new FileInputStream(xlpath);
		 wb=Workbook.getWorkbook(f);
		 s=wb.getSheet(sname);
	}
	        //Method Name:AppTitle
			//Description:Title of the Application
			//Date of Design:22/02/2021
			//Designer:Abhishek
			//Reviewer:Sapna
public void AppTitle(String title, String sspath) throws Exception
{
	String a=driver.getTitle();
	
	if(a.equals(title))
	{
		System.out.println("Title of Application is " + a);
	}
	else
	{
		System.out.println("Title of Application is not correct");
		File F=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(F, new File(sspath));
	}
	
	
}
//Method Name:errorText
//Description:Title of the Application
//Date of Design:22/02/2021
//Designer:Abhishek
//Reviewer:Sapna
      public void errorText(WebElement element, String errormessage, String sspath) throws Exception
     {
    	  String a = element.getText();
    	 
       if(a.equals(errormessage))
        {
         System.out.println("Correct error message is  " + a);
        }
            else
        {
      System.out.println("Error message is not correct");
      File F=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(F, new File(sspath));
       }


       }
   //Method Name:Element_present
	//Description:Verify the element present or not
	//Date of Design:22/02/2021
	//Designer:Abhishek
	//Reviewer:Sapna
public void Element_present(WebElement element, boolean exp, String atribute, String sspath) throws Exception
{
	boolean b=element.isDisplayed();
	if(b==exp)
	{
		System.out.println(element.getAttribute(atribute) + " is present");
	}
	else 
	{
		System.out.println(element.getAttribute(atribute) + " is not present");
		File F=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(F, new File(sspath));
	}
}

//Method Name:Element_enabled
	//Description:Verify the element present or not
	//Date of Design:22/02/2021
	//Designer:Abhishek
	//Reviewer:Sapna
public void Element_enabled(WebElement element, boolean exp, String atribute, String sspath) throws Exception
{
	boolean b=element.isEnabled();
	if(b==exp)
	{
		System.out.println(element.getAttribute(atribute) + " is enabled");
	}
	else 
	{
		System.out.println(element.getAttribute(atribute) + " is not enabled");
		File F=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(F, new File(sspath));
	}
}
//Method Name:Element_selected
	//Description:Verify the element selected or not
	//Date of Design:22/02/2021
	//Designer:Abhishek
	//Reviewer:Sapna
public void Element_selected(WebElement element, boolean exp, String atribute, String sspath) throws Exception
{
	boolean b=element.isSelected();
	if(b==exp)
	{
		System.out.println(element.getAttribute(atribute) + " is selected");
	}
	else 
	{
		System.out.println(element.getAttribute(atribute) + " is not selected");
		File F=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(F, new File(sspath));
	}
}

//Method Name:CloseApp
	//Description:Closing the Browser
	//Date of Design:22/02/2021
	//Designer:Abhishek
	//Reviewer:Sapna
public void CloseApp()
{
	driver.close();
}
//Method Name:linkcount
	//Description:Closing the Browser
	//Date of Design:22/02/2021
	//Designer:Abhishek
	//Reviewer:Sapna
public void linkcount()
{
	List<WebElement> linkcounts=driver.findElements(By.tagName("a"));
	List<WebElement> imgcounts = driver.findElements(By.tagName("img"));
	System.out.println("Total link is "+linkcounts.size());
	System.out.println("Total Image is "+imgcounts.size());
}
     //Method Name:QuitApp
	//Description:Closing the All open Browser
	//Date of Design:22/02/2021
	//Designer:Abhishek
	//Reviewer:Sapna
public void QuitApp()
{
	driver.quit();
}












}
