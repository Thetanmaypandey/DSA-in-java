import java.util.Scanner;

public class PercentageEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter total marks: ");
        double totalMarks = scanner.nextDouble();
        
        System.out.print("Enter obtained marks: ");
        double obtainedMarks = scanner.nextDouble();
        
        // Calculating percentage
        double percentage = (obtainedMarks / totalMarks) * 100;
        
        // Displaying the calculated percentage------------>
        System.out.println("Percentage: " + percentage + "%");
        
        scanner.close();
    }
}