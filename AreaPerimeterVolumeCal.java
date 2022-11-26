package javaprograms;

import java.util.Scanner;

public class AreaPerimeterVolumeCal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("what do you want to calculate :");
        String a = in.next();
        switch (a) {
            case "area" -> {
                System.out.println("enter shape");
                String ar = in.next();
                switch (ar) {
                    case "circle" -> {
                        System.out.print("enter radius :");
                        int rad = in.nextInt();
                        System.out.println(3.14 * rad * rad);
                    }
                    case "triangle" -> {
                        System.out.print("enter base:");
                        int bs = in.nextInt();
                        System.out.print("enter height  :");
                        int ht = in.nextInt();
                        System.out.println(0.5 * bs * ht);
                    }
                    case "rectangle" -> {
                        System.out.print("enter length :");
                        int ln = in.nextInt();
                        System.out.print("enter breadth :");
                        int abt = in.nextInt();
                        System.out.println(ln * abt);
                    }
                    case "parallelogram" -> {
                        System.out.print("enter base :");
                        int bas = in.nextInt();
                        System.out.print("enter height :");
                        int hti = in.nextInt();
                        System.out.println(bas * hti);
                    }
                    case "rhombus" -> {
                        System.out.print("enter base :");
                        int bas = in.nextInt();
                        System.out.print("enter height :");
                        int hti = in.nextInt();
                        System.out.println(bas * hti);
                    }
                }
            }
            case "perimeter" -> {
                System.out.println("enter shape");
                String pm = in.next();
                switch (pm) {
                    case "circle" -> {
                        System.out.println("enter radius");
                        int rad = in.nextInt();
                        System.out.println(rad * 2 * 3.14);
                    }
                    case "eqitriangle" -> {
                        System.out.println("enter side");
                        int side = in.nextInt();
                        System.out.println(side * 3);
                    }
                    case "rectangle" -> {
                        System.out.println("enter length");
                        int ln = in.nextInt();
                        System.out.println("enter breadth");
                        int br = in.nextInt();
                        System.out.println(2 * (ln + br));
                    }
                    case "square" -> {
                        System.out.println("enter side");
                        int side = in.nextInt();
                        System.out.println(side * 4);
                    }
                    case "rhombus" -> {
                        System.out.println("enter side");
                        int side = in.nextInt();
                        System.out.println(side * 4);
                    }
                }
            }
            case "volume" -> {
                System.out.println("enter shape");
                String vl = in.next();
                switch (vl) {
                    case "cone":
                        System.out.println("enter radius");
                        int rd = in.nextInt();
                        System.out.println("enter height");
                        int ht = in.nextInt();
                        System.out.println(0.33 * rd * rd * ht);
                        break;
                    case "prism":
                        System.out.println("enter base");
                        int bs = in.nextInt();
                        System.out.println("enter breadth");
                        int br = in.nextInt();
                        System.out.println("enter height");
                        int hit = in.nextInt();
                        System.out.println(0.5 * bs * br * hit);
                        break;
                    case "cylinder":
                        System.out.println("enter radius");
                        int rdi = in.nextInt();
                        System.out.println("enter height");
                        int hiit = in.nextInt();
                        System.out.println(3.14 * rdi * rdi * hiit);
                        break;
                    case "sphere":
                        System.out.println("enter radius");
                        int r = in.nextInt();
                        System.out.println(1.33 * 3.14 * r * r * r);
                        break;

                }
            }
            default -> System.out.println("enter valid input");
        }


    }
}
