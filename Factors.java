package javaprograms;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int fac = 2;
        System.out.println(1);
        while (fac <= a/2){
            if (a%fac==0){
                System.out.println(fac);
            }
            fac++;
        }
        System.out.println(a);

    }
}
