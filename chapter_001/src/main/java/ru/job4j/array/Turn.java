package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int k, lengthArray = array.length;
        for (int i = 0; i != lengthArray / 2; i++) {
            k = lengthArray - 1 - i;
            int temp1 = array[i];
            array[i] = array[k];
            array[k] = temp1;
        }
        return array;
    }
}
