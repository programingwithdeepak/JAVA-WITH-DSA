package twodimentionarray;

import java.util.Scanner;

public class rollnoandmarks {
public static void main(String[] args) {
    int arr[][]= new int [4][2];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the rollno and marks");
for(int i =0 ;i<4;i++){
    for (int j =0;j<2;j++){
        arr[i][j] =sc.nextInt();
    }
}
// print the rollno and marks
for(int i =0 ;i<4;i++){
    for (int j =0;j<2;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
sc.close();
}
    
}
