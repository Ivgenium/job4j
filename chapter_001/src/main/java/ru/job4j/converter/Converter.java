package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRouble(int value) {
        return value * 70;
    }

    public static int dollarToRouble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed);

        in = 3;
        expected = 210;
        out = euroToRouble(in);
        passed = expected == out;
        System.out.println("3 euro are 210 roubles. Test result : " + passed);

        in = 4;
        expected = 240;
        out = dollarToRouble(in);
        passed = expected == out;
        System.out.println("4 dollars are 240 roubles. Test result : " + passed);

    }

}
