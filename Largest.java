package javaprograms;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lar = 0;
        while (true) {
            System.out.print("enter an integer  :");
            int a = in.nextInt();
            if (a>lar) {
                lar = a;
            } else if (a==0) {
                break;
            }
        }
        System.out.println(lar + " is largest");
    }
}

