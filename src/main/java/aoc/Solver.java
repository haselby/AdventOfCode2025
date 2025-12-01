package aoc;

/**
 * Interface for solving Advent of Code puzzle parts.
 * Implementations should handle all errors internally and return error messages as strings.
 */
public interface Solver {
    /**
     * Solves the puzzle with the given input.
     * 
     * @param input the puzzle input as a string
     * @return the solution as a string, or an error message if solving fails
     */
    String solve(String input);
}
