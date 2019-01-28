package org.test9;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirCanada extends Base {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = getdriver();
		loadUrl("https://www.aircanada.com/ca/en/aco/home.html");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement cl = driver.findElement(By.xpath("//button[text()='Confirm | Confirmer']"));
		cl.click();
List<WebElement> tr = driver.findElements(By.xpath("//span[@class='form-label-text']"));
String x1 = getData(2, 0);
System.out.println(x1);
for (int i = 1; i <= tr.size(); i++) {
	if (tr.get(i).getText().trim().equals(getData(2, 0))) {
		btnClick(tr.get(i));
			}	}
Thread.sleep(3000);
WebElement frm = driver.findElement(By.xpath("//span[text()=' FROM ']"));
	type(frm, getData(1,1));
	String a = frm.getAttribute("value");
	System.out.println(a);
		WebElement to = driver.findElement(By.xpath("//span[@data-ng-if='!trip.destination.type && !trip.destination.typed']"));
	type(to, getData(1,2));
	}
}



