import java.util.Scanner;
public class NumberOfDigits
{
    public static int digitsCounter(int num)
    {
    int count = 0 ;
    while(num != 0)
        {
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String args[])
    {   
    Scanner scanner = new Scanner(System.in);


    System.out.print("Enter an integer Number : ");
    int num = scanner.nextInt();

    int  count = digitsCounter(num);

    System.out.printf("%d has %d digits\n",num,count);    

    }
}