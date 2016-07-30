package de.excel.reader.implementer;

import org.apache.poi.hssf.usermodel.HSSFRow;

import de.items.waffen.ChestArmor;

/**
 * @version 28.07.2016
 * @author frietscht
 */
public class ChestArmorImplementer {

	ChestArmor chestArmor;

	public ChestArmor implementArmor(HSSFRow row) {
		chestArmor = new ChestArmor();
		chestArmor.setName(row.getCell(1).getStringCellValue());
		//TODO Implementierung fertig schreiben
		return chestArmor;
	}

}
