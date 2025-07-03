package loop;

import java.util.Scanner;

public class ap {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no. :");
    int n = sc.nextInt();
    int a=1;
    for(int i=1;i<=n;i++){

        System.out.println(a);
        a+=2;
        
    }
    sc.close();
}    
}
