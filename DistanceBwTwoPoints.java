package javaprograms;

import java.util.Scanner;

public class DistanceBwTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter  coordinates of first point :");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("enter  coordinates of second point :");
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        int suma = a*a + b*b + c*c;
        int sumb = d*d + e*e + f*f;
        int diff = 0;
        if (suma>sumb) {
            diff = suma - sumb;
        }
        else {
            diff = sumb - suma;
        }
        System.out.println("distance is :" + Math.pow(diff ,0.5));

    }
}
