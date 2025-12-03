package aoc.day01;

import aoc.Solver;
import java.util.List;

/**
 * Solver for Day 1, Part 1 of Advent of Code 2025.
 */
public class Part1Solver implements Solver {
    
    @Override
    public String solve(String input) {
        try {
            //Solution for Day 1, Part 1
            List<String> sequenceOfRotations = input.lines().toList();

            CombinationLock safe = new CombinationLock(50);
            for (String rotation : sequenceOfRotations) {
                safe.rotate(rotation);
            }

            int answer = safe.getPreciselyZeroCounter();

            return String.valueOf(answer);

        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
