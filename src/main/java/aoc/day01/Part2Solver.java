package aoc.day01;

import java.util.List;

import aoc.Solver;

/**
 * Solver for Day 1, Part 2 of Advent of Code 2025.
 */
public class Part2Solver implements Solver {
    
    @Override
    public String solve(String input) {
        try {
            //Solution for Day 1, Part 2

            List<String> sequenceOfRotations = input.lines().toList();

            CombinationLock safe = new CombinationLock(50);
            for (String rotation : sequenceOfRotations) {
                safe.rotate(rotation);
            }

            int answer = safe.getPreciselyZeroCounter() + safe.getClickThruZeroCounter();

            return String.valueOf(answer);
            
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
