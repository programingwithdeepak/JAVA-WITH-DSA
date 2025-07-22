package pattern.compositepattern;

import java.util.Scanner;

public class stardiamond {
public static void main(String[] args) {
    
  Scanner sc =new Scanner(System.in);
        System.out.println("enter");
        int n =sc.nextInt();
    int a=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=2*i-1;j++){ 
                System.out.print("*"+" ");
                
            }

            System.out.println();
        }
            for(int i=1;i<n-1;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" "+" ");

                }
                for(int j=1;j<=a+1;j++){
                System.out.print("*"+" ");
            }
            a-=2;
            System.out.println();
}
sc.close();   
}
}

