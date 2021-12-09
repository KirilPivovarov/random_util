package ua.com.deEducation.randomizer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;


class RandomizerTest {

    private final Random random = Mockito.mock(Random.class);
    private final Randomizer randomizer = new Randomizer();

    @Test
    public void getYourRandomNumberTest() {
           Mockito.when(random.nextInt(1)).thenReturn(1);
            int from = 9;
            int to  = 9;
        Assertions.assertEquals(randomizer.getYourRandomNumber(from,to), 9);
    }

}