import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest2 {

    @Test
    public void sum() {
        Animals animals = new Animals();
        int actual = animals.sum(12);
        int expected = 78;
        assertEquals(expected,actual);
    }
}