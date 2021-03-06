package ru.job4j.calculator;

/**
 * Calculate.
 *
 * @author Maxim Matskevich
 * @version $Id$
 * @since 0.1
 */

public class Calculator {

    /**
     * Сложение.
     *
     * @param first  первое слагаемое.
     * @param second второе слагаемое.
     */

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
}