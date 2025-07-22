
package array;

import java.util.Scanner;

public class linearsearch {

   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
     
      System.out.println("enter the target element");
      int x =sc.nextInt();
      System.out.println("enter the size of array");
      int n =sc.nextInt();
      int arr[] = new int[n];
      System.out.println("enter the array");
      for(int i =0; i<n;i++){     
          arr[i] = sc.nextInt();
         }

         boolean flag =false;
         for(int i =0;i<n;i++){
            if(arr[i]==x){
            flag=true;
            break;}
         }

         if(flag==true){
            System.out.println("found element");
         }else 
            System.out.println("not found");
         
sc.close();
   }
}