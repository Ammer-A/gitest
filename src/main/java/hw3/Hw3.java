package hw3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
@Test
public class Hw3 {
	public void homework() {
WebDriver driver= new ChromeDriver(); //  step 1 Initialize driver
Actions  Action = new Actions(driver );
driver.manage().window().maximize(); // step 2 open browser window and maximize screen 
driver.manage().deleteAllCookies();
driver.get("https://objectspy.space/"); // step 3 get url
/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////





WebElement Link_Two = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]"));
WebElement Link_One =  driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]"));


Action.moveToElement(Link_One).keyDown(Keys.CONTROL).click().build().perform();
Action.moveToElement(Link_Two).keyDown(Keys.CONTROL).click().build().perform();
System.out.println(driver.getTitle());
Set <String> handles = driver.getWindowHandles();
for (String i : handles) {
	driver.switchTo().window(i);
	
	}

//WebElement GET_Tbl_CELLVALUE=	driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[4]/td[3]"));
//System.out.println(GET_Tbl_CELLVALUE.getText());
//Select Choice= (Select) driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[1]/select"));
//Choice.selectByValue("IP");
//WebElement Checkbox_SEL =driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[1]/input[11]"));
//if (Checkbox_SEL.isSelected()==true) {
//Checkbox_SEL.click();
}
}


//}

