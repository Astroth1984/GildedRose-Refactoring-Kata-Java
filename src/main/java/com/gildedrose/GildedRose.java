package com.gildedrose;

class GildedRose {
	
	private final String AGED_BRIE = "Aged Brie";
	private final String BACK_STAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
	private final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	
	
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
		
		if(item.name.equals(AGED_BRIE)) {
			return new AgedBrieItem(item);
		}
		if(item.name.equals(BACK_STAGE_PASS)) {
			return new BackstageItem(item);
		}
		if(item.name.equals(SULFURAS)) {
			return new SulfurasItem(item);
		}
    	return new InventoryService(item);
    }
     
}
