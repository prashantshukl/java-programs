package javaprograms;

import java.util.Scanner;

public class Factorial3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact =1;
        while (a>0){
            fact *= a;
            a = a-1;
        }
        System.out.println(fact);
    }
}
