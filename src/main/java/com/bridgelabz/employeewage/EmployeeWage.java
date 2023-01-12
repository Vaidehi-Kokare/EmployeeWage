package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int att = (int)(Math.random()*10) % 3;
        int IS_PARTTIME = 1 , IS_FULLTIME = 2 , FULL_HOURS = 12 , PART_HOURS = 8 , WAGE_PER_HOUR = 20;
        if(att== IS_FULLTIME)
            System.out.println("Total Wage for Full Time is " + (FULL_HOURS * WAGE_PER_HOUR));
        else
            if (att == IS_PARTTIME)
                System.out.println("Total Wage for Part Time is " + (PART_HOURS * WAGE_PER_HOUR));
            else
                System.out.println("Employee is Absent");
    }
}
