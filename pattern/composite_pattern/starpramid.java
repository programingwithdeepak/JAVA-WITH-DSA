package pattern.compositepattern;

import java.util.Scanner;

public class starpramid {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*" + " ");
    
    
                }
                System.out.println();
    }
    sc.close();
    }
    
}
