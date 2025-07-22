package conditon;

import java.util.Scanner;

public class maximumside {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       
         System.out.println("enter the num :");
        int a = sc.nextInt();
         System.out.println("enter the num :");
        int b = sc.nextInt();
         System.out.println("enter the num :");
        int c = sc.nextInt();
        if ( a>=b&&a>=c)
        System.out.println("greater  :"+a);
       else if(b>=a&&b>=c)
         System.out.println("greater  :"+b);
        else if(c>=a&&c>=b)
          System.out.println("greater  :"+c);
          sc.close();
    }
}
