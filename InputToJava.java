import java.util.Scanner;
public class InputToJava
{
public static void main(String args[])
{

     // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Integer input
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Float input
        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        // Double input
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        // Character input
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);

        // Boolean input
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = scanner.nextBoolean();

        // String input
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();

        // Displaying values
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Character: " + charValue);
        System.out.println("Boolean: " + boolValue);
        System.out.println("String: " + stringValue);

        // Close scanner
        scanner.close();

}
}