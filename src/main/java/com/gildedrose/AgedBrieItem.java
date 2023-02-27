package com.gildedrose;

public class AgedBrieItem extends InventoryService {
	
	public static final String AGED_BRIE = "Aged Brie";
	
	public AgedBrieItem (Item item) {
		super(item);
	}

	@Override
	protected void updateItemQuality() {
		increaseItemQuality();
	}
	
	@Override
	protected void expiredItem() {
		increaseItemQuality();
	}

	
}
