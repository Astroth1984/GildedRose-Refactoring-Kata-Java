package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

// ===================== Tests For Regular Item - Start ====================================
    @Test
    public void givenSellinQualityValues_whenUpdateQuality_thenReturnValuesDecreased() {
        Item regularItem = new Item("Regular Item", 3, 3);
        GildedRose gildedRose = new GildedRose(new Item[] {regularItem});

        gildedRose.updateQuality();

        assertEquals(2, regularItem.sellIn);
        assertEquals(2, regularItem.quality);
    }

    @Test
    public void givenMultipleItems_whenUpdateQuality_thenReturnAllItemsDecresedInValuesByOne() {
    	Item itemOne = new Item("Item One", 4, 5);
    	Item itemTwo = new Item("Item Two", 7, 5);
    	
    	GildedRose gildedRose = new GildedRose(new Item[] {itemOne, itemTwo});
    	
    	gildedRose.updateQuality();
    	
    	assertEquals(3, itemOne.sellIn);
    	assertEquals(6, itemTwo.sellIn);
    	
    	assertEquals(4, itemOne.quality);
    	assertEquals(4, itemTwo.quality);
    }
    
    @Test
    public void givenSellInPassed_whenUpdateQuality_thenReturnQualityDecreasedTwice() {
    	Item sellInPassedItem = new Item("Item with sellin Passed", -1, 6);
    	GildedRose gildedRose = new GildedRose(new Item[] {sellInPassedItem});
    	
    	gildedRose.updateQuality();
    	
    	assertEquals(4, sellInPassedItem.quality);
    	
    }
    
    @Test
    public void givenNullQuality_whenUpdateQuality_thenReturnNullQuality() {
    	
    	Item nullQualityItem = new Item("Item with null quality value", 2, 0);
    	GildedRose gildedRose = new GildedRose(new Item[] {nullQualityItem});
    	
    	gildedRose.updateQuality();
    	
    	assertEquals(0, nullQualityItem.quality);
    	
    }
    
// ===================== Tests For Regular Item - End ====================================
    
// ===================== Tests For "Aged Brie" Item - Start ===============================
    
   @Test
   public void givenAgedBrieItem_whenUpdateQuality_thenRetuenIncreasedQualityOverTime() {
	   
	   Item agedBrieItem = new Item("Aged Brie", 8, 4);
	   GildedRose gildedRose = new GildedRose(new Item[] {agedBrieItem});
	   
	   gildedRose.updateQuality();
	   
	   assertEquals(5, agedBrieItem.quality);
   }
   
   @Test
   public void gievnQualityEqualsToFifty_whenUpdateQuality_thenReturnQualityNeverGreaterThanFifty() {
	   Item agedBrieItem = new Item("Aged Brie", 4, 50);
	   GildedRose gildedRose = new GildedRose(new Item[] {agedBrieItem});
	   
	   gildedRose.updateQuality();
	   
	   assertEquals(50, agedBrieItem.quality);
   }
   
// ===================== Tests For "Aged Brie" Item - End ===============================

// ===================== Tests For "Sulfuras" Item - Start ===============================
   
   @Test
   public void sulfurasItem_never_has_to_be_sold_or_decreased_in_quality() {
	   
	   Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 80);
       GildedRose gildedRose = new GildedRose(new Item[] { item });

       gildedRose.updateQuality();

       assertEquals(5, item.sellIn);
       assertEquals(80, item.quality);
   }
   
// ===================== Tests For "Sulfuras" Item - End =============================== 

// ===================== Tests For "Backstage passes" Item - Start ======================
 
   @Test
   public void backstageItem_increases_in_quality_as_its_sellIn_approaches() {
	   
	   Item backstageItem = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 17);
       GildedRose gildedRose = new GildedRose(new Item[] {backstageItem});

       gildedRose.updateQuality();
       
       assertEquals(18, backstageItem.quality);
   }
   
   @Test
   public void backstageItem_increases_in_quality_by_two_when_ten_days_or_less_left() {
	   
	   Item backstageItem = new Item("Backstage passes to a TAFKAL80ETC concert", 8, 17);
       GildedRose gildedRose = new GildedRose(new Item[] {backstageItem});
       
       gildedRose.updateQuality();
       
       assertEquals(19, backstageItem.quality);
   }
}
