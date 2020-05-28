package SS;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleCalenderByJAvaScript {
	
	WebDriver driver;
	@Test
	public void ClalenderByJavAscriptMethod() {
		
		String date= "30-September-2016";
		  String dateArray[]= date.split("_");
		  
		  String day = dateArray[0];
		  String month= dateArray[1];
		  String year =dateArray[2]; 
		  
		  Select select= new Select(driver.findElement(By.name("selectmonth")));
		  select.selectByVisibleText(month);
		  
		  Select select1= new Select(driver.findElement(By.name("selectYear")));
		  select1.selectByVisibleText(year);
		  
		  //*[@id='crmclalender']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1];
		  //*[@id='crmclalender']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1];
		  
		  String beforeXpath= "//*[@id='crmclalender']/table/tbody/tr[2]/td/table/tbody/tr[";
		  String Afterxpath="]/td[";
		  
		  final int totleWeekdays=7;
		  
		  //2-1 ,2-2,2-3,2-4,2-5
		  //3-1,3-2,3-3,3-4,3-5
		  boolean flag=false;
		  String dayValue=null;
		  
		  for(int rowNum=2;rowNum<7;rowNum++) {
		   for(int colNum=1;colNum<totleWeekdays;colNum++) {
		   
		   try {
		    dayValue=driver.findElement(By.xpath(beforeXpath+rowNum+Afterxpath+colNum+"]")).getText();
		   }
		   catch(NoSuchElementException e) {
		    System.out.println("please enter correct value ");
		   }
		   System.out.println(dayValue);  //---------> it will print 1 to 30 value 
		   
		   if(dayValue.equals(day)) {
		    driver.findElement(By.xpath(beforeXpath+rowNum+Afterxpath+colNum+"]")).click();
		    flag=true;
		    break;
		   }
		    
		   }
		   
		   if(flag) {
		    break;
		   }
		  }
		  
		  
		  
		  
	}

}
