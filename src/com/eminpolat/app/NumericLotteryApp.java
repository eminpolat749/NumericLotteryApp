package com.eminpolat.app;

import com.eminpolat.numeric.NumericLottery;

import java.util.Scanner;

public class NumericLotteryApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        int [] arr = new int[6];
        int val;

        System.out.println("6 adet birbirinden farklı [1, 50) aralığında sayı giriniz lütfen...");

        for (int i = 0; i < 6; ++i) {
            boolean flag;

            do {
                flag = false;
                System.out.printf("%d. sayıyı giriniz:", i + 1);
                val = Integer.parseInt(kb.nextLine());

                while (val < 1 || val > 49) {
                    System.out.println("Lütfen [1, 50) aralığında bir değer giriniz:");
                    val = Integer.parseInt(kb.nextLine());
                }

                for (int j = 0; j < i; ++j) {
                    if (arr[j] == val) {
                        System.out.println("Lütfen daha önce girilen bir sayıyı girmeyiniz...");
                        flag = true;
                        break;
                    }

                }
            } while (flag);

            arr[i] = val;
        }

        NumericLottery nl = new NumericLottery(arr);

        if (nl.check())
            System.out.println("Tebrikler sayısal lotoyu kazandınız...");
        else
            System.out.println("Tekrar deneyiniz...");

        nl.printLottery();
        nl.printResult();
    }
}
