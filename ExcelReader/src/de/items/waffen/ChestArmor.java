package de.items.waffen;

/**
 * @version 26.07.2016
 * @author frietscht
 */
public class ChestArmor {

	private String	name;
	private int		physicalArmorValue;
	private int		magicalArmorValue;
	private int		id;

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhysicalArmorValue() {
		return physicalArmorValue;
	}

	public void setPhysicalArmorValue(int physicalArmorValue) {
		this.physicalArmorValue = physicalArmorValue;
	}

	public int getMagicalArmorValue() {
		return magicalArmorValue;
	}

	public void setMagicalArmorValue(int magicalArmorValue) {
		this.magicalArmorValue = magicalArmorValue;
	}
}
