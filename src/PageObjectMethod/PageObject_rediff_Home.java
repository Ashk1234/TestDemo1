package PageObjectMethod;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject_rediff_Home {
	
	public @FindBy (xpath="//*[@id='login1']") WebElement username;
	public @FindBy(xpath="//*[@id='password']") WebElement Pwd;
	public @FindBy(xpath="//*[@name='proceed']") WebElement sign_In;
	public @FindBy(xpath="//*[@id='remember']") WebElement Check_box;
	public @FindBy(xpath="//*[@id='div_login_error']/b") WebElement ErrorMessage;
	public @FindBy(xpath="//*[text()='Create a new account']") WebElement Create_New_Account;

}
