package basic;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter charcharecter");
        char ch =SC.next().charAt(0);
        int y=(int)ch;
        System.out.println("value");
        System.out.println(y);
        SC.close();  
    }
}
