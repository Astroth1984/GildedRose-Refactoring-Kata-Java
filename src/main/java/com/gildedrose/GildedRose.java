package com.gildedrose;

class GildedRose {
	
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateInventoryItems() {
        for (Item item: items) {
        	
        	new InventoryItemFactory(item).inventoryItemCreation().updateItem();
        	
        }
    }
    
     
}
