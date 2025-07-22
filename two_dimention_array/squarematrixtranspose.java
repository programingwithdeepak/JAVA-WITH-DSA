package twodimentionarray;

public class squarematrixtranspose {
    public static void main(String[] args) {
        int [][] arr  = {{1,2,3},{1,2,3},{1,2,3}};
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // solution-------
        for (int i = 0; i < m; i++) {
         for (int j = 0; j < i; j++) {
            int tem = arr[i][j];
            arr[i][j]= arr[j][i];
            arr[j][i] = tem;
         }   
    
    }
    //   print -----------
    System.out.println();
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        
    }

    }
}
