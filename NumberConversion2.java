import java.util.Scanner;

public class NumberConversion2 {
    public static int fromOctalToDecimal(String octal) {
        int deci = 0;
        int power = 0;
        int length = octal.length();
        for (int i = 1; i <= length; i++) {
            char bit = octal.charAt(length - i);

            if (bit < '0' || bit > '7') {
                System.out.println("invalid Octal String");
                return 0;
            }

            deci += (int) (bit - '0') * Math.pow(8, power++);

        }
        return deci;
    }

    public static int fromHexadecimalToDecimal(String hex) {
        int deci = 0;
        int length = hex.length();
        int power = 0;
        for (int i = 1; i <= length; i++) {
            char bit = hex.charAt(length - i);
            if (bit >= '0' && bit <= '9')
                deci += (bit - '0') * Math.pow(16, power++);

            else if (bit >= 'A' && bit <= 'F')
                deci += (10 + (bit - 'A')) * Math.pow(16, power++);
            else {
                System.out.println("Invalid Hexadecimal input");
                return 0;
            }

        }
        return deci;
    }

    public static int fromBinaryToDecimal(String binary) {
        int deci = 0;
        int length = binary.length();
        int power = 0;

        for (int i = 1; i <= length; i++) {
            char bit = binary.charAt(length - i);
            if (bit == '1')
                deci += Math.pow(2, power++);

            else if (bit == '0')
                power++;
            else {
                System.out.println("Invalid Binary String !!");
                return 0;
            }

        }
        return deci;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the Number System from which you wanna convert it in Decimal :");
        System.out.println("PRESS --> 1 :For Octal");
        System.out.println("PRESS --> 2 :For Binary");
        System.out.println("PRESS --> 3 :For Hexadecimal");

        System.out.print("Enter your choice here :--> ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the Octal String : ");
                String octal = sc.next();
                System.out.println(fromOctalToDecimal(octal) + " is the Decimal form of the " + octal);
                break;
            case 2:
                System.out.print("Enter the Binary String : ");
                String binary = sc.next();
                System.out.println(fromBinaryToDecimal(binary) + " is the Decimal form of the " + binary);
                break;
            case 3:
                System.out.print("Enter the Hexadecimal String : ");
                String hexadecimal = sc.next().toUpperCase();
                System.out.println(fromHexadecimalToDecimal(hexadecimal) + " is the Decimal form of the " + hexadecimal);
                break;
            default:
                System.out.println("Invalid Input !!");
        }
        sc.close();

    }
}
