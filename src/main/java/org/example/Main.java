package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        int k = 2;

        System.out.println(getRollingAverage(arr, k));
    }

    /* Дан непустой массив целых чисел длиной n и число k (0 < k <= n).
    Нужно вывести среднее значение для всех подмассивов длиной k, входящих в исходный массив. */
    private static List<Double> getRollingAverage(ArrayList<Integer> arr, int k) {
        List<Double> list = new LinkedList<>();

        if(k > 0 && k <= arr.size()) {
            for (int j = 0; j < (arr.size() - (k - 1)); j++) {
                double sum = 0;
                for (int x = j; x < k + j; x++) {
                    sum = sum + arr.get(x);
                }
                list.add(sum / k);
            }
            return list;
        } else {
            throw new IndexOutOfBoundsException("k не соответствует длине массива");
        }
    }
}