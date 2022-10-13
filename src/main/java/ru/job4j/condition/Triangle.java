package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean abac = ab + ac > bc;
        boolean acbc = ac + bc > ab;
        boolean abbc = ab + bc > ab;
        return (abac && acbc && abbc);
    }
}
