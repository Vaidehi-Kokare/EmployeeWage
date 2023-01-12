package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int att = (int)(Math.random()*10) % 2;
        int is_present = 1;
        int hours = 8;
        int wage_per_hour = 20;
        if(att==is_present)
            System.out.println("Total Wage for Full Time is " + (hours * wage_per_hour) + " hours");
        else
            System.out.println("Employee is Absent");
    }
}
