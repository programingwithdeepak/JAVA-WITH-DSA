import java.util.Scanner;

public class chartoggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        StringBuilder x = new StringBuilder(sc.nextLine());
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65&&ascii<=90){
                ascii+=32;
                ch =(char)ascii;
                x.setCharAt(i, ch);
            }
            else if(ascii>=97&&ascii<=122){
                ascii-=32;
                ch =(char)ascii;
                x.setCharAt(i, ch);
            }
        }
        System.out.println(x);
        sc.close();
    }
}
