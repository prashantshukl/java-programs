package javaprograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your number :");
        int a = in.nextInt();
        int b = a;
        int c = a;
        int sum = 0;
        int count = 0;
        while (b>0) {
            b /= 10;
            count = count + 1;
        }
        while (c>0) {
            sum = sum + ((a%10)^count);
            c /= 10;
        }
        if (sum == a) {
           System.out.println("it is armstrong number");
        }
        else {
            System.out.println("it is not armstrong number");
       }
        System.out.println(2^count);
    }
}
