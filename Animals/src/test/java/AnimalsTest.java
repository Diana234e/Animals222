import static org.junit.Assert.*;

public class AnimalsTest {

    @org.junit.Test
    public void sum() throws Exception{
        Animals animals = new Animals();
        int actual = animals.sum(5);
        int expected = 15;
        assertEquals(expected,actual);



    }
}