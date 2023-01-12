package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static final int  IS_PARTTIME = 1;
    public static final int IS_FULLTIME = 2;
    public static final int FULL_HOURS = 12;
    public static final int PART_HOURS = 8;
    public static final int WAGE_PER_HOUR = 20;
    public static final int WORKING_DAYS_PER_MONTH = 20;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int att = (int) (Math.random() * 10) % 3;
        int wage=0,total_wage=0;
        for (int i = 1; i<=WORKING_DAYS_PER_MONTH; i++) {
            switch (att) {
                case IS_FULLTIME:
                    wage = FULL_HOURS * WAGE_PER_HOUR;
                    System.out.println("Total Wage for Full Time is " + wage);
                    break;
                case IS_PARTTIME:
                    wage = PART_HOURS * WAGE_PER_HOUR;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            total_wage += wage;
        }
        System.out.println("Monthly Wage is " + total_wage);
    }
}
