package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;



public class LoginPage extends TestBase{

	public LoginPage() throws IOException {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(xpath="//a[@title='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//a[contains(text(),'Login')][1]")
	WebElement login;
	
	@FindBy(xpath="//ul[@class='breadcrumb']//li[3]//a")
	WebElement logintitle;
	
	@FindBy(xpath="//div[@class='col-sm-6'][2]//div//h2")
	WebElement returningcustomer;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement usermail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement userpswd;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbutton;
	

	
	@FindBy(xpath="//i[@class='fa fa-home']")
	WebElement GotoHomepage;
	
	//Actions
	
	public void loginPage()
	{
		myaccount.click();
		login.click();
	}
	public String verify()
	{
		return returningcustomer.getText();
		
	}
	
	public void userdetail(String str)
	{
		usermail.sendKeys(str);
		
	}
	public void pswddetail(String pswd)
	{
		userpswd.sendKeys(pswd);
		
	}
	public void Enterlogin()
	{
		loginbutton.click();;
		
	}
	
	public void ReturnHomepage()
	{
		GotoHomepage.click();;
		
	}
	
	
	
}
