package aoc.day02;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for parsing input for Day 2.
 */
public class InputParser {
    
    /**
     * Parses the input into lines.
     * 
     * @param input the raw input string
     * @return a list of lines
     */
    public static List<String> parseLines(String input) {
        List<String> lines = new ArrayList<>();
        for (String line : input.split("\n")) {
            String trimmed = line.trim();
            if (!trimmed.isEmpty()) {
                lines.add(trimmed);
            }
        }
        return lines;
    }
    
    // Add more parsing methods as needed for Day 2
}
