package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int result = Max.max(20, 10);
        System.out.println(result);
        result = Max.max(10, 10);
        System.out.println(result);
        result = Max.max(5, 10);
        System.out.println(result);
    }
}
