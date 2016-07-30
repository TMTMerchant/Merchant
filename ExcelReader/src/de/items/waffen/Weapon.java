package de.items.waffen;

import de.item.EquipmentItem;

/**
 * @version 06.11.2015
 * @author frietscht
 */

public class Weapon extends EquipmentItem {

	private int id;
	private int physicalAttackDamage;
	private int magicDamage;
	private int attackSpeed;
	private boolean oneHanded;
	private char scaling;

	public int getPhysicalAttackDamage() {
		return physicalAttackDamage;
	}

	public void setPhysicalAttackDamage(int physicalAttackDamage) {
		this.physicalAttackDamage = physicalAttackDamage;
	}

	public int getMagicDamage() {
		return magicDamage;
	}

	public void setMagicDamage(int magicDamage) {
		this.magicDamage = magicDamage;
	}

	public int getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public char getScaling() {
		return scaling;
	}

	public void setScaling(char scaling) {
		this.scaling = scaling;
	}

	public boolean isOneHanded() {
		return oneHanded;
	}

	public void setIsOneHanded(boolean isOneHanded) {
		this.oneHanded = isOneHanded;
	}

	public int getID() {
		return id;
	}
}
