package com.company;

import java.util.Scanner;

public class Main {
    private static long fact(int n){
        if (n<0){
            return -1;
        }
        if(n == 0 || n == 1){
            return 1 ;
        }
        else {
            return fact(n-1)*n;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N factorial.");
        int n = scan.nextInt();
        long result = fact(n);
        System.out.println(result == -1?"N should be positive":result);
    }
}
