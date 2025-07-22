package conditon;

import java.util.Scanner;

public class theedigitnumberornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int n =sc.nextInt();
        if(n<1000&&n>99)
        System.out.println("three digit");
        else
        System.out.println("not three digit");
        sc.close();
    }
}
