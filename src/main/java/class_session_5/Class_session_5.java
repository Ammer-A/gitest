package class_session_5;


	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

	public class Class_session_5 {
		
		@Test
		public void windowHandles() throws InterruptedException {
			
			WebDriver driver = new EdgeDriver();
	        driver.manage().window().maximize();
	     driver.get("https://www.yahoo.com/");
	        String T1=driver.getTitle();
	        System.out.println(T1);
	        String wh1 = driver.getWindowHandle();
	        System.out.println(wh1);
			driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("selenium");
			driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[1]/h3/a")).click();
			//////////////////////////////////////////////////////////////////////////////
			// use window  handle to get window handle then use for each to switch to the current window/ latest window
			Set <String> handles = driver.getWindowHandles();
		for (String i : handles) {
			driver.switchTo().window(i);
			
		}
			
			 String T2=driver.getTitle();
		        System.out.println(T2);
		        String wh2 = driver.getWindowHandle();
		        System.out.println(wh2);
		        Thread.sleep(2000);
		        if (driver.getCurrentUrl().contains("selenium")) {
		        driver.switchTo().window(wh1);

		}
		}

	}


