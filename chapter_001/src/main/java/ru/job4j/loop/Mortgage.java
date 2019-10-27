package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, double salary, double percent) {
        int year = 0;
        do {
            year++;
            amount = amount * (1.0 + percent / 100.0) - salary;
        }
        while (amount > 0);

        return year;
    }
}
