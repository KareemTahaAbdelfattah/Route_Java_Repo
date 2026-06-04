package Day4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        /** ========================================**
         ** @Author: Kareem Taha Abd El-Fattah
         ** @Category: Route Assessment
         ** @brief: Every Session Java Code Assessment
        /** ========================================**/
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you full name: ");
        String fullName = input.nextLine();

        boolean Letter_Found = false;

        for (int i = 0; i < fullName.length(); i++) {
            char currentLetter = fullName.charAt(i);

            if (currentLetter == 'A' || currentLetter == 'a') {
                Letter_Found = true;
                break;
            }
        }
        if (Letter_Found)
            System.out.println("This name contain Letter A or a");
        else
            System.out.println("This name doesn't contain Letter A or a");
    }
}