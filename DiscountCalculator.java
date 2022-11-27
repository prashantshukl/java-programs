package javaprograms;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter amount :");
        double am = in.nextInt();
        System.out.print("enter discount :");
        int dis = in.nextInt();
        double ad = dis/100f;
        double  an = am*ad;
        am = am - an;
        System.out.println("discounted amount is :"+am);

    }
}
