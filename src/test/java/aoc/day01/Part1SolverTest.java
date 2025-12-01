package aoc.day01;

import aoc.ResourceLoader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Day 1, Part 1 solver.
 */
class Part1SolverTest {
    
    @Test
    void testWithExampleInput() {
        // Load example input from resources
        String input = ResourceLoader.loadResource("day01_example.txt");
        
        Part1Solver solver = new Part1Solver();
        String result = solver.solve(input);
        
        // TODO: Update with expected result once puzzle is available
        assertNotNull(result);
        assertFalse(result.startsWith("Error:"), "Solver should not return an error");
    }
    
    @Test
    void testWithEmptyInput() {
        Part1Solver solver = new Part1Solver();
        String result = solver.solve("");
        
        assertNotNull(result);
    }
}
