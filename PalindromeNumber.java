import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int num)
    {
        int numCopy = num;

        // reversing the number num----------------->
        int numReversed = 0;
        while(numCopy != 0)
        {
            numReversed = numReversed*10 + numCopy %10;
            numCopy /= 10;

        }
        return (num == numReversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        int number = sc.nextInt();

        if(isPalindrome(number))
            System.out.printf("%d is a palindrome\n",number);

        else
        System.out.printf("%d is not a palindrome\n",number);
    }
    
}
