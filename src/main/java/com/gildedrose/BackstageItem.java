package com.gildedrose;

public class BackstageItem extends InventoryService {
	
	public static final String BACK_STAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";

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
