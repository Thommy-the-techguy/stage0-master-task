package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength == 0) {
            System.out.println();
            return;
        }
        StringBuilder spaces = new StringBuilder();
        spaces.append(" ".repeat(cathetusLength - 1));
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < cathetusLength; i++) {
            result.append(spaces).append("*".repeat(i + 1)).append("\n");
            spaces.delete(0, 1);
        }
        System.out.println(result.delete(result.length() - 1, result.length()));
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
