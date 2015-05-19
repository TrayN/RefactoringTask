package com.gildedrose;

/**
 *
 * @author RAVLYK
 */

public class GildedRose {
    
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            
            if (!items[i].getName().equals(GildedRose.SULFURAS)) {
                if (items[i].getQuality() < 50) {
                    items[i].setQuality(items[i].getQuality() + 1);
                    if (items[i].getName().equals(GildedRose.BACKSTAGE)) {
                        if (items[i].getSellIn() < 11) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }
                        if (items[i].getSellIn() < 6) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }
                    }
                } 
                items[i].setSellIn(items[i].getSellIn() - 1);
            }
            
            if (items[i].getSellIn() < 0) {
                if(items[i].getName().equals(GildedRose.BACKSTAGE)){
                    items[i].setQuality(items[i].getQuality() - items[i].getQuality());
                }
                if(items[i].getName().equals(GildedRose.AGED_BRIE)){
                    if (items[i].getQuality() < 50) {
                        items[i].setQuality(items[i].getQuality() + 1);
                    }
                }
            }
            
        }
    }
}