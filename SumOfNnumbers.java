package javaprograms;

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("how many numbers do you want to enter :");
        int b = in.nextInt();
        int sum = 0;
        int count = 0;
        while (count != b) {
            System.out.print("enter the number :");
            int a = in.nextInt();
            sum += a;
            count++;
        }
        System.out.println(sum);
    }
}
