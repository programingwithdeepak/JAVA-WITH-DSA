package array;

public class second_largest_no {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int [] arr ={21,2,3,4,6,787458,85,8,8,} ;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)    //max =Math.max(max,arr[i])
            max = arr[i];

        }
        int smx =Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=max){
                smx  =Math.max(arr[i] ,smx);       }
        }
        System.out.println(max);
        System.out.println(smx);

    }
    
}
