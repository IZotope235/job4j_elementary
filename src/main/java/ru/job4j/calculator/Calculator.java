package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class Calculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double subtractAndDivision(double first, double second) {
        return subtracting(first, second) + division(first, second);
    }

    public static double allMathFunctionMethods(double first, double second) {
        return sum(first, second) + subtracting(first, second)
                + multiply(first, second) + division(first, second);
    }

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        plus(1, 2);
        plus(10, 11);
        minus(7, 3);
        minus(2, 6);
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + allMathFunctionMethods(10, 20));

        int size = 10;
        size = 100;
        size = size - 5;
        System.out.println(size);
    }
}
