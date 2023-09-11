package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year <= 0 || month <= 0 || month > 12) {
            System.out.println("invalid date");
            return;
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 2 -> {
                if (isLeapYear(year)) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            }
            case 4, 6, 9, 11 -> System.out.println(30);
        }
    }

    public boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
