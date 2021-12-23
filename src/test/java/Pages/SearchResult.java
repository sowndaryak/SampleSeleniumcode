package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class SearchResult extends TestBase{

	public SearchResult() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(linkText="Search")
	WebElement searchheading;
	
	@FindBy(xpath="//span[contains(text(),'Add')]")
	WebElement addtocart;
	
	@FindBy(css="span#cart-total")
	WebElement cartvalue;
	
	
	@FindBy(css="div.product-thumb")
	List<WebElement> items;
	
	public void addItemToCart() throws InterruptedException
	{
		if(items.size()>0) {
		addtocart.click();
		}
		Thread.sleep(5000);
	}
	
	public void isItemListed()
	{
		
	}
	
	public boolean isItemAdded()
	{
		String value=cartvalue.getText();
		System.out.println(value);
		String noOfItems=value.split(" ")[0];
		
		int items=Integer.parseInt(noOfItems) ;
		System.out.println("Number of Items Addedd is : " +noOfItems);
		if(items>0)
			return true;
		else
			return false;
		
	}
}
