package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength == 0) {
            System.out.println();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder current = new StringBuilder("1");
        StringBuilder spaces = new StringBuilder();
        spaces.append(" ".repeat(cathetusLength - 1));
        stringBuilder.append(spaces).append("1").append("\n");
        for (int i = 2; i <= cathetusLength; i++) {
            stringBuilder.append(String.format("%s\n", spaces.delete(0, 1) + "%d".formatted(i)
                    + current
                    + "%d".formatted(i)));
            current = new StringBuilder(i + current.toString() + i);
        }
        System.out.println(stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()));
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
