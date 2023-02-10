package javaprograms;

import java.util.Scanner;

public class ReverseNO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.print("enter a number :");
        int ans = 0;
        int rem = 0;
        while (input > 0) {
            rem = input % 10;
            ans = ans*10 + rem;
            input /= 10;
        }
        System.out.println(ans);
    }
}
