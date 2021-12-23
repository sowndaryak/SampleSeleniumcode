package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	public TestBase() throws IOException
	{
		prop = new Properties();
		  String path = System.getProperty("user.dir")
				  + "//src//test//resources//configFiles//config.properties";
		  
		  FileInputStream fn = new FileInputStream(path);
		 prop.load(fn);
		 	
	}
	public static void initialize()
	{
		String browser=prop.getProperty("Browser");
	System.out.println("browser name os   :"+browser);
	 if(browser.equalsIgnoreCase("chrome"))
	 {
		 WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(50000,TimeUnit.MILLISECONDS);
				 driver.manage().timeouts().pageLoadTimeout(600000,TimeUnit.SECONDS);
				 
			
			}
			 
	 
	 if(browser.equalsIgnoreCase("edge"))
	 {
		 WebDriverManager.edgedriver().setup();
		
			driver=new EdgeDriver();
		 driver.manage().window().maximize();
	 }
	 driver.manage().deleteAllCookies();
	 driver.get(prop.getProperty("Url"));
	}
}
