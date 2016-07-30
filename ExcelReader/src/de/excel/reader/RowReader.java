package de.excel.reader;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

/**
 * @version 27.07.2016
 * @author frietscht
 */
public class RowReader {

	public HSSFRow getRowWithId(HSSFSheet sheet, int id) {
		int rowIndex = 1;
		while (sheet.getRow(rowIndex).getCell(0).getNumericCellValue() != id) {
			rowIndex++;
		}
		return sheet.getRow(rowIndex);
	}
}
