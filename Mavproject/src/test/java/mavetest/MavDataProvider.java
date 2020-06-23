package mavetest;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MavDataProvider {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s)
  {
	  WebElement unam=driver.findElement(By.name("userName"));
		 WebElement pword=driver.findElement(By.name("password"));
				unam.sendKeys(n);
			    pword.sendKeys(s);
			    driver.findElement(By.name("login")).submit();
  }
 
  @BeforeMethod
  public void beforeMethod() {
		driver.get("http://newtours.demoaut.com/");
  }


  @DataProvider
  public Object[][] dp() throws BiffException, IOException {
	  FileInputStream f= new FileInputStream("D:\\Selenium -MidunSir\\mydata.xls");
	  Workbook w=Workbook.getWorkbook(f);
	  Sheet s=w.getSheet("Sheet1");
	  int r=s.getRows();
	  int c=s.getColumns();
	 String input[][]=new String[r][c];
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)  
		  {
			  Cell cc=s.getCell(j,i);
		
			  input[i][j]=cc.getContents();
			  
			  }
	  }
	  return input;	  
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
