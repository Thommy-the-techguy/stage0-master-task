package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide &&
                firstSide + thirdSide > secondSide &&
                thirdSide + secondSide > firstSide) {
            System.out.println("this is a valid triangle");
            return;
        }
        System.out.println("it's not a triangle");
    }

}
