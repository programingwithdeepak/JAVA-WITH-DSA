package array;

public class doubletnumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,8};
        int x =10;
        for(int i = 0 ;i<arr.length;i++){
            for(int j=i+1 ;j<arr.length;j++){
         if(arr[i]+arr[j]==x){
            System.out.print(arr[i]+" "+arr[j]);
            System.out.println();
         }
            }
        }
    }
    
}
