package de.excel.reader;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @version 27.07.2016
 * @author frietscht
 */
public class SheetReader {
	
	public HSSFSheet getSpecialExcelSheet(HSSFWorkbook excelWorkbook, EquipmentType equipmentType) {
		HSSFSheet sheet = null;
		switch (equipmentType) {
		case WEAPON:
			sheet = excelWorkbook.getSheet("WEAPONS");
			break;
		case CHESTARMOR:
			sheet = excelWorkbook.getSheet("CHEST");
			break;
		default:
			sheet = null;
			break;
		}
		return sheet;
	}
}
