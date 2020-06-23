package mavetest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MaveOne {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement unam=driver.findElement(By.name("userName"));
		 WebElement pword=driver.findElement(By.name("password"));
				unam.sendKeys("tutorial");
			    pword.sendKeys("tutorial");
			    driver.findElement(By.name("login")).submit();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ch\\chromedriver.exe"); 
	 driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");

  }

  @AfterTest
  public void afterTest() {
  }

}
