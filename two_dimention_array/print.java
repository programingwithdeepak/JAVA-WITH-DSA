package twodimentionarray;

import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][]arr = new int [2][3];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                 arr[i][j] =sc.nextInt();
                
            }
            
        }
        // output
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
