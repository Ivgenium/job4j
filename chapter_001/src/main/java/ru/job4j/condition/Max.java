package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }
    public static int max(int a, int b, int c) {
        int p = max(a, b);
        return max(p, c);
    }
}
