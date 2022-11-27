package javaprograms;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter principle amount :");
        int a = in.nextInt();
        System.out.println("enter rate :");
        int b = in.nextInt();
        System.out.println("enter time :");
        int c = in.nextInt();
        float cal = (1 + (b/100f));
        double ans = Math.pow(cal , c);
        double fans = a*ans - a;
        System.out.println(fans);
    }
}
