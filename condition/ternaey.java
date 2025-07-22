package conditon;

import java.util.Scanner;

public class ternaey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        System.out.println((n%2==0)?"even":"odd");
        sc.close();
    }
}
