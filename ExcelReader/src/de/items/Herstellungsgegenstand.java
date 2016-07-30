package de.items;

/**
 * @version 05.11.2015
 * @author frietscht
 */

public class Herstellungsgegenstand extends Item{

	public Herstellungsgegenstand(String itemBeschreibung) {
		setItemType("Herstellungsgegenstand");
		setIsStackable(true);
		setItemDescription(itemBeschreibung);
	}
}
