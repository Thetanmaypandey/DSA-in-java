import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking Temperature input from user in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Converting to different Temperature scales
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        double rankine = (celsius + 273.15) * 9/5;
        
        // Displaying the results in various Temperature scales
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Temperature in Kelvin: " + kelvin + "K");
        System.out.println("Temperature in Rankine: " + rankine + "°R");
        
        scanner.close();
    }
}