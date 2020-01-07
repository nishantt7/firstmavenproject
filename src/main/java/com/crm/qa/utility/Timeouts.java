package com.crm.qa.utility;

import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.crm.qa.base.Testbase;

public class Timeouts extends Testbase
{	
         // static Workbook book;
        //  static Sheet sheet;
	    public Timeouts() throws IOException
	    {
		super();
		}
		public static int pageloadtimeout=20;
		public static int implicitwaittime=20;
		public static void switchtoframe(String name)
		{
			driver.switchTo().frame(name);
		}
		public static Object[][] getdata(String sheetname) throws IOException
		{
			File src=new File("C:\\eclipse\\firstmavenproject\\src\\main\\java\\com\\crm\\qa\\testdata\\testdata.xlsx");
			FileInputStream obj1=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(obj1);
			for (int k=0;k<wb.getNumberOfSheets();k++)
			{
				XSSFSheet sheet1=wb.getSheetAt(k);
				Object[][] data=new Object[sheet1.getLastRowNum()][sheet1.getRow(0).getLastCellNum()];
				for(int i=0;i<sheet1.getLastRowNum();i++)
				{
					for(int j=0;j<sheet1.getRow(0).getFirstCellNum();j++)
					{
						data[i][j]=sheet1.getRow(i+1).getCell(k).toString();
					}
				}
				return data;
			}
			return null;
		}
}
		








