package com.eminpolat.numeric;

import java.util.Arrays;
import java.util.Random;

public class NumericLottery {
    public final int[] numbers;
    public int[] result = new int[6];

    public NumericLottery(int [] a)
    {
        numbers = a;
    }

    public boolean check()
    {
        Arrays.sort(numbers);
        fillLottery();
        return Arrays.equals(numbers, result);
    }
    public void fillLottery()
    {
        Random r = new Random();
        for (int i = 0; i < 6; ++i) {
            boolean flag;

            do {
                flag = false;
                result[i] = r.nextInt(1, 50);

                for (int j = 0; j < i; ++j) {
                    if (result[i] == result[j]) {
                        flag = true;
                        break;
                    }
                }

            } while (flag);
        }
        Arrays.sort(result);
    }
    public void printLottery()
    {
        System.out.println("Sizin sayısal lotunuz:");
        for (int a : numbers)
            System.out.printf("%d ", a);
        System.out.println();
    }
    public void printResult()
    {
        System.out.println("Sonuç:");
        for (int a : result)
            System.out.printf("%d ", a);
        System.out.println();
    }
}
