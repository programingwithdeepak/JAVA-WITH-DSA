package array;

import java.util.Arrays;

public class deepcopy {
    public static void main(String[] args) {
        int arr[] ={1,3,3,23,2,2344,4234,32};
      for(int ele:arr){
        System.out.print(ele+" ");
      }
      System.out.println();
      int brr[] = Arrays.copyOf(arr, arr.length);
      
      for (int i : brr) {
        System.out.print(i+" ");
      }
      
    }
}
