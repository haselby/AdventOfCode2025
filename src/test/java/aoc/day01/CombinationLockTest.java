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
}
