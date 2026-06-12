package oopProject.shcoolManagementSystem;

public class Person {
    /** ========================================**
     ** @Author: Kareem Taha Abd El-Fattah
     ** @Category: Route Assessment
     ** @brief: Every Session Java Code Assessment
    /** ========================================**/
    protected String name;

    public Person(String name){
        this.name = name;
    }

    public void introduce(){
        System.out.println("Hello my name's: " + name);
    }
}
