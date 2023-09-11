package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        while (number % 10 >= 1) {
            stringBuilder.append(number % 10);
            number /= 10;
        }
        System.out.println(stringBuilder);
    }

}
