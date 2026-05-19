package Day2;

/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Course
 ** @brief: If Statement Assignment
/** ==============================================**/

public class IfElse {
    public static void main(String[] args) {

        int age = 20;
        int degree = 78;
        int salary = 4000;
        boolean hasJob = true;

        System.out.println("Values:");
        System.out.println("age = " + age);
        System.out.println("degree = " + degree);
        System.out.println("salary = " + salary);
        System.out.println("hasJob = " + hasJob);

        // if statement
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // if-else statement
        if (hasJob) {
            System.out.println("You have a job.");
        } else {
            System.out.println("You do not have a job.");
        }

        // if-else if-else statement
        if (degree >= 90) {
            System.out.println("Grade: Excellent");
        } else if (degree >= 75) {
            System.out.println("Grade: Very Good");
        } else if (degree >= 60) {
            System.out.println("Grade: Good");
        } else {
            System.out.println("Grade: Fail");
        }

        // Multiple conditions with if
        if (age >= 18 && salary >= 3000) {
            System.out.println("You can apply for this offer.");
        }

        if (age < 18 || salary < 3000) {
            System.out.println("You do not meet one of the conditions.");
        }

        // ternary operators
        String ageResult = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age result: " + ageResult);

        String jobResult = hasJob ? "Employed" : "Unemployed";
        System.out.println("Job result: " + jobResult);

        String markResult = (degree >= 50) ? "Pass" : "Fail";
        System.out.println("Mark result: " + markResult);

        String salaryResult = (salary >= 5000) ? "High salary" : "Low salary";
        System.out.println("Salary result: " + salaryResult);
    }
}