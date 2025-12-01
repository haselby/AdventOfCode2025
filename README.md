# Advent of Code 2025

Solutions for [Advent of Code 2025](https://adventofcode.com/2025) implemented in Java 25 with Gradle 9.2.1.

## Project Structure

```
AdventOfCode2025/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── aoc/
│   │   │       ├── Solver.java              # Common interface for all solvers
│   │   │       ├── ResourceLoader.java      # Utility for loading resource files
│   │   │       ├── MainRunner.java          # Main entry point (update day/part here)
│   │   │       ├── day01/
│   │   │       │   ├── Part1Solver.java
│   │   │       │   ├── Part2Solver.java
│   │   │       │   └── InputParser.java
│   │   │       ├── day02/
│   │   │       │   ├── Part1Solver.java
│   │   │       │   ├── Part2Solver.java
│   │   │       │   └── InputParser.java
│   │   │       └── ...
│   │   └── resources/
│   │       ├── day01_input.txt
│   │       ├── day02_input.txt
│   │       └── ...
│   └── test/
│       ├── java/
│       │   └── aoc/
│       │       ├── day01/
│       │       │   ├── Part1SolverTest.java
│       │       │   └── Part2SolverTest.java
│       │       ├── day02/
│       │       │   ├── Part1SolverTest.java
│       │       │   └── Part2SolverTest.java
│       │       └── ...
│       └── resources/
│           ├── day01_example.txt
│           ├── day02_example.txt
│           └── ...
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## Prerequisites

- Java 25 (configured via Gradle toolchain)
- Gradle 9.2.1 (included via Gradle wrapper)

## Setup

1. Clone the repository:
   ```powershell
   git clone https://github.com/haselby/AdventOfCode2025.git
   cd AdventOfCode2025
   ```

2. The Gradle wrapper is included, so no additional installation is needed.

## Building

Build the project:
```powershell
./gradlew build
```

## Running Tests

Run all tests:
```powershell
./gradlew test
```

Run tests for a specific day:
```powershell
./gradlew test --tests "aoc.day01.*"
```

## Running Solutions

1. **Update the day and part** in `src/main/java/aoc/MainRunner.java`:
   ```java
   int day = 1;   // Change to the day you want to run
   int part = 1;  // Change to 1 or 2 for the part
   ```

2. **Add your puzzle input** to the corresponding file in `src/main/resources/`:
   - `day01_input.txt` for Day 1
   - `day02_input.txt` for Day 2
   - etc.

3. **Run the solution**:
   ```powershell
   ./gradlew run
   ```

## Workflow for Each Day

1. **Get the puzzle**: Visit https://adventofcode.com/2025/day/N
2. **Add your input**: Paste your puzzle input into `src/main/resources/dayNN_input.txt`
3. **Add example input**: Paste the example from the puzzle into `src/test/resources/dayNN_example.txt`
4. **Implement the solution**:
   - Edit `src/main/java/aoc/dayNN/Part1Solver.java` for Part 1
   - Edit `src/main/java/aoc/dayNN/Part2Solver.java` for Part 2
   - Use `InputParser.java` for shared parsing logic
5. **Test your solution**: Update tests in `src/test/java/aoc/dayNN/` with expected results
6. **Run**: Update `MainRunner.java` and execute `./gradlew run`

## Adding New Days

To add a new day (e.g., Day 3):

1. Create the package structure:
   ```
   src/main/java/aoc/day03/
   src/test/java/aoc/day03/
   ```

2. Create the solver classes:
   - `Part1Solver.java` (implementing `Solver` interface)
   - `Part2Solver.java` (implementing `Solver` interface)
   - `InputParser.java` (utility methods for parsing)

3. Create test classes:
   - `Part1SolverTest.java`
   - `Part2SolverTest.java`

4. Add resource files:
   - `src/main/resources/day03_input.txt`
   - `src/test/resources/day03_example.txt`

## License

See [LICENSE](LICENSE) file for details.
