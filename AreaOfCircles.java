package javaprograms;

import java.util.Scanner;

public class AreaOfCircles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter radius of circle :");
        int a = in.nextInt();
        System.out.println(3.14*a*a + "is the area");
    }
}
