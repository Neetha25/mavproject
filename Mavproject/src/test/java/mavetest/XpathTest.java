package mavetest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class XpathTest {
	WebDriver driver;
  
	@Test
  public void f() {
	  
	  WebElement unam=driver.findElement(By.xpath("//*[@name='userName']"));
		 WebElement pword=driver.findElement(By.xpath("//*[contains=(@name,'user')]"));
				unam.sendKeys(tutorial);
			    pword.sendKeys(tutorial);
			    driver.findElement(By.xpath("//*[@name='login')]")).submit();
			    //driver.findElement(By.xpath("//*[text()='REGISTER']"));
}
  
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("http://newtours.demoaut.com/");
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
		 driver= new ChromeDriver();
			
  }

  @AfterTest
  public void afterTest() {
  }

}
