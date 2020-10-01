package testBowlingGame;

import bowlingGame.Game;
import junit.framework.TestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.testng.annotations.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class bowlingGameTest extends TestCase {
    private Game g;

    protected void setUp() throws Exception {
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    private void rollStrike() {
        g.roll(10);
    }


    @Test
    public void testGutterGame() throws Exception {
        // Arrange
        // Act
        rollMany(20, 0);
        // Assert
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() throws Exception {
        // Arrange

        // Act
        rollMany(20, 1);

        // Assert
        assertEquals(20, g.score());
    }


    @Test
    public void testOneSpre() throws Exception {
        // Arrange
        // Act
        rollSpare();
        g.roll(3);
        rollMany(17, 0);
        assertEquals(16, g.score());

    }

    @Test
    public void testOneStrike() throws Exception {
        // Arrange
        // Act
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertEquals(24, g.score());
    }

    @Test
    @DisplayName("Testing for strikes")
    public void testperfectGame() {
        // Arrange

        // Act
        rollMany(12, 10);
        // Assert
        assertEquals(300, g.score());
    }

}
