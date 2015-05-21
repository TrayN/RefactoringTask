package com.gildedrose;

/**
 *
 * @author RAVLYK
 */

public class GildedRose {
    
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED = "Conjured";
    
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
        for (int i = 0; i < items.length; i++){
            if(items[i].name.equals(GildedRose.SULFURAS)){
                items[i].quality=80;
            }else{
                if(items[i].quality<0){items[i].quality=0;}
                if(items[i].quality>50){items[i].quality=50;}
            }
        }
    }

    public void updateQuality() {
        for (int i = 0, value = 1, multiplier = 1; i < items.length; i++) {
            if(items[i].name.equals(GildedRose.SULFURAS)){break;}
            items[i].sellIn -= 1;
            value = 1;
            multiplier = 1;
            if(items[i].sellIn<0) value = 2;
            if(items[i].name.contains(GildedRose.CONJURED)) multiplier = 2;
            switch (items[i].name) {
                case GildedRose.AGED_BRIE:  
                    items[i].quality +=value;
                    break;
                case GildedRose.BACKSTAGE: 
                    items[i].quality +=1;
                    if(items[i].sellIn<10)
                        items[i].quality +=1;
                    if(items[i].sellIn<5)
                        items[i].quality +=1;
                    if(items[i].sellIn<0)
                        items[i].quality =0;
                    break;
                default:
                    items[i].quality -=value*multiplier;
                    break; 
            }
            if(items[i].quality<0) items[i].quality=0;
            if(items[i].quality>50) items[i].quality=50;
        }
    }
}