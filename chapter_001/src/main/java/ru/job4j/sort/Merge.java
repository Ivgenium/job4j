package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, k = 0 , j = 0;
        while (i < rsl.length) {
            if (k < left.length && (j >= right.length || left[k] < right[j])) {
                rsl[i] = left[k++];
            }   else if (j < right.length && (k >= left.length || right[j] < left[k])) {
                rsl[i] = right[j++];
            }   else if (k < left.length && j < right.length && left[k] == right[j]) {
                rsl[i++] = left[k++];
                rsl[i] = right[j++];
            }
            i++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
