package basic;

import java.util.Scanner;
public class sum  {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the number");
        a=sc.nextInt();
        System.out.println("enter the number");
        b=sc.nextInt();
        c=a+b;
        System.out.println(c);
        sc.close();
    }
    
    
}
