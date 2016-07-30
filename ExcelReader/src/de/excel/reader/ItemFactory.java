package de.excel.reader;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import de.excel.reader.implementer.ChestArmorImplementer;
import de.excel.reader.implementer.WeaponImplementer;
import de.items.waffen.ChestArmor;
import de.items.waffen.Weapon;

/**
 * @version 28.07.2016
 * @author frietscht
 */
public class ItemFactory {

	private final ExcelReader			excelReader;
	private final SheetReader			sheetReader;
	private final RowReader				rowReader;
	private final WeaponImplementer		weaponImp;
	private final ChestArmorImplementer	chestArmorImp;

	public ItemFactory() {
		excelReader = new ExcelReader();
		sheetReader = new SheetReader();
		rowReader = new RowReader();
		weaponImp = new WeaponImplementer();
		chestArmorImp = new ChestArmorImplementer();
	}

	public Weapon createWeapon(int id) {
		HSSFSheet sheet = sheetReader.getSpecialExcelSheet(excelReader.getExcelWorkbook(), EquipmentType.WEAPON);
		HSSFRow row = rowReader.getRowWithId(sheet, id);
		Weapon waffe = weaponImp.implementWeapon(row);
		return waffe;
	}

	public ChestArmor createChestArmor(int id) {
		HSSFSheet sheet = sheetReader.getSpecialExcelSheet(excelReader.getExcelWorkbook(), EquipmentType.WEAPON);
		HSSFRow row = rowReader.getRowWithId(sheet, id);
		ChestArmor chestArmor = chestArmorImp.implementArmor(row);
		return chestArmor;
	}
}
