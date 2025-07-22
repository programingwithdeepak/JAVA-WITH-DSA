package conditon;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length");
        int l=sc.nextInt();
        System.out.println("enter the breath");
        int b = sc.nextInt();
        int a =l*b;
        int p =2*(l+b);
        if(a>p){
            System.out.println("area is greater :");
            System.out.println(a-p);

        }
        if(a<p){
            System.out.println("area is not greater");
            System.out.println(p-a);
        }
        sc.close();
    }
}
