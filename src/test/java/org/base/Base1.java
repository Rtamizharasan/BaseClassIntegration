package org.base;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1{
	public static WebDriver driver; 
	
	public String getValueFromExcel(int rowNo, int cellNo) throws IOException {
		File file = new File("C:\\Users\\Tamizharasan R\\eclipse-workspace\\BaseIntegration\\LIB\\Book1.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet("Sheet2");

		Row row = sheet.getRow(rowNo);
		
		Cell cell = row.getCell(cellNo);
		CellType cellType = cell.getCellType();
		String value = "";
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dcv = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				value = format.format(dcv);
			} else {
				double ncv = cell.getNumericCellValue();
				BigDecimal decimal = BigDecimal.valueOf(ncv);
				value = decimal.toString();
			}
		default:
			System.out.println(" failed GetValue");
			break;
		}
		return value;

	}
	public static void launch(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public WebElement findLocator(String locator, String value) {
		WebElement element = null;

		switch (locator) {
		case "id":
			element = driver.findElement(By.id(value));
			break;

		case "name":
			element = driver.findElement(By.name(value));

		case "xpath":
			element = driver.findElement(By.xpath(value));
		default:
			break;
			}
		
		return element;
	}
	public static void typeText(WebElement element, String data) {
		element.sendKeys(data);
	
	}
	public void submit(WebElement element) {
		element.click();
	}
	
	public static void select(WebElement element, String key, String value,int inp) {
		
	Select select = new Select(element);
	
	switch (key) {
	case "index":
		select.selectByIndex(inp);
		
		break;
	case "text":
		select.selectByVisibleText(value);
		break;
	case "value":
		select.selectByValue(value);

	default:
		break;
	}
	
	
	
	
	}
	public String getAttributeFromWebPage( WebElement element, String value) {
		String attribute = element.getAttribute(value);

		return attribute;
	}
	
	public String writeCell(String attribute, int rownum, int column) throws IOException {
	
		File file = new File("C:\\Users\\Tamizharasan R\\eclipse-workspace\\BaseIntegration\\LIB\\Book1.xlsx");
		FileInputStream steam = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(steam);
		Sheet sheet = workbook.getSheet("Sheet2");
		
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(column); 
		cell.setCellValue(attribute);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		return attribute;
	}
	
	public static  void takeScreenShot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(path+".png"));
	}
	
	
	
}
