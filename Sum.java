package javaprograms;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int a = in.nextInt();
            if (a==0){
                break;
            }
            else {
                sum += a;
            }
            System.out.println(sum);
        }
    }
}
