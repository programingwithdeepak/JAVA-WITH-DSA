package loop;

import java.util.Scanner;

public class table19 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.println("enter the table");
int n = sc.nextInt();
for(int i=n;i<=n*10;i+=n){
    System.out.println(i);
}  
sc.close();
}
    
}
