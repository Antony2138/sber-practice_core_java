package ru.sber.base.syntax;

public class Task4 {
    public static void main(String[] args) {
        double[] array = new double[(int)(Math.random() * 20)];
        double max = 0.0;
        double average = 0.0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
            if (array[i] > max) {
                max = array[i];
            }
            System.out.printf("%f ", array[i]);
            average += array[i];
        }
        average /= array.length;

        System.out.println();
        System.out.format("Макс: %f\n", max);
        System.out.format("Средн: %f\n", average);
    }
}
