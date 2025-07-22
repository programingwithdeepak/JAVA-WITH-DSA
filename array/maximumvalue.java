
package array;
public class maximumvalue {

    public static void main(String[] args) {
        int arr[] = {1,43,3,4,5,6};
        int max =Integer.MIN_VALUE;
        // int temp;
        for(int i =0;i<arr.length;i++){
            // if(arr[i]>max){
            //     temp =arr[i];
            //     arr[i]=max;
            //     max=temp;


            // }
            max = Math.max(max,arr[i]);

           
        }
        System.out.println(max);
    }
}