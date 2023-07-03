package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] sumIndexArray = new int[] {};
        while (i < j) {
            if (array[i] + array[j] == target) {
                sumIndexArray = new int[] {i, j};
                break;
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return sumIndexArray;
    }
}
