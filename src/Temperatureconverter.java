import java.util.Scanner;

public class Temperatureconverter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Welcome
        System.out.println("Welcome to the Temperature Converter!");

        // Prompt user to enter the unit of the temperature
        System.out.print("Enter the unit (C for Celsius, F for Fahrenheit): ");
        String unit = scanner.next();

        // Prompt user to enter a temp value
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();


        // Check which conversion based on the unit picked
        if (unit.equalsIgnoreCase("C")) {
            // Convert C to F
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("%.1f°C is equal to %.1f°F%n", temperature, fahrenheit);
        } else if (unit.equalsIgnoreCase("F")) {
            // Convert F to C
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.1f°F is equal to %.1f°C%n", temperature, celsius);
        } else {
            // Handle invalid unit input
            System.out.println("Invalid unit entered. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }

        // Close the scanner
        scanner.close();
    }

}
