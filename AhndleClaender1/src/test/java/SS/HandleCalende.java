package SS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleCalende {

	WebDriver driver;
	
	@Test
	public void HandleCalederMethod() {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\CCC\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver= new ChromeDriver();
				
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * driver.findElement(By.xpath(
		 * "(//button[@class='ui-datepicker-trigger'][@type='button'])[1]")).click();
		 * driver.findElement(By.xpath("//a[text()='28']")).click();
		 */
		
	WebElement date= driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateval= "30-12-2018";
		selectDateByJs(driver, date, dateval);
		
	}
	
	
	public static void selectDateByJs(WebDriver driver , WebElement element,String dateval) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
	}
	
}
