package twodimentionarray; 
 public class sprialprint {
    public static void print(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[i][j]+" ");
           } 
           System.out.println();
        }
    
    }
   public static void main(String[] args) {
    int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    int m= arr.length;
    int n = arr[0].length;
    int minr =0,minc =0;
    int maxr =m-1,maxc =n-1;
    while(minc<=maxc && minr<=maxr){
        // left to right 
        for(int j = minc;j<=maxc;j++){
            System.out.print(arr[minr][j]+" ");
        }
        minr++;

        // top to bottom
        if(minr>maxr || minc >maxc){
            break;
        }
        for (int i = minr; i <= maxr; i++) {
            System.out.print(arr[i][maxc]+" ");
            
        }maxc--;

        // right to left
        if(minr>maxr || minc >maxc){
            break;
        }
        for (int j = maxc; j>=minc; j--) {
           System.out.print(arr[maxr][j]+" "); 
        }
        maxr--;

        // bottum to top
        if(minr>maxr || minc >maxc){
            break;
        }
        for (int i =maxr; i>=minr; i--) {
          System.out.println(arr[i][minc]+" ");  
        }
    minc++;
    }
   }
}
