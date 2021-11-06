package com.jason.algorithm.bitoperator;

public class PrintBit {

    private static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //int a = 3;
        //print(a);

        //print(Integer.MAX_VALUE);
        //print(Integer.MIN_VALUE);

        //print(-1);
        //print(-2);
        //print(-3);
        //print(-4);

        //int a = 12319283;
        //int b = 3819283;
        //print(a);
        //print(b);
        //System.out.println("=======");
        //print(a | b);
        //print(a & b);
        //print(a ^ b);


        //int a = Integer.MIN_VALUE;
        //print(a);
        //print(a >> 1);
        //print(a >>> 1);

        int c = Integer.MIN_VALUE;
        int d = -c;

        System.out.println(c);
        System.out.println(d);
    }
}
