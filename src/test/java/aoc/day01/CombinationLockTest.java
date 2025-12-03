package aoc.day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for CombinationLock.
 */
class CombinationLockTest {
    
    @Test
    void testPreciselyZeroCounterInitiallyZero() {
        CombinationLock lock = new CombinationLock(0);
        assertEquals(0, lock.getPreciselyZeroCounter());
    }
    
    @Test
    void testRotateLeft68FromPosition50() {
        CombinationLock lock = new CombinationLock(50);
        lock.rotate("L68");
        assertEquals(82, lock.getCurrentDialPosition());
    }

    @Test
    void testPreciselyZeroCounterAfterMultipleRotations() {
        CombinationLock lock = new CombinationLock(50);
        lock.rotate("L68");
        lock.rotate("L30");
        lock.rotate("R48");
        lock.rotate("L5");
        lock.rotate("R60");
        lock.rotate("L55");
        lock.rotate("L1");
        lock.rotate("L99");
        lock.rotate("R14");
        lock.rotate("L82");
        assertEquals(3, lock.getPreciselyZeroCounter());
    }
}
