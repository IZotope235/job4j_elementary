package ru.job4j.calculator;

public class MathFunk {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunk.func1(3);
        int result2 = MathFunk.func2(5);
        int reuult3 = MathFunk.func1(100);
    }
}
