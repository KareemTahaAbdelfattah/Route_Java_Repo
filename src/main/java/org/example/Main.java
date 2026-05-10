package org.example;

public class Main {
    public static void main(String[] args) {
        /** ========================================**
         ** @Author: Kareem Taha Abd El-Fatah
         ** @Category: Route Assessment
         ** @brief: Every Session Java Code Assessment
        /** ========================================**/

        // DataTypes and Variables naming with declaration and definition
        int num = 5;
        long n = 500000L;
        char b = 'K';
        float number = 1998.016F;
        double number_2 = 199891498.016F;
        boolean bool = true;
        String name = "Kareem Taha";

        // Output in the Console for Local Variables
        System.out.print("Hello and welcome!\n");
        System.out.println("Num = " + num);
        System.out.println("n = " + n);
        System.out.printf("My Name is: %s%n", name);
        System.out.print("Your boolean Value is :\n" + bool);
        System.out.println("My Balance is : " + number + "$");
        System.out.printf("Double number value is: %g\n", number_2);

        // Output in the Console for Local Variables
        System.out.println("My Global Boolean is: " + Kareem);
    }
    static boolean Kareem;
}