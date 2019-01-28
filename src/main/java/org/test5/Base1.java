package org.test5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Base1 {
public static void main(String[] args) throws IOException {
	File loc=new File("C:\\Users\\Bidisha\\eclipse-workspace2\\Employee\\src\\main\\java\\excel\\Book1.xlsx");
	FileInputStream stream=new FileInputStream(loc);
	Workbook w= new XSSFWorkbook(stream);
	Sheet s=w.getSheet("Datas");
	Row r = s.getRow(2);
	Cell c = r.getCell(1);
	String name = c.getStringCellValue();
	if(name.equals("chennai")) {
		c.setCellValue("INDIA");
	}		
FileOutputStream o=new FileOutputStream(loc);
w.write(o);
System.out.println("done");
}
}
