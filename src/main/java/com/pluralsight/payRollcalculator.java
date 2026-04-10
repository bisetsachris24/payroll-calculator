package com.pluralsight;

import java.util.Scanner;
public class payRollcalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Prompt user for hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();


        // Prompt user for pay rate
        System.out.print("Enter pay rate: ");
        double payRate = input.nextDouble();

        // Calculate gross pay
        double grossPay = hoursWorked * payRate;
        // Printing the final gross pay
        System.out.println("The gross pay for " + name +
                "equal to $ " + grossPay);


    }
}
