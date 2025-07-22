 package pattern;
 import java.util.Scanner;

public class oddtriangle {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter :");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j =1;j<=i;j++){
                
                System.out.print(2*j-1);
            }
                System.out.println();
        }
        sc.close();
  }
}
