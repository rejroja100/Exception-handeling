package Exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int count = 1;

        do {

            try {
                int num1, num2, result;
                Scanner input = new Scanner(System.in);

                System.out.print("Enter the first number: ");
                num1 = input.nextInt();
                System.out.print("Enter the first number: ");
                num2 = input.nextInt();

                result = num1 / num2;
                System.out.println("The result of number1 / number2 = " + result);

                count++;

            } catch (Exception e) {
                System.out.println("the exception is " + e);
                System.out.println("You put a wrong input, please enter correct number.");
                System.out.println();
                System.out.println();
            }
        } while (count == 1);
    }
}
