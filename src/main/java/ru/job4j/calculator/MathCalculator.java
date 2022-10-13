package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDelilka(double first, double second) {
        return minus(first, second)
                + delilka(first, second);
    }

    public static double allimSMMD(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + minus(first, second)
                + delilka(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 9));
        System.out.println("Результат расчёта равен: " + minusAndDelilka(9, 6));
        System.out.println("Результат расчёта равен: " + allimSMMD(6, 2));
    }
}
