package Day5;

import java.util.Scanner;

public class Person {
    /**
     * ========================================**
     * * @Author: Kareem Taha Abd El-Fattah
     * * @Category: Route Assessment
     * * @brief: Every Session Java Code Assessment
     * /** ========================================
     **/
    String name;
    int age;
    char gender;

    //Constructor =>  special method in a class that is automatically called when an object is created.

    //default constructor
    Person() {
        System.out.println("I'm the default constructor");
    }

    // Signature
    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printData(){
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Gender is: " + gender);
    }
}