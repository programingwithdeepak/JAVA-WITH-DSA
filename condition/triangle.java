package conditon;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first side :");
        int l= sc.nextInt();
        System.out.println("enter the second side:");
        int b = sc.nextInt();
        System.out.println("enter the third side");
       int  h =sc.nextInt();
       
       if(l+b>h&&b+h>l&&l+h>b)
       System.out.println("it is triangle");
       else
       System.out.println("not triangle");
       sc.close();
    }
}
