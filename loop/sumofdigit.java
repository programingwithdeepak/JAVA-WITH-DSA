package loop;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num.:");
        int n = sc.nextInt();
        int rem;
        int sum=0;
        
        while (n!=0) {
        
            rem = n%10;
            sum+=rem;
            n/=10;
            
        }
        System.out.println(sum);
        sc.close();
    }
}
