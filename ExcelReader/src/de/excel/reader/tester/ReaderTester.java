package de.excel.reader.tester;

import de.excel.reader.ItemFactory;
import de.items.waffen.Weapon;

/**
 * @version 28.07.2016
 * @author frietscht
 */
public class ReaderTester {

	public static void main(String[] args) {

		Weapon waffe;
		ItemFactory em = new ItemFactory();
		waffe = em.createWeapon(3);
		System.out.println(waffe.getName());
		System.out.println(waffe.getItemDescription());
	}
}
