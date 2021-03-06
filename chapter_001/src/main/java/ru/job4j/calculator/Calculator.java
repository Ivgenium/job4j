package ru.job4j.calculator;
/**
 * Class Класс для вычисления арифметических операций + - * /
 *
 * @author Evgeny Vatyutov (genrymorgon@mail.ru)
 * @since 03.11.2019
 * @version 1
 */
public class Calculator {
    /**
     * Сложение
     *
     * @author Evgeny Vatyutov (genrymorgon@mail.ru)
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }
    /**
     * Вычитание
     *
     * @author Evgeny Vatyutov (genrymorgon@mail.ru)
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }
    /**
     * Умножение
     *
     * @author Evgeny Vatyutov (genrymorgon@mail.ru)
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }
    /**
     * Деление
     *
     * @author Evgeny Vatyutov (genrymorgon@mail.ru)
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
