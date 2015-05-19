package com.gildedrose;

/**
 *
 * @author RAVLYK
 */
public class Item {
    private String name;
    private int quality;
    private int sellIn;
    
    public Item(String name, int quality, int sellIn){
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the quality
     */
    public int getQuality() {
        return quality;
    }

    /**
     * @return the sellIn
     */
    public int getSellIn() {
        return sellIn;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param quality the quality to set
     */
    public void setQuality(int quality) {
        this.quality = quality;
    }

    /**
     * @param sellIn the sellIn to set
     */
    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }
    
    
    
}
