/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose;

/**
 *
 * @author RAVLYK
 */

public class GildedRose {
    
    Item[] items;
    
    public Item[] getItems(){
        return items;
    }

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].getQuality() > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].getQuality() - 1;
                    }
                }
            } else {
                if (items[i].getQuality() < 50) {
                    items[i].quality = items[i].getQuality() + 1;

                    if (items[i].getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].getSellIn() < 11) {
                            if (items[i].getQuality() < 50) {
                                items[i].quality = items[i].getQuality() + 1;
                            }
                        }

                        if (items[i].getSellIn() < 6) {
                            if (items[i].getQuality() < 50) {
                                items[i].quality = items[i].getQuality() + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].getSellIn() - 1;
            }

            if (items[i].getSellIn() < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].getQuality() > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].getQuality() - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].getQuality() - items[i].getQuality();
                    }
                } else {
                    if (items[i].getQuality() < 50) {
                        items[i].quality = items[i].getQuality() + 1;
                    }
                }
            }
        }
    }
}
