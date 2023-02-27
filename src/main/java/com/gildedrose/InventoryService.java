package com.gildedrose;

public class InventoryService {
	
	
	
	protected Item item;
	
	
	
	public InventoryService(Item item) {
		this.item = item;
	}
	
	
	public void updateItem() {
    	updateItemQuality();
    	decreaseSellInItem();
        
        if (this.item.sellIn < 0) {
        	expiredItem();
        }
        
    } 
   
	protected void updateItemQuality() {
	    decreaseItemQuality(); 
	}
	
	    
	protected void expiredItem() {
		decreaseItemQuality();  	
   }
	 
	 
	
	protected void decreaseItemQuality() {
		if (this.item.quality > 0) {
			this.item.quality--;
		}
	}
	
	
	protected void increaseItemQuality() {
		if (this.item.quality < 50) {
		    this.item.quality++;
		}
	}
	
	protected void decreaseSellInItem() {
	    this.item.sellIn--; 
	}
}
