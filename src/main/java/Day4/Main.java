package Day4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** ========================================**
         ** @Author: Kareem Taha Abd El-Fattah
         ** @Category: Route Assessment
         ** @brief: Every Session Java Code Assessment
        /** ========================================**/
        Scanner input = new Scanner(System.in);
        Rectangle r = new Rectangle();
        //double x = Rectangle.calculateArea();
        r.setWidth(6.5);
        r.setLength(7);

        double areaOfRoom1 = r.CalculatedArea();
        System.out.println("Area of Room 1 is: " + areaOfRoom1);

        Rectangle r2 = new Rectangle();
        r2.setLength(10.5);
        r2.setWidth(10.5);

        double areaOfRoom2 = r2.CalculatedArea();
        System.out.println("The area of Room 2 is: " + areaOfRoom2);

        System.out.println("______________________________");
        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("The total space of room 1 and room 2 is: " + totalArea);
    }
}