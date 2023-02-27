package com.gildedrose;

public class InventoryItemFactory {
	
	private Item item;
	
	
	public InventoryItemFactory(Item item) {
		this.item = item;
	}
	
	public InventoryService inventoryItemCreation() {
		
		if(item.name.equals(AgedBrieItem.AGED_BRIE)) {
			return new AgedBrieItem(item);
		}
		if(item.name.equals(BackstageItem.BACK_STAGE_PASS)) {
			return new BackstageItem(item);
		}
		if(item.name.equals(SulfurasItem.SULFURAS)) {
			return new SulfurasItem(item);
		}
		if(item.name.equals("Conjured")) {
			return new ConjuredItem(item);
		}
    	return new InventoryService(item);
    }
	
	

}
