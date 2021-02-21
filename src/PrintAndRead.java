import java.util.Scanner;

public class PrintAndRead {
    private static int printAndRead(String string) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(string);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int a = printAndRead("Enter the first number:");
        System.out.println("You entered the number: " + a);

        System.out.println();

        int b = printAndRead("Enter the second number:");
        System.out.println("You entered the number: " + b);

        System.out.println();

        int c = printAndRead("Enter the third number:");
        System.out.println("You entered the number: " + c);
    }
}
