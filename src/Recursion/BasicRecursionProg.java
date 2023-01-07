package Recursion;

import java.util.Scanner;

//wrote a recursive program that will print the hellow world n number of times.
public class BasicRecursionProg {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the value N");
        int n = in.nextInt();

        print(n);
    }

    private static void print(int n) {
        if(n==0) return;

        System.out.println("Hello world");
        print(n-1);

    }
}
