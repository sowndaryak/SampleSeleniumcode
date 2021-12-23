package stepdefs;

import java.io.IOException;

import Base.TestBase;
import Pages.Homepage;
import Pages.LoginPage;
import Pages.SearchResult;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class OrderStepDef  extends TestBase{

	public OrderStepDef() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	Homepage homepage;
	SearchResult  searchpage;
	LoginPage lp;
	@Before
	public void setup() throws IOException {
	initialize();
	
	homepage=new Homepage();
	searchpage = new SearchResult();
	lp=new LoginPage();
	}
	
		
		@Given("User is on homepage")
		public void user_is_on_homepage() {
		    String title=homepage.getHomeTitle();
		    Assert.assertEquals(title, "Your Store");
		}

		@When("User search an {string}")
		public void user_search_an(String strItem) {
		homepage.searchItem("phone");
	
		}
		@When("User add item to cart")
		public void user_add_item_to_cart() throws InterruptedException {
		
			searchpage.addItemToCart();
			
		}
		
		@Then("Item must be  available in cart")
		public void item_must_be_available_in_cart() {
			boolean itemcount=false;
			itemcount=searchpage.isItemAdded();
			Assert.assertTrue(itemcount);
		}

			@Given("i am on Login page")
			public void i_am_on_login_page() {
			  
				lp.loginPage();
				String text=lp.verify();
				Assert.assertEquals(text, "Returning Customer");
				
			}

			@When("user enters email {string}")
			public void user_enters_email(String user) {
				lp.userdetail(user);
				System.out.println("unstaged example");
			}
			
			    
			@When("user enter password {string}")
			public void user_enter_password(String password) {
				
				lp.pswddetail(password);
			   
			}
			@Then("user clicks on login button")
			public void user_clicks_on_login_button() {
			 lp.Enterlogin();
			}
			@Then("user landed to home page")
			public void user_landed_to_home_page() {
			   lp.ReturnHomepage();
			}




	
}
