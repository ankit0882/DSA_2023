package Recursion;

import java.util.Scanner;

//write a function which will take all the numbers
public class NumberExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  the number");
        int n =in.nextInt();

        print(n);
    }

    private static void print(int n) {
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    }
}
