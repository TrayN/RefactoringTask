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
        for (int i = 0; i < items.length; i++) {
            if(items[i].name.equals(GildedRose.SULFURAS)){break;}
            
            switch (items[i].name) {
                case GildedRose.AGED_BRIE:  
                    items[i].sellIn -= 1;
                    items[i].quality +=1;
                    if(items[i].sellIn<0)
                        items[i].quality +=1;
                    break;
                case GildedRose.BACKSTAGE: 
                    items[i].quality +=1;
                    if(items[i].sellIn<11)
                        items[i].quality +=1;
                    if(items[i].sellIn<6)
                        items[i].quality +=1;
                    items[i].sellIn -= 1;
                    if(items[i].sellIn<0)
                        items[i].quality =0;
                    break;
                default:
                    items[i].sellIn -= 1;
                    items[i].quality -=1;
                    if(items[i].sellIn<0)
                        items[i].quality -=1;
                    break; 
            }
            if(items[i].quality<0) items[i].quality=0;
            if(items[i].quality>50) items[i].quality=50;
            
            
            /*if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }*/
        }
    }
}