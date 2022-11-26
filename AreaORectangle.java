package javaprograms;

import java.util.Scanner;

public class AreaORectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter length of rectangle :");
        int a = in.nextInt();
        System.out.println("enter breadth of rectangle :");
        int b = in.nextInt();
        System.out.println(a * b + "is the area");
    }
}
