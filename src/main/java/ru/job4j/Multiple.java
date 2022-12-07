package ru.job4j;

import java.io.FileOutputStream;

public class Multiple {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("Multiple.txt")) {
            out.write(("1 * 1 = 1; " + "1 * 2 = 2; " + "1 * 3 = 3; "
                    + "1 * 4 = 4; " + "1 * 5 = 5").getBytes());
            out.write(System.lineSeparator().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
