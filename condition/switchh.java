package conditon;

import java.util.Scanner;

public class switchh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
       int a=sc.nextInt();
       System.out.println("enter b:");
       int b=sc.nextInt();
       System.out.println("enter the operation");
       char op = sc.next().charAt(0);
       switch(op){
       
         case '+':
        int r= a+b;
        System.out.println(r);
        break;
         case '-':
         r= a-b;
         System.out.println(r);
        break;
         case '*':
         r= a*b;
         System.out.println(r);
        break;
         case '/':
         r= a/b;
         System.out.println(r);
        break;
        default:
        System.out.println("invalid");

       }
       sc.close();

    }
}
