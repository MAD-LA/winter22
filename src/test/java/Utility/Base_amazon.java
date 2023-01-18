package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_amazon {
	
	public static Properties winterprop;
	public static WebDriver driver;
	
	public Base_amazon () {
		
		try {
			FileInputStream files = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\winter22\\config\\winter22config.properties");
			
			winterprop = new Properties ();
			winterprop.load(files);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void winterbrowserinit () {
		
		String WinterBrowser = winterprop.getProperty("browser1");
		
		if (WinterBrowser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\WebDriver\\chromedriver.exe" );
			   driver = new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().deleteAllCookies();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Test_data_winter22.implicityWait));
			   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Test_data_winter22.pageloadWait)); 
			
		}
		 
		   else if (WinterBrowser.equalsIgnoreCase("FireFox")) {
			   
		   }
		
	}
	
	
	public static void winterLaunchURL(String URL) {
		
		driver.get(winterprop.getProperty("url1"));
		
	}
	
}
