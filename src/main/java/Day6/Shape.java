package Day6;

public abstract class Shape {

    /** ========================================**
     ** @Author: Kareem Taha Abd El-Fattah
     ** @Category: Route Assessment
     ** @brief: Every Session Java Code Assessment
    /** ========================================**/

    // Abstraction: hiding implementation details and showing only the essential behavior
    // Focus on => what an object does, not how it does it.

    /*
    In real life: When you drive a car, you use the steering wheel and pedals (interface),
    but you don't worry about how the engine works (implementation hidden)
    */

    /*
    1- Abstract classes
       - Can have both abstract methods (no body) and concrete methods.
       - Cannot be instantiated directly.

    2- Interfaces
       - Pure abstraction (before Java 8: only abstract methods; later: default and static methods allowed).
       - A class can implement multiple interfaces.
    */

    // abstract  نو usages  2 implementations  new*
    abstract void draw();

    void info() // concrete method  no usages  new*
    {
        System.out.println("Shape info: This is a shape.");
    }
}
