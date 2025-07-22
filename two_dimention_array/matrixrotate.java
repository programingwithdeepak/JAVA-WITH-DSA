package twodimentionarray;

public class matrixrotate {
    public static void print(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[i][j]+" ");
           } 
           System.out.println();
        }
    
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // print array
        print(arr);
        System.out.println("// transpose the matrix");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i ; j++) {
                int tem = arr[i][j];
            arr[i][j]= arr[j][i];
            arr[j][i] = tem;
            }
        }
        System.out.println();
        print(arr);
        System.out.println("// reverse the array 90");
        
        for (int i = 0; i < arr.length; i++) {
            int a =0,b=arr.length -1;
            while (a<b) {
                int  temp =arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] =temp;
               a++;
               b--; 
            }
        }
        // print the array
        print(arr);
    }
    
}
