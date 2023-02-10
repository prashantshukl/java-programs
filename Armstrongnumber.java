package javaprograms;

import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num2 = num;
        int count = 0;
        while (num2 > 0) {
            num2 /= 10;
            count++;
        }
        System.out.println(count);
    }
}
