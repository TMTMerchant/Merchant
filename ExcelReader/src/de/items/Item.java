package de.items;

import javax.swing.ImageIcon;

/**
 * @version 06.11.2015
 * @author FrietschT
 */

public abstract class Item {

	private int			amountOfStackableItems;
	private boolean		isStackable	= false;
	private int			salesValue;

	private String		itemType;
	private String		itemDescription;

	private String		name;
	private ImageIcon	image;

	public boolean getIsStackable() {
		return isStackable;
	}

	public void setIsStackable(boolean isStackable) {
		this.isStackable = isStackable;
	}

	public int getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(int salesValue) {
		this.salesValue = salesValue;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}

	public int getAmountOfStackableItems() {
		return amountOfStackableItems;
	}

	public void setAmountOfStackableItems(int amountOfStackableItems) {
		this.amountOfStackableItems = amountOfStackableItems;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
}
