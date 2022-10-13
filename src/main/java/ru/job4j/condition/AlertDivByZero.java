package ru.job4j.condition;

public class AlertDivByZero {

    private static final int BOGDAN = 1;
    public static void main(final String[] args) {
        possibleDiv(BOGDAN);
        possibleDiv(0);
        possibleDiv(BOGDAN);
    }

    public static void possibleDiv(final int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative number");
        }
    }
}
