package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        if ( hasMoney || beFriend) {
            System.out.println("Я могу пройти в клуб.");
        } else {
            System.out.println("Я не могу.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
