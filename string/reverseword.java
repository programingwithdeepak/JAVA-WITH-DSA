import java.util.Scanner;

public class reverseword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        int i =0;int j= 0;
        while(i<n){
            if(sb.charAt(j)!=' ') 
            j++;
            else{
                reverse(sb, i, j-i);
                i=j+1;
                j=i;
            }
        }
        reverse(sb, i, j-i);  // last word
        System.out.println(sb);
        sc.close();
    }
    public static void reverse(StringBuilder sb,int i,int j){
        while (i<=j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; 
            j++;
            
        }
    }
}
