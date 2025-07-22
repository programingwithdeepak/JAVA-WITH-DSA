package twodimentionarray;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] =new int [4][4];
        int sum =0;
        System.out.println("enter array");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // solution
        System.out.println("sun value :");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               sum+=arr[i][j]; 
            }
        }
        System.out.println(sum);
        sc.close();

    }
}
