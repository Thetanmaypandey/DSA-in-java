import java.util.Scanner;

public class PerfectNumber {
    public static boolean isPerfect(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 0;
        // What is a perfect number ? a number is said to be perfect number if summation of all its divisors equals to itself like 6 = 1+2+3
        // Checking the condition for the perfect number----------->
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPerfect(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }
    }
}
