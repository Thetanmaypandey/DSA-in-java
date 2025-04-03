import java.util.Scanner;


public class ReverseOfInteger2 {
    public static int reverseInt(int num)
    {
        int reversed = 0;
        while(num != 0)
        {
            int digit = num % 10 ;
            reversed = reversed * 10 + digit ;
            num /= 10;
        }
        return reversed;
    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number :");
        int number = scanner.nextInt();

        int reverse = reverseInt(number);
        System.out.printf("%d is the reverse of the %d \n",reverse,number);
    }
    
}
