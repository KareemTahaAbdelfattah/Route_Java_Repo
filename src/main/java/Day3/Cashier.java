package Day3;

import java.util.Scanner;
public class Cashier {
    public static void main(String[] args) {
        /** ========================================**
         ** @Author: Kareem Taha Abd El-Fattah
         ** @Category: Route Assessment
         ** @brief: Every Session Java Code Assessment
        /** ========================================**/

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int quantity = sc.nextInt(); // 5

        double totalPrice = 0;

        for (int i = 1; i <= quantity; i++) // I will loop till reach 5
        {
            System.out.println("Enter the cost of the item " + i + " :"); // 5 loops
            double itemPrice = sc.nextDouble();

            totalPrice += itemPrice; // totalPrice = totalPrice + itemPrice;
        }

        System.out.println("The total price is: " + totalPrice);
    }
}
