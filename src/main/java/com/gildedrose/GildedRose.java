package com.gildedrose;

class GildedRose {
	
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateInventoryItems() {
        for (Item item: items) {
        	inventoryItemFactory(item).updateItem();
        }
    }
    
    public InventoryService inventoryItemFactory(Item item) {
		
		if(item.name.equals(AgedBrieItem.AGED_BRIE)) {
			return new AgedBrieItem(item);
		}
		if(item.name.equals(BackstageItem.BACK_STAGE_PASS)) {
			return new BackstageItem(item);
		}
		if(item.name.equals(SulfurasItem.SULFURAS)) {
			return new SulfurasItem(item);
		}
    	return new InventoryService(item);
    }
     
}
