package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] fuction = new int[5];
        for (int i = 0; i < fuction.length; i++) {
            fuction[i] = i * 2 + 3;
        }

        for (int i = 0; i < fuction.length; i++) {
            System.out.println(fuction[i]);
        }
    }
}
