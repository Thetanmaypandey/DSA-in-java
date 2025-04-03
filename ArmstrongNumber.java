import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num)
    {
        int digits = 0;
        int temp = num;
        //Counting the total number of digits in num
        while(temp != 0)
        {
            digits++;
            temp /=10;
        }
        temp = num;
        // Now applying the logic of the armstrong numbers i.e.  the sum of its digits raised to the power of the number of digits is equal to the number itself.
        int sum = 0;
        while(temp != 0)
        {
            int currentDigit = temp % 10 ;
            sum += Math.pow(currentDigit,digits);
            temp /= 10;
        }
        return (sum == num) ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be checked :");
        int number = sc.nextInt();

        if(isArmstrong(number)) 
          System.out.printf("%d is an Armstrong number\n",number);
        else
        System.out.printf("%d is not an Armstrong number\n",number);
        

    }
    
}
