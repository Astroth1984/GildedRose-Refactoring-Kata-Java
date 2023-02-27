package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateInventoryItems() {
        for (Item item: items) {
        	InventoryService itemFactory = new InventoryService(item);
        	updateItem(item, itemFactory);
        }
    }
    
    
    public void updateItem(Item item, InventoryService itemFactory) {
    	itemFactory.updateItemQuality(item);
    	itemFactory.decreaseSellInItem(item);
        
        if (item.sellIn < 0) {
        	itemFactory.expiredItem(item);
        }
        
    }
}
