package convTest;

import converter.FahrenheitToCelcius;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class FahrenheitToCelciusTest {

    @Test
    public void fTo0() {
        // Arrange
        FahrenheitToCelcius f = new FahrenheitToCelcius();
        // Act
        float result = f.f2C(32);
        // Assert
        assertEquals(0,result,0.01);
    }
    @Test
    public void fTO1() {
        // Arrange
        FahrenheitToCelcius f = new FahrenheitToCelcius();
        // Act
        float result = f.f2C(33.8f);
        // Assert
        assertEquals(1,result,0.01);
    }
    @Test
    public void fTO056() {
        // Arrange
        FahrenheitToCelcius f = new FahrenheitToCelcius();
        // Act
        float result = f.f2C(33f);
        // Assert
        assertEquals(0.56,result,0.01);
    }

    @Test
    public void f20ToMinu6() {
        // Arrange
        FahrenheitToCelcius f = new FahrenheitToCelcius();
        // Act
        float result = f.f2C(20);
        // Assert
        assertEquals(-6.67,result,0.01);
    }

}
