package javaprograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number :");
        int a = in.nextInt();
        int b = a;
        int fact = 1;
        while (a>0) {
            fact *= a ;
            a -= 1;
        }
        System.out.println("factorial of "+b+" is :"+fact);

    }
}
