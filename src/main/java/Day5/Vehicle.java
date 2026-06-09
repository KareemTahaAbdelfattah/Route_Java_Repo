package Day5;

public class Vehicle {
    /** ========================================**
     ** @Author: Kareem Taha Abd El-Fattah
     ** @Category: Route Assessment
     ** @brief: Every Session Java Code Assessment
    /** ========================================**/

    String brand;
    String color;
    int year;

    public Vehicle(String brand, String color, int year){
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public void start(){
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle{

    public Car(String brand, String color, int year) {
        super(brand, color, year);
    }

    @Override
    public void start(){
        System.out.println("Car started");
    }

    public void hank(){
        System.out.println("This car hanks: Beep Beep!");
    }
}

class bike extends Vehicle{

    public bike(String brand, String color, int year) {
        super(brand, color, year);
    }

    public void ringBill(){
        System.out.println("This bike rings the bill");
    }
}