package com.gildedrose;

public class BackstageItem extends InventoryService {

	public BackstageItem(Item item) {
		super(item);
	}

	@Override
	protected void updateItemQuality() {
		increaseItemQuality();
		
		if (this.item.sellIn < 11) {
			increaseItemQuality();
        }

        if (this.item.sellIn < 6) {
        	increaseItemQuality();
        }
	}

	@Override
	protected void expiredItem() {
		this.item.quality = 0;
	}
	
	
	
	
}
