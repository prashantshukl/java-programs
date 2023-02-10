package javaprograms;

public class A1234 {
    public static void main(String[] args) {
        int n=4;
        int b,c,d=1;
        for(b=1;b<=n;b++){
            for (c=d;c<=b; c++ ) {
                System.out.println(c);
            }
            c=d;
            System.out.println();
        }
    }
}
