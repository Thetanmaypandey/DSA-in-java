import java.util.Scanner;

public class NumberConversion {
    public static String decimalToBinary(int number)
    {
        if(number == 0) return "0";


        String bin = "";
        while(number != 0)
        {
            bin = number % 2 + bin;
            number /=2;
        }
        return bin;
    }

    public static String decimalToHexa(int number)
    {
        if(number == 0) return "0";

        String hexaDecimal = "";
        char[] hex = {
           '0', '1', '2', '3','4','5','6','7','8','9','A','B','C','D','E','F'
        };

        while (number != 0) {
            hexaDecimal = hex[number % 16] + hexaDecimal;
            number /= 16;
        }
        return hexaDecimal;
    }

    public static String decimalToOctal(int number)
    {
        if(number == 0) return "0";

        String octal = "";
        while (number != 0) {
            octal = number % 8 + octal;
            number /= 8;
        }
        return octal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for the type conversion : ");
        int num = sc.nextInt();

        System.out.printf("%s is the Binary form of the %d\n",decimalToBinary(num),num);
        System.out.printf("%s is the Octal form of the %d\n",decimalToOctal(num),num);
        System.out.printf("%s is the Hexadecimal form of the %d\n",decimalToHexa(num),num);

        
        sc.close();



    }
}
