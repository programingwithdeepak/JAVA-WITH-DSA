package pattern;

import java.util.*;

public class binarytriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n=sc.nextInt();
        for(int  i=1;i<=n;i++){
            for(int j=1 ; j<=i;j++){
    //             if (i%2==1){
    //                 if(j%2==1)
    //             System.out.print(1+" ");
    //         else
    //         System.out.print(0+" ");}
    //             else { //i%2==0
    //                 if(j%2==0)
    //                 System.out.print(1+" ");
    //                 else System.out.print(0+" ");

    //             }
        
              
    // }
    if((i+j)%2==0)
    System.out.print(1+" ");
    else System.out.print(0+" ");}
    System.out.println();
    
}
sc.close();
    }
}

