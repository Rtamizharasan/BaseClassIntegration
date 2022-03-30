package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AdactinExcel {

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
	
}
