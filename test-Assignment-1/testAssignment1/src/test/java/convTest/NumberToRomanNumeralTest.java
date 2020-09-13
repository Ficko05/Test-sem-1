package convTest;

import converter.NumberToRomanNumeralConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NumberToRomanNumeralTest {

    @Test
    public void mustBeAbleToCreateConverter() {
        // Arrange
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        // Act
        String result = c.convertRun(1);

        // Assert
        assertEquals("I", result);
    }

    @Test
    public void Convert2ToII() {
        // Arrange
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        // Act
        String result = c.convertRun(2);

        // Assert
        assertEquals("II",result);
    }

    @Test
    public void Convert3ToIII() {
        // Arrange
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        // Act
        String result = c.convertRun(3);

        // Assert
        assertEquals("III",result);
    }

    @Test
    public void Convert4ToIV() {
        // Arrange
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        // Act
        String result = c.convertRun(4);

        // Assert
        assertEquals("IV",result);
    }
    @Test
    public void Convert6ToVII() {
        // Arrange
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        // Act
        String result = c.convertRun(6);

        // Assert
        assertEquals("VI",result);
    }
    @Test
    public void Convert10ToX() {
        // Arrange
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        // Act
        String result = c.convertRun(10);

        // Assert
        assertEquals("X",result);
    }
    @Test
    public void Convert12ToXII() {
        // Arrange
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        // Act
        String result = c.convertRun(12);

        // Assert
        assertEquals("XII",result);
    }
    @Test
    public void Convert27ToXXVII() {
        // Arrange
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        // Act
        String result = c.convertRun(27);

        // Assert
        assertEquals("XXVII",result);
    }
    @Test
    public void Convert80ToLXXX() {
        // Arrange
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        // Act
        String result = c.convertRun(80);

        // Assert
        assertEquals("LXXX",result);
    }
    @Test
    public void Convert86ToLXXXVI() {
        // Arrange
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        // Act
        String result = c.convertRun(86);

        // Assert
        assertEquals("LXXXVI",result);
    }
    @Test
    public void Convert99ToXCIX() {
        // Arrange
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        // Act
        String result = c.convertRun(99);

        // Assert
        assertEquals("XCIX",result);
    }
    @Test
    public void Convert888ToDCCCLXXXVIII() {
        // Arrange
        NumberToRomanNumeralConverter c = new NumberToRomanNumeralConverter();
        // Act
        String result = c.convertRun(888);

        // Assert
        assertEquals("DCCCLXXXVIII",result);
    }
}


