package ru.lebedev.se.Marathon;

/**
 * @author Анатолий Лебедев
 * @version 1.0.0
 */

public class Tools {

    public static int rnd(int min, int max) { // случайное целое в диапазоне
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
