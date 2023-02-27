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
}
