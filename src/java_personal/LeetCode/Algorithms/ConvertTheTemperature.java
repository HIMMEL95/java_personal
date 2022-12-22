package java_personal.LeetCode.Algorithms;

import java.util.Arrays;

public class ConvertTheTemperature {

    public static double[] convertTemperature(double celsius) {
        double[] result = new double[2];

        double Kelvin = celsius + 273.15;
        double Fahrenheit = (celsius * 1.80) + 32.00;

        result[0] = Kelvin;
        result[1] = Fahrenheit;

        return result;
    }

    public static void main(String[] args) {
        double celsius = 36.50;
        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }
}
