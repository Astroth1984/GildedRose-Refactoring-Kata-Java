package com.gildedrose;

public class AgedBrieItem extends InventoryService {
	
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
