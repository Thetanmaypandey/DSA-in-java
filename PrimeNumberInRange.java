import java.util.Scanner;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking range from user
        System.out.print("Enter the number from where the range begins: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the number from where the range ends: ");
        int end = scanner.nextInt();

        System.out.printf("The Prime Numbers between %d and %d is given below\n",start,end);

        int count = 0;

        for( int j = start ; j <= end ; j++)
           {
            // Checking if the number is prime
            boolean isPrime = (j > 1);
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        // Displaying the result
        // System.out.println(j + (isPrime ? " is a prime number." : " is not a prime number."));
        // System.out.println(j);
        System.out.print((isPrime ?j + "\n" :""));
        if(isPrime) count++;

        }
        System.out.printf("There are %d Prime number between %d and %d\n" ,count,start,end);

        scanner.close();
    }
}
