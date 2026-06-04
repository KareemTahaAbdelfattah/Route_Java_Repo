package Day4;

import java.util.Scanner;

public class StudentAverageGrades {
    public static void main(String[] args) {
        /** ========================================**
         ** @Author: Kareem Taha Abd El-Fattah
         ** @Category: Route Assessment
         ** @brief: Every Session Java Code Assessment
        /** ========================================**/

        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            double sum = 0;

            System.out.println("Enter grades for student " + student + ":");

            for (int grade = 1; grade <= 4; grade++) {
                System.out.print("Enter grade " + grade + ": ");
                sum += input.nextDouble();
            }

            double average = sum / 4.0;
            System.out.println("Average degree for student " + student + " = " + average);
            System.out.println();
        }
        input.close();
    }
}