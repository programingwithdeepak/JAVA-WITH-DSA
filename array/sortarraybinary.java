package array;

public class sortarraybinary {
    public static void main(String[] args) {
        int arr[] ={1,1,0,0,0,1,1,1,1,0,0,0};
        int n = arr.length;
        // int no0 = 0;
        // int no1 =0;
        // for(int i =0;i<n;i++){
        //     if(arr[i]==0){
        //         no0 ++;}
        //         else
        //          no1 ++;

        //     }
        //     System.out.println(no0);
        //     System.out.println(no1);
        //     System.out.println();
        //           for(int i=0;i<no0;i++){
        //             arr[i]=0;
        //             System.out.print(arr[i]);
        //           }
        //           for(int i=0;i<no1;i++){
        //             arr[i]=1;
        //             System.out.print(arr[i]);

        // }
    
        


        //    second method

         int i =0,j=n-1;
         while(i<j){
            if(arr[i]==0 ) i++;
            else if (arr[j]==1 ) j--;
        else if ( arr[i]==1 && arr[j]==0) {
            arr[i]=0;
            arr[j]=1;
            i++;
            j--;
        }       
     }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

