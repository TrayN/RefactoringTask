
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
    
    private Item sulfuras, aged, backstage, randomRose;
    GildedRose gR;
    int sulfurasQuality = 80;
    int quality = 80;
    int sellIn = 20;
    int iterationCount = 100;
    
    @Before
    public void setUp() {
        sulfuras = new Item(GildedRose.SULFURAS, sellIn, sulfurasQuality);
        aged = new Item(GildedRose.AGED_BRIE, sellIn, quality);
        backstage = new Item(GildedRose.BACKSTAGE, sellIn, quality);
        randomRose = new Item("RadnomRose", sellIn, quality);
    }
    
    @Test
    public void sulfurasTest(){
        gR = new GildedRose(new Item[] {sulfuras});
        for(int i = 0; i<iterationCount; i++){
            gR.updateQuality();
            assertEquals(sulfuras.quality, sulfurasQuality);
            assertEquals(sulfuras.sellIn, sellIn);
        }
    }
    
    @Test
    public void agedTest(){
        for(int j=0;j<60;j++){
            aged = new Item(GildedRose.AGED_BRIE, j/2, j);
            gR = new GildedRose(new Item[] {aged});
            int testQuality = aged.quality;
            for(int i = 0; i<iterationCount; i++){
                gR.updateQuality();
                assertTrue(aged.quality>=0);
                assertTrue(aged.quality<=50);
                if(testQuality<50){
                    testQuality+=1;
                    if(aged.sellIn<0){
                        if(testQuality<50){
                            testQuality+=1;
                        }
                    }
                    assertEquals(testQuality,aged.quality);
                }
            }
        }
    }
    
    @Test
    public void backstageTest(){
        for(int j=0;j<60;j++){
            backstage = new Item(GildedRose.BACKSTAGE, j/2, j);
            gR = new GildedRose(new Item[] {backstage});
            int testQuality = backstage.quality;
            for(int i = 0; i<iterationCount; i++){
                gR.updateQuality();
                assertTrue(backstage.quality>=0);
                assertTrue(backstage.quality<=50);
                if(testQuality<50){
                    testQuality+=1;
                    if(backstage.sellIn<10){
                        if(testQuality<50)
                        testQuality+=1;
                    }
                    if(backstage.sellIn<5){
                        if(testQuality<50)
                        testQuality+=1;
                    }
                    if(backstage.sellIn<0){
                        testQuality = 0;
                    }
                    assertEquals(testQuality,backstage.quality);
                }
            }
        }
    }
    
    @Test
    public void radnomRoseTest(){
        for(int j=0;j<60;j++){
            randomRose = new Item("Random Rose", j/2, j);
            gR = new GildedRose(new Item[] {randomRose});
            int testQuality = randomRose.quality;
            for(int i = 0; i<iterationCount; i++){
                gR.updateQuality();
                assertTrue(randomRose.quality>=0);
                assertTrue(randomRose.quality<=50);
                if(randomRose.quality>0){
                        testQuality-=1;
                    if(randomRose.sellIn<0){
                        testQuality-=1;
                    } 
                    assertEquals(testQuality,randomRose.quality);
                }
            }
        }
    }
    
    
    
    
}
