package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    /**
     * Это поле объекта. Оно доступно только конректному объекту.
     */
    private int x;
    /*
     * Это поле объекта. Оно доступно только конректному объекту.
     */
    private int y;
    /*
     * Это поле объекта. Оно доступно только конректному объекту.
     */
    private int z;
    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /*
     * Метод возвращает расстояние между точками на плоскости
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
    /*
     * Метод возвращает расстояние между точками в пространстве
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}
