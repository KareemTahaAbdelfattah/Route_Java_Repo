package oopProject.shcoolManagementSystem;

public class Student {
    /** ========================================**
     ** @Author: Kareem Taha Abd El-Fattah
     ** @Category: Route Assessment
     ** @brief: Every Session Java Code Assessment
    /** ========================================**/

    private String firstName;
    private String lastName;
    private int grade;

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade)
    {
        if (grade >= 1 && grade <= 100)
        {
            this.grade = grade;
        }
        else
        {
            System.out.println("Grade must be between 1 and 100.");
        }
    }


}
