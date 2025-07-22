package array;

import java.util.Scanner;

public class basicsyntax {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of element of array");
        int n =sc.nextInt();
        int [] arr = new int[n];
        // input 
        System.out.println("enter the array value");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // output
        System.out.println("output");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }

sc.close();
    }
}