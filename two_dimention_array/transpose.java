package twodimentionarray;

import java.util.Scanner;

public class transpose{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] =new int [3][3];
        int tr[][] = new int [3][3];
        System.out.println("enter array");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // solution
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               tr[i][j] = arr[j][i];
            }
        }


        // print 
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tr[i][j]+" ");
            }
            System.out.println();
        }
       
        sc.close();

    }
}

