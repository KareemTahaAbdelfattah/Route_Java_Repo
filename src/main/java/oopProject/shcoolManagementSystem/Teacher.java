package oopProject.shcoolManagementSystem;

public class Teacher extends Person{
    /** ========================================**
     ** @Author: Kareem Taha Abd El-Fattah
     ** @Category: Route Assessment
     ** @brief: Every Session Java Code Assessment
    /** ========================================**/
    private String subject;

    public Teacher(String name, String subject)
    {
        super(name);
        this.subject = subject;
    }

    @Override
    public void introduce()
    {
        System.out.println("Hello, my name is " + name + " and I teach " + subject + ".");
    }
}
