import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user for Principal amount
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter Rate of interest (per annum): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();
        
        // Calculating Simple Interest with the formula p*r*t/100
        double simpleInterest = (principal * rate * time) / 100;
        
        // Displaying the result---->
        System.out.println("Simple Interest: " + simpleInterest);
        
        scanner.close();
    }
}