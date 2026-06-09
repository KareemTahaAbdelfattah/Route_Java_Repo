package Day5;

/** ========================================**
 ** @Author: Kareem Taha Abd El-Fattah
 ** @Category: Route Assessment
 ** @brief: Inheritance & RunTime Polymorphism (Override)
/** ========================================**/

public class Shape {
    public void draw(){
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("This is a Circle");
    }
}

class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("This is a Square");
    }
}

class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("This is a Triangle");
    }
}