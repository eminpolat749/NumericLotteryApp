package com.eminpolat.numeric;

import java.util.Arrays;

public class NumericLottery {
    private final int[] numbers;
    private final int[] result = {1, 2, 3, 4, 5, 6};

    public NumericLottery(int [] a)
    {
        numbers = a;
    }

    public boolean check()
    {
        Arrays.sort(numbers);
        return Arrays.equals(numbers, result);
    }
}
