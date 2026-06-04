package Day3;

import java.util.Scanner;

public class AddNumberDoWhile {
    public static void main(String[] args) {
        /** ========================================**
         ** @Author: Kareem Taha Abd El-Fattah
         ** @Category: Route Assessment
         ** @brief: Every Session Java Code Assessment
        /** ========================================**/
        Scanner sc = new Scanner(System.in);
        boolean flag; // false

        do {
            System.out.println("Enter first number");
            double num1 = sc.nextDouble();

            System.out.println("Enter second number");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            System.out.println("Would you like to sum other numbers? \n Write True if you want to insert another number \n if not write False");
            flag = sc.nextBoolean();

            if (flag == false) {
                System.out.println("Thank you for using this program");
            }
        } while (flag); // = true
    }
}