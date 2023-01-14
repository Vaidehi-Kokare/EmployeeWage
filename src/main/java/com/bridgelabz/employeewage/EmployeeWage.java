package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static final int  IS_PARTTIME = 1;
    public static final int IS_FULLTIME = 2;
    public static final int FULL_HOURS = 12;
    public static final int PART_HOURS = 8;
    public static final int WAGE_PER_HOUR = 20;
    public static final int WORKING_DAYS_PER_MONTH = 20;
    public static final int MAX_WORKING_DAYS = 100;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wage=0,total_wage=0,days=0,maxHours=0;
        while (days<=WORKING_DAYS_PER_MONTH && maxHours <MAX_WORKING_DAYS) {
            int att = (int) (Math.random() * 10) % 3;
            switch (att) {
                case IS_FULLTIME:
                    wage = FULL_HOURS * WAGE_PER_HOUR;
                    maxHours +=FULL_HOURS;
                    break;
                case IS_PARTTIME:
                    wage = PART_HOURS * WAGE_PER_HOUR;
                    maxHours +=PART_HOURS;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            total_wage += wage;
            days++;
        }
        System.out.println("Monthly Wage is " + total_wage);
        System.out.println("Number of days worked: " + days);
        System.out.println("Number of hours worked: " + maxHours);
    }
}