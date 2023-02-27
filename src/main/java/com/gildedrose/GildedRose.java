package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateInventoryItems() {
        for (Item item: items) {
        	updateItem(item);
        }
    }
    
    public void updateItem(Item item) {
    	updateItemQuality(item);
        decreaseSellInItem(item);
        
        if (item.sellIn < 0) {
        	expiredItem(item);
        }
        
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
    		
    	} else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
    		
			decreaseItemQuality(item);	
    	}
    }

    
    
	private void decreaseItemQuality(Item item) {
		if (item.quality > 0) {
			item.quality--;
		}
	}

    
	private void increaseItemQuality(Item item) {
		if (item.quality < 50) {
		    item.quality++;
		}
	}
	
	private void decreaseSellInItem(Item item) {
    	if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        } else {
        	item.sellIn--;
        }
    }
    
}
