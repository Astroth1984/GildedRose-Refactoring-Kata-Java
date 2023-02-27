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
}
