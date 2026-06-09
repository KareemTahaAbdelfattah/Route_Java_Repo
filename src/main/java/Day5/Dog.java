package Day5;

public class Dog extends Animal{
    /** ========================================**
     ** @Author: Kareem Taha Abd El-Fattah
     ** @Category: Route Assessment
     ** @brief: Every Session Java Code Assessment
    /** ========================================**/

    public void bark(){
        System.out.println("This dog barks");
    }

    @Override //(Polymorphism)
    public void eat(){
        System.out.println("This dog eats bones");
    }
}
