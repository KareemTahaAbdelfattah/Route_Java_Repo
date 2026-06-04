package Day3;

import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args) {
        /** ========================================**
         ** @Author: Kareem Taha Abd El-Fattah
         ** @Category: Route Assessment
         ** @brief: Every Session Java Code Assessment
        /** ========================================**/

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day number: ");
        int dayNum = sc.nextInt();

        if (dayNum == 1)
            System.out.println("Monday");
        else if (dayNum == 2)
            System.out.println("Tuesday");
        else if (dayNum == 3)
            System.out.println("Wednesday");
        else if (dayNum == 4)
            System.out.println("Thursday");
        else if (dayNum == 5)
            System.out.println("Friday");
        else if (dayNum == 6)
            System.out.println("Saturday");
        else if (dayNum == 7)
            System.out.println("Sunday");
        else
            System.out.println("Invalid input. Please enter a number from 1 to 7");

        System.out.println("Enter the day Name: ");
        String dayName = sc.nextLine();

        switch (dayName) {
            case "Monday":
                System.out.println(1);
                break;
            case "Tuesday":
                System.out.println(2);
                break;
            case "Wednesday":
                System.out.println(3);
                break;
            case "Thursday":
                System.out.println(4);
                break;
            case "Friday":
                System.out.println(5);
                break;
            case "Saturday":
                System.out.println(6);
                break;
            case "Sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("Invalid input. Please enter a valid day name.");
        }
    }
}