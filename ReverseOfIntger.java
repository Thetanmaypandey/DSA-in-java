import java.util.Scanner;

public class ReverseOfIntger {
    public static int reverseInteger(int num)
    {
        String result ="";
        while(num != 0)
        {
            result += num % 10;
            num /= 10;
        }
        return Integer.parseInt(result); 
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value : ");// taking the input from the user to reverse the number
        int num = sc.nextInt();
        

        int res = reverseInteger(num);
        System.out.printf("%d is the reverse of the %d \n",res,num);

        /*
         * This program will definitely reverse the given integer :)
         * But , in the case of the 0000234 or similar numbers which star from multiple 0s 
         * This program will output something different from its reverse :( 
         */

        
    }
    
}
