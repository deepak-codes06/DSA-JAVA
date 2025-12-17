

package in.kgcoding.challange87;

import java.util.Scanner;


public class CalculatorForExceptionHnadling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number:");
        int first = input.nextInt();
        System.out.println("enter the second number:");
        int second = input.nextInt();

        try {
            int sum = first / second;
            System.out.printf("your result is %d ",sum);
        } catch (ArithmeticException e) {
            if (e.getMessage().equals("/ by zero")) {
                System.out.println("Arithmetic Exception occured , due to divided by zero,,,Enter currect numbers!!!");

            }else{
                throw e;
            }

        }


    }


}
