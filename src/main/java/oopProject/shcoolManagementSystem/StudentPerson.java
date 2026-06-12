package oopProject.shcoolManagementSystem;

public class StudentPerson extends Person{
    /** ========================================**
     ** @Author: Kareem Taha Abd El-Fattah
     ** @Category: Route Assessment
     ** @brief: Every Session Java Code Assessment
    /** ========================================**/

    private int grade;

    public StudentPerson(String name, int grade)
    {
        super(name);
        this.grade = grade;
    }

    @Override
    public void introduce()
    {
        System.out.println("Hello, my name is " + name + " and I am in grade " + grade + ".");
    }
}
