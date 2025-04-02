import java.util.Scanner;

public class VotingAuthenticator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking age input from the user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Checking voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            if(age < 0)
            System.out.println("Invalid Age!");

            else
            System.out.println("You are not eligible to vote. You need to wait " + (18 - age) + " more years.");
        }
        
        scanner.close();
    }
}