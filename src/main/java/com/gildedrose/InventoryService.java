package com.gildedrose;

public class InventoryService {
	
	private Item item;
	
	public InventoryService(Item item) {
		this.item = item;
	}

	    
	    
	public void updateItemQuality(Item item) {
		
		if (item.name.equals("Aged Brie")) {
			
			increaseItemQuality(item);
			
		} else if(item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			
			increaseItemQuality(item);
			
			if (item.sellIn < 11) {
				increaseItemQuality(item);
	        }
	
	        if (item.sellIn < 6) {
	        	increaseItemQuality(item);
	        }
	        
		} else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
	        	return;
	        	
	    } else {
	    	decreaseItemQuality(item); 
	    }
	}
	
	    
	public void expiredItem(Item item) {
	    	
		if(item.name.equals("Aged Brie")) {
			
			increaseItemQuality(item);
			
		} else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			
			item.quality = 0;
			
		} else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
			
			return;
			
		} else {
			
			decreaseItemQuality(item);
		}
	   	
   }
	 
	 
	
	public void decreaseItemQuality(Item item) {
		if (item.quality > 0) {
			item.quality--;
		}
	}
	
	
	private void increaseItemQuality(Item item) {
		if (item.quality < 50) {
		    item.quality++;
		}
	}
	
	public void decreaseSellInItem(Item item) {
		if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
	        return;
	    } else {
	    	item.sellIn--;
	    }
	}
}
