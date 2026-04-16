import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {

    // CharacterFrequencyCounter helloCounter;
    // @BeforeTest
    // void setup() {
    //     helloCounter = new CharacterFrequencyCounter("hello");
    // }

    @Test
    void testCharacterShowsUpMultipleTimesGiveCorrectFrequency() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        // Act
        int actual = counter.getFrequency('l');
        // Assert
        assertEquals(2,actual);
    }

    @Test
    void testCharacterShowsUpOnce() {
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");

        int actual = counter.getFrequency('h');

        assertEquals(1,actual);
    }

    @Test
    void testGetRelativePercentageReturns0ForMissingCharacter() {
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");

        double actual = counter.getRelativePercentage('x');

        assertEquals(0.0,actual,0.0);
    }

    @Test
    void testGetRelativePercentageReturnsAccurate() {
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");

        double actual = counter.getRelativePercentage('l');

        assertEquals(40.0,actual,0.0001);
    }

}