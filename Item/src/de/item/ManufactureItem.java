package de.item;

public class ManufactureItem extends Item {

	public ManufactureItem(String itemBeschreibung) {
		setItemType("Herstellungsgegenstand");
		setIsStackable(true);
		setItemDescription(itemBeschreibung);
	}
}
