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
                " is equal to $ " + grossPay);

        System.out.println( name + "overtime is " + totalPay( hoursWorked,payRate) );

    }

    public static double totalPay (double hoursWorked, double payRate) {

        double totalPay = 0;
        // creating If statement
        // (hoursWorked -40) * (payRate * 1.5) +(payRate * hoursWorked)
        // Overtime logic
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * payRate;

        } else {
            double regularPay = 40 * payRate;
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * payRate * 1.5;

            totalPay = regularPay + overtimePay;

        }
        return totalPay;
    }


}

