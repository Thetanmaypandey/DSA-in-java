import java.util.Scanner;

public class PerfectNumbersInRange {
    public static void isPerfect(int start , int end) {
        int count = 0;
        
        System.out.printf(" The Perfect Numbers between %d and %d is given below \n",start,end);
        for(int j = start ; j <= end ; j++)
           { 
             if (j < 1)
              {
                System.out.println(" A negative number cannot be a perfect number.");
              }
   
             int sum = 0;
             // What is a perfect number ? a number is said to be perfect number if summation of all its divisors equals to itself like 6 = 1+2+3
             // Checking the condition for the perfect number----------->
             for(int i = 1; i <= j / 2; i++) 
                {
                  if (j % i == 0) 
                  {
                  sum += i;
                  }
                }

            if (sum == j)
              {
                 System.out.println(j);
                 count++;
              }
        
            }
        if(count == 1) System.out.printf("There is only %d Perfect Number  between %d and %d\n",count,start,end);
        else
        System.out.printf("There are only %d Perfect Numbers between %d and %d \n",count,start,end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from where the range starts: ");
        int start = scanner.nextInt();
        
        
        System.out.print("Enter a number from where the range ends: ");
        int end = scanner.nextInt();

        scanner.close();

        isPerfect(start,end); //function call 

       
    }
}
