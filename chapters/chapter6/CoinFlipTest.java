package chapters.chapter6;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class CoinFlipTest {

        Random rand = new Random(1);
        CoinFlip game = new CoinFlip(rand);
        Coin coin = game.flipCoin();

    @Test
    public void returnsACoin(){
        assertNotNull(coin);
    }

    @Test
    public void coinValueIsHeads(){
        assertEquals("Heads", coin.getValue());
    }

    @Test
    public void gettingHeadsThreeTimesInARowResultsInGameOver(){
       assertEquals("It took 9 flips to get 3 consecutive Heads", game.flipGame());
    }
}
