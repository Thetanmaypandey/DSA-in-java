import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking number input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Checking if the number is prime
       
        boolean isPrime = (number > 1);
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        // Displaying the result
        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
        
        scanner.close();
    }
}
