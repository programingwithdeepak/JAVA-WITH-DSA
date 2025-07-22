package conditon;

import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
       System.out.println("enter the value");
        int a =dc.nextInt();
        if(a<0){
        System.out.println(-a);}
         else{
            System.out.println(a);
         }
         dc.close();
    }
}
