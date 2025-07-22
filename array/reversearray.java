 package array;
 public class reversearray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        // reverse the array
        // for(int i =0 ;i<n/2;i++){
        //     int j = n-1-i;
        //     int temp =arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=temp;
        // }
           int i =0;
           int j=n-1;
           while(i<=j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
           }

        System.out.println();
        for( i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
    
}
