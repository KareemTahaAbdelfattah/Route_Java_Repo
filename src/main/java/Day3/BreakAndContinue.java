package Day3;

import java.util.Scanner;
public class BreakAndContinue {
    public static void main(String[] args) {
        /** ========================================**
         ** @Author: Kareem Taha Abd El-Fattah
         ** @Category: Route Assessment
         ** @brief: Every Session Java Code Assessment
        /** ========================================**/
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                break;

            System.out.println("Break: " + i);
        }

        System.out.println("----------------------------");

        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;

            System.out.println("Continue: " + i);
        }

        for (int i = 1; i <= 10; i--) {
            if (i == 5)
                continue;

            System.out.println("Continue: " + i);
        }
    }
}
