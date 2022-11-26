package javaprograms;

import java.util.Scanner;

public class SumProDiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter an integer :");
        int a = in.nextInt();
        int b = a;
        int s = 0;
        while (b>0) {
            s += b%10;
            b /= 10;
        }
        int p = 1;
        while (a>0) {
            p = p*(a%10);
            a /= 10;
        }
        System.out.println(p-s);
    }
}
