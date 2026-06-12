package Day6;

public class Main {
    public static void main(String[] args) {

        /** ========================================**
         ** @Author: Kareem Taha Abd El-Fattah
         ** @Category: Route Assessment
         ** @brief: Every Session Java Code Assessment
        /** ========================================**/

//        Shape s1 = new Circle();
//        Shape s2 = new Square();
//
//        s1.draw();
//        s2.draw();
//        s1.info();

//        Vehicle v1 = new Bike();
//        Vehicle v2 = new Car();
//
//        v1.start();
//        v2.start();

        Animal[] A = {new Cat(), new Dog(), new Cow()};

        for(int i = 0; i < 3; i++){
            A[i].makeSound();
        }
    }
}
