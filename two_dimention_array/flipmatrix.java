package twodimentionarray;
public  class flipmatrix {

   public int matrixScore(int[][]arr) {
    int m =arr.length,n =arr[0].length;
    // put 1 at the 0th position of everyrow
    for (int i = 0; i < m; i++) {
        if(arr[i][0]==0){   
            // flip that row
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==0)  arr[i][j] =1;
                else  arr[i][j] =0;
            }    
        }
        
    }

    // flip those columns where (no of Os > no of 1s)
    for (int j = 0; j < n; j++) {
        int noOfZeroes = 0 ,noOfones =0;
        for (int i = 0; i < m; i++) {
            if(arr[i][j]==0) noOfones++;
            else noOfZeroes++;

        }
        // flip the colomn
        if(noOfZeroes>noOfones){              
          for (int i = 0; i <m; i++) {
            if(arr[i][j]==0)  arr[i][j] =1;
            else  arr[i][j] =0;
          }
        }
    }
    int score =0;
    int x =1;
    for (int j = n-1; j >=0; j--) {
        for (int i = 0; i < m; i++) {
            score+=(arr[i][j]*x);
        }
        x*=2;
    }
    return score;
   }  
   public static void main(String[] args) {
    
   }
}
   


