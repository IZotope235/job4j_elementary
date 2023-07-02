package ru.job4j.array;

public class NestedArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1}, {2, 2}, {3, 3, 3}, {4, 4, 4, 4}};
        for (int[] innerArray : array) {
            System.out.println(innerArray.length);
        }
    }
}
