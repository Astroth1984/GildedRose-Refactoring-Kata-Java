package com.gildedrose;

public class SulfurasItem extends InventoryService {
	
	
	public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	
	
	public SulfurasItem (Item item) {
		super(item);
	}

	@Override
	protected void updateItemQuality() {
		return;
	}

	@Override
	protected void expiredItem() {
		return;
	}

	@Override
	protected void decreaseSellInItem() {
		return;
	}
	
	
	
	

	
}
