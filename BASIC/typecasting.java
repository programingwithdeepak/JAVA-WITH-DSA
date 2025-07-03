package basic;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        double x=sc.nextDouble();
        System.out.println("after the typecasting");
        int y =(int)x;
        System.out.println(y);
        sc.close();
    }
}
