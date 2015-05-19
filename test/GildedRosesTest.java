/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.gildedrose.Item;
import com.gildedrose.GildedRose;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author RAVLYK
 */
public class GildedRosesTest {
    
    Item items[];
    
    @Before
    public void setUp() {
        items = new Item[] {new Item("Aged Brie", 100, 10), new Item("Sulfuras, Hand of Ragnaros", 100, 10), new Item("Backstage passes to a TAFKAL80ETC concert", 100, 10)};
    }
    
    @Test
    public void iterationOne(){
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        for(int i=0;i<items.length;i++){
            System.out.println(items[i].getName()+" - "+items[i].getQuality()+" - "+items[i].getSellIn());
        }
        //gR.getItems();
    }
    
}
