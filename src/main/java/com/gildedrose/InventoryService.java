package com.gildedrose;

public class InventoryService {
	
	private Item item;
	
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
   
	public void updateItemQuality() {
		
		if (this.item.name.equals("Aged Brie")) {
			
			increaseItemQuality();
			
		} else if(this.item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			
			increaseItemQuality();
			
			if (this.item.sellIn < 11) {
				increaseItemQuality();
	        }
	
	        if (this.item.sellIn < 6) {
	        	increaseItemQuality();
	        }
	        
		} else if (this.item.name.equals("Sulfuras, Hand of Ragnaros")) {
	        	return;
	        	
	    } else {
	    	decreaseItemQuality(); 
	    }
	}
	
	    
	public void expiredItem() {
	    	
		if(this.item.name.equals("Aged Brie")) {
			
			increaseItemQuality();
			
		} else if (this.item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			
			this.item.quality = 0;
			
		} else if (this.item.name.equals("Sulfuras, Hand of Ragnaros")) {
			
			return;
			
		} else {
			
			decreaseItemQuality();
		}
	   	
   }
	 
	 
	
	public void decreaseItemQuality() {
		if (this.item.quality > 0) {
			this.item.quality--;
		}
	}
	
	
	private void increaseItemQuality() {
		if (this.item.quality < 50) {
		    this.item.quality++;
		}
	}
	
	public void decreaseSellInItem() {
		if (this.item.name.equals("Sulfuras, Hand of Ragnaros")) {
	        return;
	    } else {
	    	this.item.sellIn--;
	    }
	}
}
