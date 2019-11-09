package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int i;
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                // переместить первую не null ячейку
                // Здесь нужен цикл while
                i = 1;
                while (array[index] == null && index + i < array.length) {
                    array[index] = array[index + i];
                    array[index + i] = null;
                    i++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
