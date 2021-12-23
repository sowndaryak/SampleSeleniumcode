package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Homepage extends TestBase{

	public Homepage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css="input.input-lg")
	WebElement searchbox;
	
	@FindBy(css="span.input-group-btn")
	WebElement searchbutton;
	
	public void searchItem(String name)
	{
		searchbox.sendKeys("phone");
		searchbutton.click();
	}
	public String getHomeTitle()
	{
		return driver.getTitle();
	}
	
}
