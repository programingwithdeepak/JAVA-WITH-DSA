package conditon;
import java.util.Scanner;
public class divisibleornot {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a= Sc.nextInt();
        if(a%5==0)
            System.out.println("divisible");
            else
                System.out.println("not divisible");
            
        
Sc.close();

    }
}
