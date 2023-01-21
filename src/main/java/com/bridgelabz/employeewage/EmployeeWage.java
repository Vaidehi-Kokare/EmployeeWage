package com.bridgelabz.employeewage;
public class EmployeeWage {
    public static final int  IS_PARTTIME = 1;
    public static final int IS_FULLTIME = 2;
    int fullHours;
    int partHours;
    int wagePerHour;
    int workingDaysPerMonth;
    int maxWorkingDays;
    EmployeeWage(int fullHours, int partHours, int wagePerHour,int maxWorkingDays,int workingDaysPerMonth) {
        this.fullHours = fullHours;
        this.partHours = partHours;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.workingDaysPerMonth = workingDaysPerMonth;
    }
    void calculateEmployeeWage() {
        int wage=0,total_wage=0,days=0,maxHours=0;
        while (days<= workingDaysPerMonth && maxHours < maxWorkingDays) {
            int att = (int) (Math.random() * 10) % 3;
            switch (att) {
                case IS_FULLTIME:
                    wage = fullHours * wagePerHour;
                    maxHours += fullHours;
                    break;
                case IS_PARTTIME:
                    wage = partHours * wagePerHour;
                    maxHours += partHours;
                    break;
            }
            total_wage += wage;
            days++;
        }
        System.out.println("Monthly Wage is " + total_wage);
        System.out.println("Number of days worked: " + days);
        System.out.println("Number of hours worked: " + maxHours);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage Company1 = new EmployeeWage(12,8,20,100,25);
        Company1.calculateEmployeeWage();
        EmployeeWage Company2 = new EmployeeWage(10,6,15,100,26);
        Company2.calculateEmployeeWage();
        EmployeeWage Company3 = new EmployeeWage(12,10,20,120,20);
        Company3.calculateEmployeeWage();
    }
}