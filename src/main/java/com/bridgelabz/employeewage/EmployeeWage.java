package com.bridgelabz.employeewage;
public class EmployeeWage {
    public static final int  IS_PARTTIME = 1;
    public static final int IS_FULLTIME = 2;
    private final  String name;
    private final int fullHours;
    private final int partHours;
    private final int wagePerHour;
    private final int workingDaysPerMonth;
    private final int maxWorkingDays;
    private int totalWage;
    EmployeeWage(String name,int fullHours, int partHours, int wagePerHour,int maxWorkingDays,int workingDaysPerMonth) {
        this.name = name;
        this.fullHours = fullHours;
        this.partHours = partHours;
        this.wagePerHour = wagePerHour;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.maxWorkingDays = maxWorkingDays;
        this.totalWage=totalWage;
    }
    void calculateEmployeeWage() {
        int wage=0,days=0,maxHours=0;
        while (days<= workingDaysPerMonth && maxHours < maxWorkingDays) {
            int hours = 0;
            int att = (int) (Math.random() * 10) % 3;
            switch (att) {
                case IS_FULLTIME:
                    wage = fullHours * wagePerHour;
                    hours += fullHours;
                    break;
                case IS_PARTTIME:
                    wage = partHours * wagePerHour;
                    hours += partHours;
                    break;
            }
            maxHours+=hours;
            totalWage += wage;
            days++;
        }

        System.out.println("Monthly Wage is " + totalWage);
        System.out.println("Number of days worked: " + days);
        System.out.println("Number of hours worked: " + maxHours);
    }
    public String toString() {
        return "Total Wage for Company " + name + " is " + totalWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage Company1 = new EmployeeWage("Company1",12,8,20,100,25);
        Company1.calculateEmployeeWage();
        EmployeeWage Company2 = new EmployeeWage("Company2",10,6,15,100,26);
        Company2.calculateEmployeeWage();
        EmployeeWage Company3 = new EmployeeWage("Company3",12,10,20,120,20);
        Company3.calculateEmployeeWage();
    }
}