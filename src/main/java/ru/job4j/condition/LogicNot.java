package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Number " + num);
        System.out.println("Is even? " + isEven(num));
        System.out.println("Is positive? " + isPositive(num));
        System.out.println("Is odd? " + notEven(num));
        System.out.println("Is negative? " + notPositive(num));
        System.out.println("Is odd and positive? " + notEvenAndPositive(num));
        System.out.println("Is even or negative? " + evenOrNotPositive(num));

    }
}
