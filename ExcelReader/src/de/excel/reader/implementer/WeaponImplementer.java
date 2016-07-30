package de.excel.reader.implementer;

import org.apache.poi.hssf.usermodel.HSSFRow;

import de.items.waffen.Weapon;

/**
 * @version 28.07.2016
 * @author frietscht
 */
public class WeaponImplementer {

	private final int	nameValue			= 1;
	private final int	attackValue			= 2;
	private final int	mAttackValue		= 3;
	private final int	speedValue			= 4;
	private final int	oneHandValue		= 5;
	private final int	scalingValue		= 6;
	private final int	sellValue			= 7;
	private final int	descriptionValue	= 8;

	private Weapon		weapon;

	public Weapon implementWeapon(HSSFRow row) {
		weapon = new Weapon();
		weapon.setName(row.getCell(nameValue).getStringCellValue());
		weapon.setPhysicalAttackDamage((int) row.getCell(attackValue).getNumericCellValue());
		weapon.setMagicDamage((int) row.getCell(mAttackValue).getNumericCellValue());
		weapon.setAttackSpeed((int) row.getCell(speedValue).getNumericCellValue());
		weapon.setIsOneHanded(row.getCell(oneHandValue).getStringCellValue() == "TRUE");
		weapon.setScaling(row.getCell(scalingValue).getStringCellValue().charAt(0));
		weapon.setSalesValue((int) row.getCell(sellValue).getNumericCellValue());
		weapon.setItemDescription(row.getCell(descriptionValue).getStringCellValue());
		return weapon;
	}
}
