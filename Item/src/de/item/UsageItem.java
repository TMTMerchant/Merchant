package de.item;

public class UsageItem extends Item {

	public UsageItem(String itemBeschreibung) {
		setItemType("Gebrauchsgegenstand");
		setIsStackable(true);
		setItemDescription(itemBeschreibung);
	}
}
