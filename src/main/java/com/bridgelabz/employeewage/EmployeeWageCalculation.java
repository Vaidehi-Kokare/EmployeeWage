package com.bridgelabz.employeewage;
import java.util.Scanner;
import java.util.Random;
public class EmployeeWageCalculation {
    static Scanner scanner = new Scanner(System.in);

    void totalWage(int maxDays, int maxHour, int wagePerHour) {

        Random randNum = new Random();
        int j = 0, hour, sum = 0, maximumHour = 0;

        while (j < maxDays && maximumHour < maxHour) {

            int check = randNum.nextInt(3);

            switch (check) {
                case 0:
                    hour = 0;
                    break;
                case 1:
                    hour = 4;
                    break;
                default:
                    hour = 8;
            }
            System.out.println("daily Wages are : " + hour * wagePerHour);
            sum += hour * wagePerHour;
            j++;
            maximumHour += hour;
        }
        System.out.println("Total Wages of employee is :  " + sum);

    }
}
