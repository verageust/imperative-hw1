package com.company;

public class Main {

    public static void main(String[] args)
    {
	homework34(); // the code you want to run
    }

    static void homework2()
    {
        int a = 5;
        int b = 10;

        if (a == b)
            System.out.println((a+b)*(a+b));
        else
            System.out.println(a+b);
    }

    static void homework31()
    {
        int x = 10;
        while (x <= 37)
        {
            System.out.println(x);
            x = x + 3;
        }
    }

    static void homework32()
    {
        int x = 998;
        while (x >= 900)
        {
            System.out.println(x);
            x = x - 2;
        }
    }

    static void homework33()
    {
        int val = 1;
        int n;

        for (n = 1; n <= 20; n = n + 1)
        {
            System.out.println(val);
            val = (-1) * val;
        }
    }

    static void homework34()
    {
        int n;
        for (n = 1; n <= 20; n = n + 1)
        {
            System.out.println(7);
            System.out.println(7);
            System.out.println(9);
        }
    }
}
