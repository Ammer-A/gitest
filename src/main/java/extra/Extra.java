package extra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//======================= Scroll ===================

public class Extra {
	
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void init() {

		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.dell.com/en-us");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test
	public void testScroll() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("scroll(0,10000)");
		
		Thread.sleep(2000);
		
		js.executeScript("scroll(0,-1000)");
		
	}
@AfterMethod
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
}




