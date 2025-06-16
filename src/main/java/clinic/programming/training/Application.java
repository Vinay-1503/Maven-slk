package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;

public class Application {
    public void greet() {
        System.out.println("naid");
    }

    public Application() {
        System.out.println("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main(String[] args) {
        System.out.println("Starting Application");
        Application app = new Application();
        app.greet();

        String testString = "   Hello Maven!   ";

        // Check if the string is blank
        if (StringUtils.isBlank(testString)) {
            System.out.println("The string is blank.");
        } else {
            // Trim the string and print it
            System.out.println("Trimmed string: '" + StringUtils.trim(testString) + "'");
        }
    }
}