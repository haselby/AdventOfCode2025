package aoc.day01;

import aoc.ResourceLoader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Day 1, Part 2 solver.
 */
class Part2SolverTest {
    
    @Test
    void testWithExampleInput() {
        // Load example input from resources
        String input = ResourceLoader.loadResource("day01_example.txt");
        
        Part2Solver solver = new Part2Solver();
        String result = solver.solve(input);
        
        // TODO: Update with expected result once puzzle is available
        assertNotNull(result);
        assertFalse(result.startsWith("Error:"), "Solver should not return an error");
    }
    
    @Test
    void testWithEmptyInput() {
        Part2Solver solver = new Part2Solver();
        String result = solver.solve("");
        
        assertNotNull(result);
    }
}
