package array;

import java.util.Scanner;

public class rollno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("total no. of marks of sudent in array");
        int n =sc.nextInt();
        int [] arr = new int [n];
        //  input the marks of student
        System.out.println("enter the marks");
        for(int i=0;i<n;i++){
            arr [i] =sc.nextInt();
       
        }

        // output
        System.out.println("output");
        for(int i =0;i<n;i++){
        if(arr[i]<35){
            System.out.println(i);
        }}
        sc.close();


    }
}