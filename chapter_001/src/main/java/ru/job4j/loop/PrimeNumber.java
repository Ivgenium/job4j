package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            CheckPrimeNumber prime = new CheckPrimeNumber();
            if (prime.check(i)) count++;
        }
        return count;
    }
}
