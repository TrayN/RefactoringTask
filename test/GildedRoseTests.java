
import com.gildedrose.Item;
import com.gildedrose.GildedRose;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author RAVLYK
 */
public class GildedRoseTests {
    
    private Item items[];
    
    @Before
    public void setUp() {
        items = new Item[] {new Item(GildedRose.AGED_BRIE, 40, 10), 
            new Item(GildedRose.SULFURAS, 40, 10), 
            new Item(GildedRose.BACKSTAGE, 40, 10)};
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
    
    private void assertItem(int itemNum, int quality, int sellIn){
        assertEquals(items[itemNum].getQuality(),quality);
        assertEquals(items[itemNum].getSellIn(),sellIn);
    }
    
    /*
    quality      <0;0<50;>50
    sellIn      <0;<6;<11;>11
    */
    
    @Test
    public void qualityMinus2_sellInMinus2(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,-2,-2);
        }
        //typeChanges();
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        
        assertItem(0,0,-3);
        assertItem(1,-2,-2);
        assertItem(2,0,-3);
    }
    
    @Test
    public void qualityMinus2_sellIn5(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,-2,5);
        }
        //typeChanges();
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        
        assertItem(0,-1,4);
        assertItem(1,-2,5);
        assertItem(2,1,4);
    }
    
    @Test
    public void qualityMinus2_sellIn9(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,-2,9);
        }
        //typeChanges();
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        
        assertItem(0,-1,8);
        assertItem(1,-2,9);
        assertItem(2,0,8);
    }
    
    @Test
    public void qualityMinus2_sellIn12(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,-2,12);
        }
        //typeChanges();
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        
        assertItem(0,-1,11);
        assertItem(1,-2,12);
        assertItem(2,-1,11);
    }
    
    @Test
    public void quality25_sellInMinus2(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,25,-2);
        }
        //typeChanges();
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        
        assertItem(0,27,-3);
        assertItem(1,25,-2);
        assertItem(2,0,-3);
    }
    
    @Test
    public void quality25_sellIn5(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,25,5);
        }
        //typeChanges();
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        
        assertItem(0,26,4);
        assertItem(1,25,5);
        assertItem(2,28,4);
    }
    
    @Test
    public void quality25_sellIn9(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,25,9);
        }
        //typeChanges();
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        
        assertItem(0,26,8);
        assertItem(1,25,9);
        assertItem(2,27,8);
    }
    
    @Test
    public void quality25_sellIn12(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,25,12);
        }
        //typeChanges();
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        
        assertItem(0,26,11);
        assertItem(1,25,12);
        assertItem(2,26,11);
    }
    
    @Test
    public void quality60_sellInMinus2(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,60,-2);
        }
        //typeChanges();
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        
        assertItem(0,60,-3);
        assertItem(1,60,-2);
        assertItem(2,0,-3);
    }
    
    @Test
    public void quality60_sellIn5(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,60,5);
        }
        //typeChanges();
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        
        assertItem(0,60,4);
        assertItem(1,60,5);
        assertItem(2,60,4);
    }
    
    @Test
    public void quality60_sellIn9(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,60,9);
        }
        //typeChanges();
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        
        assertItem(0,60,8);
        assertItem(1,60,9);
        assertItem(2,60,8);
    }
    
    @Test
    public void quality60_sellIn12(){
        for(int i=0; i< items.length; i++){
            setItemParams(i,60,12);
        }
        //typeChanges();
        GildedRose gR = new GildedRose(items);
        gR.updateQuality();
        
        assertItem(0,60,11);
        assertItem(1,60,12);
        assertItem(2,60,11);
    }
    
    
}
