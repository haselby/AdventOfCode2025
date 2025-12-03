package aoc;

/**
 * Main runner for Advent of Code 2025.
 * Change the day and part variables to run the desired solution.
 */
public class MainRunner {
    
    public static void main(String[] args) {
        // Change these values to run different days and parts
        int day = 1;
        int part = 2;
        
        try {
            // Load the input file for the specified day
            String inputFile = String.format("day%02d_input.txt", day);
            String input = ResourceLoader.loadResource(inputFile);
            
            // Create the solver for the specified day and part
            Solver solver = createSolver(day, part);
            
            // Solve and print the result
            String result = solver.solve(input);
            System.out.println("Day " + day + ", Part " + part + " solution:");
            System.out.println(result);
            
        } catch (Exception e) {
            System.err.println("Error running solver: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Creates a solver instance for the specified day and part.
     * 
     * @param day the day number (1-25)
     * @param part the part number (1 or 2)
     * @return the solver instance
     * @throws Exception if the solver cannot be created
     */
    private static Solver createSolver(int day, int part) throws Exception {
        String className = String.format("aoc.day%02d.Part%dSolver", day, part);
        Class<?> solverClass = Class.forName(className);
        return (Solver) solverClass.getDeclaredConstructor().newInstance();
    }
}
