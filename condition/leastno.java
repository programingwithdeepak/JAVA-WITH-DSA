package conditon;

import java.util.Scanner;

public class leastno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num :");
        int a = sc.nextInt();
         System.out.println("enter the num :");
        int b = sc.nextInt();
         System.out.println("enter the num :");
        int c = sc.nextInt();
        if(a<b){
            if(a<c)
            System.out.println(a+"is least");
            else
            System.out.println(c+"is least");

        }
    else{
    if(b<c)
    System.out.println(b+"is least");
    else
    System.out.println(c+"is least");
        }
        sc.close();
}
}
