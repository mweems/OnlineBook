import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CountDigitsTest {

    CountDigits count = new CountDigits();

    @Test
    public void returnOneWhenPassedASingleDigit(){
        assertEquals(1, count.count(1));
    }

    @Test
    public void returnTwoWhenPassedTwoDigits(){
        assertEquals(2, count.count(21));
    }
}
