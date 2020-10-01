package towKatas;

import kataStringConverter.kataStringConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class twoKatasString {

    @Test
    public void testToLowercase() {
        // Arrange
        kataStringConverter kata = new kataStringConverter();
        // Act
        String result = kata.kataToLowerCase();
        // Assert
        assertEquals("abc",result);
    }

    @Test
    public void testToUpperCase() {
        // Arrange
        kataStringConverter kata = new kataStringConverter();
        // Act
        String result = kata.kataToUpperCase();
        // Assert
        assertEquals("ABC",result);
    }

    @Test
    public void test() {
        // Arrange
        kataStringConverter kata = new kataStringConverter();
        // Act
        String result = kata.kataReverse();
        // Assert
        assertEquals("cBa",result);
    }


}
