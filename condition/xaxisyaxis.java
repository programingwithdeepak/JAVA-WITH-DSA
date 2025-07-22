package conditon;

import java.util.Scanner;

public class xaxisyaxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x coordinate");
        int x=sc.nextInt();
         System.out.println("enter the y coordinate");
        int y =sc.nextInt();


       
         if(x>0&&y>0)
        System.out.println("1 quadrant");
         else if(x<0 && y>0)
        System.out.println("2 quadrant");
         else if(x<0&&y<0)
        System.out.println("3 quadrant");
         else if(x>0&&y<0)
        System.out.println("4 quadrant");
         if(x>0&&y==0)
        System.out.println("x axis");
         if(x==0&&y>0)
        System.out.println("y axis");
         if(x==0&&y==0)
        System.out.println("origin");
        sc.close();
    }
    
}
