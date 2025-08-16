public class updatestring {
   public static void main(String[] args) {
    String str = "Deepakchaudhary";
    String t = "";
    for (int i = 0; i < str.length(); i++) {
        if(i%2==0) t+='a';
        else t+=str.charAt(i);
        
    }
    System.out.println(t);
   } 
}
