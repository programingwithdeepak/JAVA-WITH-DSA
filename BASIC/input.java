package basic;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     int r,a;
      System.out.print("enter the number");
     r= sc.nextInt();
     a=r*r;
     System.out.println("area : "+a);

     sc.close();

    }
}
