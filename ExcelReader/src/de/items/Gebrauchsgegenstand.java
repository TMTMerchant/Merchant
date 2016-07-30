package de.items;

/**
 * @version 06.11.2015
 * @author frietscht
 */

public class Gebrauchsgegenstand extends Item {

	public Gebrauchsgegenstand(String itemBeschreibung) {
		setItemType("Gebrauchsgegenstand");
		setIsStackable(true);
		setItemDescription(itemBeschreibung);
	}
}
