package com.bridgelabz.employeewage;

public class EmployeeWage implements IEmployeeWageCalculator {
    public static final int IS_PARTTIME = 1;
    public static final int IS_FULLTIME = 2;
    private String name;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int fullHours;
    private int partHours;
    private int totalEmpWage;

    public EmployeeWage(String name, int wagePerHour, int maxWorkingDays, int maxWorkingHours, int fullHours, int partHours) {
        this.name = name;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.fullHours = fullHours;
        this.partHours = partHours;
    }

    public void calculateEmployeeWage() {
        int totalWage = 0, days = 0, hours = 0;
        while (days < maxWorkingDays && hours < maxWorkingHours) {
            int empType = (int) (Math.random() * 10) % 3;
            switch (empType) {
                case IS_FULLTIME:
                    hours += fullHours;
                    break;
                case IS_PARTTIME:
                    hours += partHours;
                    break;
                default:
                    break;
            }
            days++;
        }
        totalEmpWage = hours * wagePerHour;
    }

    public void printTotalEmpWage() {
        System.out.println("Total Employee Wage for Company " + name + " is " + totalEmpWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage employeeWage1 = new EmployeeWage("Company1", 20, 25, 100, 12, 8);
        EmployeeWage employeeWage2 = new EmployeeWage("Company2", 15, 26, 100, 10, 6);
        EmployeeWage employeeWage3 = new EmployeeWage("Company3", 20, 20, 120, 12, 10);

        employeeWage1.calculateEmployeeWage();
        employeeWage1.printTotalEmpWage();

        employeeWage2.calculateEmployeeWage();
        employeeWage2.printTotalEmpWage();

        employeeWage3.calculateEmployeeWage();
        employeeWage3.printTotalEmpWage();
    }
}