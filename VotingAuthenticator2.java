import java.util.Scanner;

public class VotingAuthenticator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking for the users age -------->
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Checking voting eligibility using ternary operator->
        String result = (age >= 18) ? "You are eligible to vote." : (age <0) ? "Invalid age!" : "You are not eligible to vote. You need to wait " + (18 - age) + " more years.";
        
        System.out.println(result);
        
        scanner.close();
    }
}