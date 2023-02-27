package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

// ===================== Tests For Regular Item - Start ====================================
    @Test
    public void givenSellinQualityValues_whenupdateInventoryItems_thenReturnValuesDecreased() {
        Item regularItem = new Item("Regular Item", 3, 3);
        GildedRose gildedRose = new GildedRose(new Item[] {regularItem});

        gildedRose.updateInventoryItems();

        assertEquals(2, regularItem.sellIn);
        assertEquals(2, regularItem.quality);
    }

    @Test
    public void givenMultipleItems_whenupdateInventoryItems_thenReturnAllItemsDecresedInValuesByOne() {
    	Item itemOne = new Item("Item One", 4, 5);
    	Item itemTwo = new Item("Item Two", 7, 5);
    	
    	GildedRose gildedRose = new GildedRose(new Item[] {itemOne, itemTwo});
    	
    	gildedRose.updateInventoryItems();
    	
    	assertEquals(3, itemOne.sellIn);
    	assertEquals(6, itemTwo.sellIn);
    	
    	assertEquals(4, itemOne.quality);
    	assertEquals(4, itemTwo.quality);
    }
    
    @Test
    public void givenSellInPassed_whenupdateInventoryItems_thenReturnQualityDecreasedTwice() {
    	Item sellInPassedItem = new Item("Item with sellin Passed", -1, 6);
    	GildedRose gildedRose = new GildedRose(new Item[] {sellInPassedItem});
    	
    	gildedRose.updateInventoryItems();
    	
    	assertEquals(4, sellInPassedItem.quality);
    	
    }
    
    @Test
    public void givenNullQuality_whenupdateInventoryItems_thenReturnNullQuality() {
    	
    	Item nullQualityItem = new Item("Item with null quality value", 2, 0);
    	GildedRose gildedRose = new GildedRose(new Item[] {nullQualityItem});
    	
    	gildedRose.updateInventoryItems();
    	
    	assertEquals(0, nullQualityItem.quality);
    	
    }
    
// ===================== Tests For Regular Item - End ====================================
    
// ===================== Tests For "Aged Brie" Item - Start ===============================
    
   @Test
   public void givenAgedBrieItem_whenupdateInventoryItems_thenRetuenIncreasedQualityOverTime() {
	   
	   Item agedBrieItem = new Item("Aged Brie", 8, 4);
	   GildedRose gildedRose = new GildedRose(new Item[] {agedBrieItem});
	   
	   gildedRose.updateInventoryItems();
	   
	   assertEquals(5, agedBrieItem.quality);
   }
   
   @Test
   public void gievnQualityEqualsToFifty_whenupdateInventoryItems_thenReturnQualityNeverGreaterThanFifty() {
	   Item agedBrieItem = new Item("Aged Brie", 4, 50);
	   GildedRose gildedRose = new GildedRose(new Item[] {agedBrieItem});
	   
	   gildedRose.updateInventoryItems();
	   
	   assertEquals(50, agedBrieItem.quality);
   }
   
// ===================== Tests For "Aged Brie" Item - End ===============================

// ===================== Tests For "Sulfuras" Item - Start ===============================
   
   @Test
   public void sulfurasItem_never_has_to_be_sold_or_decreased_in_quality() {
	   
	   Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 80);
       GildedRose gildedRose = new GildedRose(new Item[] { item });

       gildedRose.updateInventoryItems();

       assertEquals(5, item.sellIn);
       assertEquals(80, item.quality);
   }
   
// ===================== Tests For "Sulfuras" Item - End =============================== 

// ===================== Tests For "Backstage passes" Item - Start ======================
 
   @Test
   public void backstageItem_increases_in_quality_as_its_sellIn_approaches() {
	   
	   Item backstageItem = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 17);
       GildedRose gildedRose = new GildedRose(new Item[] {backstageItem});

       gildedRose.updateInventoryItems();
       
       assertEquals(18, backstageItem.quality);
   }
   
   @Test
   public void backstageItem_increases_in_quality_by_two_when_ten_days_or_less_left() {
	   
	   Item backstageItemOne = new Item("Backstage passes to a TAFKAL80ETC concert", 8, 17);
	   Item backstageItemTwo = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 17);
	   
       GildedRose gildedRose = new GildedRose(new Item[] {backstageItemOne, backstageItemTwo});
       
       gildedRose.updateInventoryItems();
       
       assertEquals(19, backstageItemOne.quality);
       assertEquals(19, backstageItemTwo.quality);
   }
   
   @Test
   public void backstageItem_increases_in_quality_by_three_when_five_days_left() {
	   
	   Item backstageItem = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 12);
	   
	   GildedRose gildedRose = new GildedRose(new Item[] {backstageItem});
       gildedRose.updateInventoryItems();
       
       assertEquals(15, backstageItem.quality);
   }
   
   @Test 
   public void backstageItem_increases_in_quality_by_three_when_less_than_five_days_left() {
	   
	   Item backstageItem = new Item("Backstage passes to a TAFKAL80ETC concert", 3, 12);
	   
	   GildedRose gildedRose = new GildedRose(new Item[] {backstageItem});
       gildedRose.updateInventoryItems();
       
       assertEquals(15, backstageItem.quality);
	   
   }
   
   @Test
   public void backstageItem_increases_in_quality_but_never_greater_than_fifty() {
	   
	   Item backstageItem = new Item("Backstage passes to a TAFKAL80ETC concert", 3, 49);
	   
	   GildedRose gildedRose = new GildedRose(new Item[] {backstageItem});
       gildedRose.updateInventoryItems();
       
       assertEquals(50, backstageItem.quality);
   }
   
   @Test
   public void backstageItem_drops_to_zero_after_the_concert() {
	   
	   Item backstageItem = new Item("Backstage passes to a TAFKAL80ETC concert", -1, 49);
	   
	   GildedRose gildedRose = new GildedRose(new Item[] {backstageItem});
       gildedRose.updateInventoryItems();
       
       assertEquals(0, backstageItem.quality);
   }
// ===================== Tests For "Backstage passes" Item - End ======================
   
   
   
// ===================== Tests For "Conjured" Item - Start ====================================
   
   @Test
   public void conjured_item_decreases_twice_as_fast_as_normal_items() {
	   
	   Item conjuredItem = new Item("Conjured", 12, 15);
	   GildedRose gildedRose = new GildedRose(new Item[] {conjuredItem});
	   gildedRose.updateInventoryItems();
	   
	   assertEquals(13, conjuredItem.quality);
	   
   }
   
   @Test
   public void conjured_item_should_never_be_negative_in_quality() {
	   Item conjuredItem = new Item("Conjured", 4, 1);
	   GildedRose gildedRose = new GildedRose(new Item[] {conjuredItem});
	   gildedRose.updateInventoryItems();
	   
	   assertEquals(0, conjuredItem.quality);
   }
   
// ===================== Tests For "Conjured" Item - Start ====================================
}
