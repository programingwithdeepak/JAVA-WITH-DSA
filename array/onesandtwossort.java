package array;

public class onesandtwossort {
    public static void main(String[] args) {
        int arr[]= {1,1,1,0,0,0,2,2,2,0,0,2};
        int n =arr.length;
        int noOfzeroes=0,noOfones=0;
        for(int i=0;i<n;i++){
            if (arr[i]==0) noOfzeroes++;
            if(arr[i]==1) noOfones++;

        }
        for(int i=0;i<n;i++){
            if(i<noOfzeroes) arr[i] =0;
            else if (i<noOfzeroes+noOfones) arr[i] =1;
            else arr[i] =2;


        }
        for(int ele :arr){
            System.out.print(ele+" ");
        }
    }
    
}
