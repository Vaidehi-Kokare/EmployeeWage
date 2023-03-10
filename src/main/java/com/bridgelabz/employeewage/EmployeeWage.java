package com.bridgelabz.employeewage;

import java.util.Scanner;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program ");
        int maxHour, maxDays, wagePerHour;

        EmployeeWageCalculation emp1 = new EmployeeWageCalculation();

        System.out.print("Enter Maximum working hours : ");
        maxHour = EmployeeWageCalculation.scanner.nextInt();

        System.out.print("Enter Maximum working days : ");
        maxDays = EmployeeWageCalculation.scanner.nextInt();

        System.out.print("Enter Employee Wage per hour : ");
        wagePerHour = EmployeeWageCalculation.scanner.nextInt();

        emp1.totalWage(maxDays, maxHour, wagePerHour);

        System.out.println("Wage for different company started ");

        EmployeeWageCalculation emp2 = new EmployeeWageCalculation();

        System.out.print("Enter Maximum working hours : ");
        maxHour = EmployeeWageCalculation.scanner.nextInt();

        System.out.print("Enter Maximum working days : ");
        maxDays = EmployeeWageCalculation.scanner.nextInt();

        System.out.print("Enter Employee Wage per hour : ");
        wagePerHour = EmployeeWageCalculation.scanner.nextInt();

        emp2.totalWage(maxDays, maxHour, wagePerHour);

    }
}