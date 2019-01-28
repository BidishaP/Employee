package org.test9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;

	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bidisha\\eclipse-workspace2\\Employee\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void loadUrl(String name) {
		driver.get(name);
	}

	public static String getData(int rowno, int cellno) throws IOException {
		File loc = new File("C:\\Users\\Bidisha\\eclipse-workspace2\\Employee\\excel1\\air.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Datas");
		Row r = s.getRow(rowno);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();
		String name = null;
		if (type == 1) {
			name = c.getStringCellValue();
		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(c));
				
			name = new SimpleDateFormat("DD-MMM-YY").format(c.getDateCellValue());
		} else {
			name = String.valueOf((long) c.getNumericCellValue());
		}
		return name;
	}

	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void type(WebElement element,String name) {
element.sendKeys(name);
}
}
