package array;
import java.util.Arrays;

public class arraysbuiltinmethods {
    public static void main(String[] args) {
        int arr[] = {3,32,432,4321,42,341,1};
        for(int ele : arr){
            System.out.println(ele);
        }
        System.out.println("// sorted array");
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
