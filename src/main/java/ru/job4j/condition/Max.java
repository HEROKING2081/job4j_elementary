package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int left, int right, int first) {
        return max(max(first, left), right);
    }

    public static int max(int left, int right, int first, int two) {
        return (max(first, two, max(left, right)));
    }
}
