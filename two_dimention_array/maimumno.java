package twodimentionarray;

import java.util.Scanner;

public class maimumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] =new int [4][4];
        int max = Integer.MIN_VALUE;
        System.out.println("enter array");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // solution
        System.out.println("maximum value :");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(arr[i][j]>max){
                    max =arr[i][j];
                }
                // max =Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max);
        sc.close();

    }
}
