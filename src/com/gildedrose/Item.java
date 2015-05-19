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
    
    
    
}
