package CallingTestMethods;

import org.openqa.selenium.support.PageFactory;

import PageObjectMethod.PageObject_rediff_Home;
import TestMethods.TestMethod1;

public class TestMethodCalling {
    
	TestMethod1 m=new TestMethod1();
	
	public void Calling_All_Methods() throws Exception
	{
		m.excel_con("C:\\Users\\ashk1234\\Desktop\\RediffFramework\\TestData\\abc.xls", "Sheet1");
		m.LaunchApp(m.s.getCell(0, 0).getContents());
		m.AppTitle(m.s.getCell("A2").getContents(),"C:\\Users\\ashk1234\\Desktop\\RediffFramework\\TestResult\\title.png");
		
		PageObject_rediff_Home p=PageFactory.initElements(m.driver, PageObject_rediff_Home.class);
		m.Element_present(p.username, true, "name", "C:\\Users\\ashk1234\\Desktop\\RediffFramework\\TestResult\\username.png");
		
		
		m.Element_present(p.Pwd, true, "type","C:\\Users\\ashk1234\\Desktop\\RediffFramework\\TestResult\\pwd.png");
		m.Element_present(p.sign_In, true, "title", "C:\\Users\\ashk1234\\Desktop\\RediffFramework\\TestResult\\signin.png");
		m.Element_enabled(p.username, true, "name", "C:\\Users\\ashk1234\\Desktop\\RediffFramework\\TestResult\\enableusername.phg");
		m.Element_enabled(p.Pwd, true, "type", "C:\\Users\\ashk1234\\Desktop\\RediffFramework\\TestResult\\pwdenabled.png");
		m.Element_selected(p.Check_box, true, "type", "C:\\Users\\ashk1234\\Desktop\\RediffFramework\\TestResult\\checkbox.png");
		p.username.sendKeys(m.s.getCell("A3").getContents());
		p.Pwd.sendKeys(m.s.getCell("A4").getContents());
		p.sign_In.click();
		Thread.sleep(3000);
		m.errorText(p.ErrorMessage, m.s.getCell("A5").getContents(),"C:\\Users\\ashk1234\\Desktop\\RediffFramework\\TestResult\\errormessage.png");
		m.linkcount();
		p.Create_New_Account.click();
		Thread.sleep(3000);
		m.AppTitle(m.s.getCell("A6").getContents(),"C:\\Users\\ashk1234\\Desktop\\RediffFramework\\TestResult\\apptitle.png");
		Thread.sleep(5000);
		m.CloseApp();
	}
	
	
}
