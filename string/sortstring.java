import java.util.Arrays;

public class sortstring {
    public static void main(String[] args) {
        String sb = "asdfghj";
        char [] ch = sb.toCharArray();
        for(char ele :ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele :ch){
System.out.print(ele);
        }
        System.out.println();

    }
}
