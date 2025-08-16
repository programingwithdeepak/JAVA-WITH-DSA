import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        StringBuilder x = new StringBuilder(sc.nextLine());
        x.setCharAt(3, 'e');
       
        System.out.println(x);
        sc.close();
    }
}
