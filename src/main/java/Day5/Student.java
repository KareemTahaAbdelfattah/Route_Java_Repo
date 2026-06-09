package Day5;

public class Student {
    /** ========================================**
     ** @Author: Kareem Taha Abd El-Fattah
     ** @Category: Route Assessment
     ** @brief: Every Session Java Code Assessment
    /** ========================================**/

    private String name;
    private int grade;

    public Student(String name, int grade){
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100, Will set to 0");
            this.grade = 0;
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGrade(int grade){
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100.");
        }
    }

    public int getGrade(){
        return grade;
    }
}