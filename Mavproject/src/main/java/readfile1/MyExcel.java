package readfile1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyExcel

{    
	XSSFSheet Sh;
	
	public MyExcel() throws IOException
	{
		
FileInputStream f=new FileInputStream("C:\\Users\\User\\Desktop\\readfile.xlsx");
XSSFWorkbook w =new XSSFWorkbook(f);
Sh =w.getSheet("Sheet1");
	}
}
