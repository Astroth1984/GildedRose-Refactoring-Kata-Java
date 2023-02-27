package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

// ===================== Tests For Regular Item - Start ====================================
    @Test
    void givenSellinQualityValues_whenUpdateQuality_thenReturnValuesDecreased() {
        Item regularItem = new Item("Regular Item", 3, 3);
        GildedRose gildedRose = new GildedRose(new Item[] {regularItem});

        gildedRose.updateQuality();

        assertEquals(2, regularItem.sellIn);
        assertEquals(2, regularItem.quality);
    }

}
