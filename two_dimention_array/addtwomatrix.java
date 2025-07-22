package twodimentionarray;

public class addtwomatrix {
    public static void main(String[] args) {
        
        int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
        int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
        int m = a.length;
        int n = a[0].length;
        int result[][] = new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] =a[i][j]+b[i][j];
                
            }
            
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j]+" ");
                
            }
            System.out.println();
            
        }

    }
}
