package de.excel.reader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @version 29.06.2016
 * @author frietscht
 */
public class ExcelReader {

	private final String	excelURL	= "ItemExcel/test.xls";
	private HSSFWorkbook	excelFile;

	public HSSFWorkbook getExcelWorkbook() {
		try {
			excelFile = new HSSFWorkbook(new FileInputStream(excelURL));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return excelFile;
	}
}