package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int rslCurrentIndex = 0, leftCurrentIndex = 0 , rightCurrentIndex = 0;
        while (rslCurrentIndex < rsl.length) {
            if (leftCurrentIndex < left.length && (rightCurrentIndex >= right.length || left[leftCurrentIndex] < right[rightCurrentIndex])) {
                rsl[rslCurrentIndex] = left[leftCurrentIndex++];
            }   else if (rightCurrentIndex < right.length && (leftCurrentIndex >= left.length || right[rightCurrentIndex] < left[leftCurrentIndex])) {
                rsl[rslCurrentIndex] = right[rightCurrentIndex++];
            }   else if (leftCurrentIndex < left.length && rightCurrentIndex < right.length && left[leftCurrentIndex] == right[rightCurrentIndex]) {
                rsl[rslCurrentIndex++] = left[leftCurrentIndex++];
                rsl[rslCurrentIndex] = right[rightCurrentIndex++];
            }
            rslCurrentIndex++;
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
