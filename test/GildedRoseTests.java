/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.gildedrose.Item;
import com.gildedrose.GildedRose;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author RAVLYK
 */
public class GildedRoseTests {
    
    Item items[];
    int iterationCount = 2;
    
    @Before
    public void setUp() {
        items = new Item[] {new Item("Aged Brie", 40, 10), 
            new Item("Sulfuras, Hand of Ragnaros", 40, 10), 
            new Item("Backstage passes to a TAFKAL80ETC concert", 40, 10)};
    }
    
    private void setItemParams(int itemNum, int quality, int sellIn){
        items[itemNum].setQuality(quality);
        items[itemNum].setSellIn(sellIn);
    }
    
    private void typeChanges(){
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        for(int i=0;i<items.length;i++){
            System.out.println(items[i].getName()+" : "+items[i].getQuality()+" : "+items[i].getSellIn());
        }
    }
    
    /*@Test
    public void iterationOne(){
        GildedRose gR = new GildedRose(items);        
        for(int i=0;i<iterationCount;i++){
            gR.updateQuality();
        }
        for(int i=0;i<items.length;i++){
            System.out.println(items[i].getName()+" : "+items[i].getQuality()+" : "+items[i].getSellIn());
        }
        //gR.getItems();
    }*/
    
    @Test
    public void qulityMore50_sellInLess11(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,55,9);
        }
        System.out.println("qulityMore50_sellInLess11:");
        typeChanges();
    }
    
    @Test
    public void qulityLess50_sellInLess11(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,45,9);
        }
        System.out.println("qulityMore50_sellInLess11:");
        typeChanges();
    }
    
    @Test
    public void qulityMore50_sellInMore11(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,55,13);
        }
        System.out.println("qulityMore50_sellInLess11:");
        typeChanges();
    }
    
    @Test
    public void qulityLess50_sellInMore11(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,45,13);
        }
        System.out.println("qulityMore50_sellInLess11:");
        typeChanges();
    }
    
}
