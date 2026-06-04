package Day4;

import java.util.Scanner;

// Class => blueprint, container
class Rectangle {

    //Encapsulation => Data Hiding / Data Protection/ Data Security

    Scanner input = new Scanner(System.in);

    private double length; // field
    private double width;  // field

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length){
        if(length > 0) this.length = length;
        else System.out.println("Write Positive Number");
    }

    public double getLength() {
        return length;
    }

    public double CalculatedArea(){
        return length * width;
    }

//    public static double calculateArea() {
//        System.out.println("Enter length of rectangle");
//        length = input.nextDouble();
//
//        System.out.println("Enter width of rectangle");
//        width = input.nextDouble();
//
//        double area = length * width;
//        System.out.println("The area of the rectangle is " + area);
//
//        return area;
//    }
}