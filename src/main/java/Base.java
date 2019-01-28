import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Base {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\Bidisha\\eclipse-workspace2\\Employee\\src\\main\\java\\excel\\Book1.xlsx");
FileInputStream Stream=new FileInputStream(loc);
Workbook w=new XSSFWorkbook(Stream);
Sheet S=w.getSheet("Datas");
for(int i=0;i<S.getPhysicalNumberOfRows();i++) {
Row r=S.getRow(i);

for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
	Cell c = r.getCell(j);
		int type=c.getCellType();
	if(type==1) {
		String name=c.getStringCellValue();
		System.out.println(name);
		}
	if(type==0) {
	double d=c.getNumericCellValue();
long l=(long)d;
String name=String.valueOf(l);
System.out.println(name);
}
}
}
}}
