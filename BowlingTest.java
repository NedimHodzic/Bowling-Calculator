import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingTest {
    @Test
    void testOpenFrames() {
        int frames[][] = {{5, 1, 0, 0, 0, 0, 0, 4, 0, 1},
                {0, 3, 0, 0, 0, 0, 0, 3, 0, 1}};
        assertEquals(18, Bowling.BowlingCalculator(frames, 0, 0));
    }

    @Test
    void testSpares() {
        int frames[][] = {{5, 5, 3, 0, 0, 0, 0, 0, 0, 0},
                {5, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0}};
        assertEquals(35, Bowling.BowlingCalculator(frames, 0 ,0));
    }

    @Test
    void testStrikes() {
        int frames[][] = {{10, 10, 10, 5, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        assertEquals(75, Bowling.BowlingCalculator(frames, 0, 0));
    }

    @Test
    void testLastFrame() {
        int frames[][] = {{10, 10, 10, 5, 0, 0, 0, 0, 10, 10},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        assertEquals(105, Bowling.BowlingCalculator(frames, 0, 0));
    }

    @Test
    void testSpareAndStrikes() {
        int frames[][] = {{10, 4, 10, 0, 0, 0, 0, 0, 0, 0},
                {0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        assertEquals(50, Bowling.BowlingCalculator(frames, 0, 0));
    }

    @Test
    void testAllStrikes() {
        int frames[][] = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        assertEquals(300, Bowling.BowlingCalculator(frames, 10, 10));
    }

    @Test
    void testCommonScore() {
        int frames[][] = {{5, 4, 8, 10, 0, 10, 6, 10, 4, 10},
                {5, 5, 2, 0, 10, 0, 2, 0, 6, 0}};
        assertEquals(169, Bowling.BowlingCalculator(frames, 10, 0));
    }
}