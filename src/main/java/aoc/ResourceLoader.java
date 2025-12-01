package aoc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

/**
 * Utility class for loading resources from the classpath.
 */
public class ResourceLoader {
    
    /**
     * Loads a resource file from the classpath as a string.
     * 
     * @param filename the name of the resource file to load
     * @return the contents of the resource file
     * @throws RuntimeException if the resource cannot be found or read
     */
    public static String loadResource(String filename) {
        try {
            InputStream inputStream = ResourceLoader.class.getClassLoader().getResourceAsStream(filename);
            if (inputStream == null) {
                throw new RuntimeException("Resource not found: " + filename);
            }
            
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
                return reader.lines().collect(Collectors.joining("\n"));
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to load resource: " + filename, e);
        }
    }
}
