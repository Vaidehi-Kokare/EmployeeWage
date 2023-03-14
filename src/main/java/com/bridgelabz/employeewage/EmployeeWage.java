package com.bridgelabz.employeewage;
public class EmployeeWage {
    public static final int IS_PARTTIME = 1;
    public static final int IS_FULLTIME = 2;
    private int numOfCompanies;
    private CompanyEmployeeWage[] companyEmpWageArray;

    public EmployeeWage() {
        companyEmpWageArray = new CompanyEmployeeWage[5];
        numOfCompanies = 0;
    }

    public void addEmployeeWage(String company, int fullTimeHrs, int partTimeHrs, int wagePerHour, int maxWorkingDays, int workingDaysPerMonth) {
        CompanyEmployeeWage companyEmpWage = new CompanyEmployeeWage(company, wagePerHour, maxWorkingDays, workingDaysPerMonth, fullTimeHrs, partTimeHrs);
        companyEmpWageArray[numOfCompanies] = companyEmpWage;
        numOfCompanies++;
    }

    public void calculateEmployeeWage() {
        for (int i = 0; i < numOfCompanies; i++) {
            CompanyEmployeeWage companyEmpWage = companyEmpWageArray[i];
            int totalEmpWage = 0;
            int totalWorkingDays = 0;
            int totalWorkingHrs = 0;
            while (totalWorkingDays < companyEmpWage.workingDaysPerMonth && totalWorkingHrs < companyEmpWage.maxWorkingDays) {
                int empHrs = 0;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case IS_PARTTIME:
                        empHrs = companyEmpWage.partTimeHrs;
                        break;
                    case IS_FULLTIME:
                        empHrs = companyEmpWage.fullTimeHrs;
                        break;
                    default:
                        empHrs = 0;
                }
                int empWage = empHrs * companyEmpWage.wagePerHour;
                totalEmpWage += empWage;
                totalWorkingDays++;
                totalWorkingHrs += empHrs;
            }
            companyEmpWage.setTotalEmpWage(totalEmpWage);
        }
    }

    public void printTotalEmpWage() {
        for (int i = 0; i < numOfCompanies; i++) {
            CompanyEmployeeWage companyEmpWage = companyEmpWageArray[i];
            System.out.println("Total Employee Wage for Company " + companyEmpWage.company + " is " + companyEmpWage.totalEmpWage);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addEmployeeWage("Company1", 12, 8, 20, 100, 25);
        employeeWage.addEmployeeWage("Company2", 10, 6, 15, 100, 26);
        employeeWage.addEmployeeWage("Company3", 12, 10, 20, 120, 20);
        employeeWage.calculateEmployeeWage();
        employeeWage.printTotalEmpWage();
    }
}