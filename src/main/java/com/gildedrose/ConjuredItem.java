package com.gildedrose;

public class ConjuredItem extends InventoryService {
	
	public ConjuredItem(Item item) {
		super(item);
	}

	@Override
	protected void decreaseItemQuality() {
		if (item.quality > 2) {
			item.quality -= 2;
		} else {
			item.quality = 0;
		}
	}

	
}
