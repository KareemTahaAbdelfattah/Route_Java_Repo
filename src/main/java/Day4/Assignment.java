package Day4;

import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        /** ========================================**
         ** @Author: Kareem Taha Abd El-Fattah
         ** @Category: Route Assessment
         ** @brief: Every Session Java Code Assessment
        /** ========================================**/

        Scanner input = new Scanner(System.in);

//        Write a Java program that simulates an 8-hour workday. For each hour, the program should ask the user to input the current office temperature (in Celsius).
//                Based on the temperature, the system must make a decision using these rules:
//        Above 26°C: The office is too hot. Turn AC ON.
//                Between 20°C and 26°C (inclusive): The temperature is comfortable. Put AC in ECO mode.
//                Below 20°C: The office is too cold. Turn AC OFF.
//        📊 Expected Outputs
//        At the end of the 8-hour shift, your program must print a summary report showing:
//        The average temperature of the day.
//        The total number of hours the AC spent in ECO mode.
//                A warning message "Alert: Severe Overheating!" if the temperature ever hit 30°C or higher at any point during the day.

        int num_of_tracking_hours = 8;
        float TotalTemp = 0;
        int TotalHourInECOMode = 0;
        boolean OverTemp = false;
        for(int i = 1; i <= num_of_tracking_hours; i++){
            System.out.println("Write the Current Temp of the Room in the " + i + " Hour");
            float Temp = input.nextFloat();
            if(Temp > 26){
                System.out.println("The office is too hot. Turn AC ON");
                if(Temp >= 30) OverTemp = true;
            }
            else if (Temp >= 20){
                System.out.println("The temperature is comfortable. Put AC in ECO mode.");
                TotalHourInECOMode++;
            }else{
                System.out.println("The office is too cold. Turn AC OFF.");
            }
            TotalTemp += Temp;
        }
        double AverageTemp = TotalTemp / 8;
        System.out.println("The average temperature of the day is: " + AverageTemp);
        System.out.println("The total number of hours the AC spent in ECO mode is: " + TotalHourInECOMode);
        if(OverTemp) System.out.println("Alert: Severe Overheating!" + "\" The Temperature ever hit 30°C or higher at any point during the day");
    }
}