package twodimentionarray;

public class printwavematix {
    public static void print(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[i][j]+" ");
           } 
           System.out.println();
        }
    
    }
   
    public static void main(String[] args) {
        int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};
        int m= arr.length;
        for (int i = 0; i < m; i++) {
            if(i%2==0){
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for (int j = m-1; j >=0;j--) {
                    System.out.print(arr[i][j]+" ");  
                }
            }
            
        }
    }
    
}
