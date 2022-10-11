package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(180);
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passedE = expected == out;
        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        boolean passedD = expected == out;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
        System.out.println("140 rubles are 2. Test result : " + passedE);
        System.out.println("180 rubles are 3. Test result : " + passedD);
    }
}
