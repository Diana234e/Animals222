import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest1 {

    @Test
        public void sum() throws Exception{
            Animals animals = new Animals();
            int actual = animals.sum(8);
            int expected = 36;
            assertEquals(expected,actual);
    }
}