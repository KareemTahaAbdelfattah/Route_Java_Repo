package Day5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /** ========================================**
         ** @Author: Kareem Taha Abd El-Fattah
         ** @Category: Route Assessment
         ** @brief: Every Session Java Code Assessment
        /** ========================================**/
        Person person = new Person();
        Person person1 = new Person("Kareem", 24, 'M');
        person.printData();
        person1.printData();

        BankAccount bankAccount = new BankAccount(1000);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(2000);
        System.out.println(bankAccount.getBalance());

        Car car = new Car("BMW", "Black", 2016);
        car.start();
        car.hank();

        System.out.println(car.brand);
        System.out.println(car.color);
        System.out.println(car.year);

        bike bike = new bike("Zoom", "Blue", 2022);
        bike.start();
        bike.ringBill();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Student student = new Student("Kareem", 0);
        System.out.println(student.getGrade());
        System.out.println(student.getName());
        student.setGrade(85);
        System.out.println(student.getGrade());

        Shape[] shapes = {new Circle(), new Square(), new Triangle()};
        for(int i = 0; i < 3; i++) shapes[i].draw();
    }
}