public class methods {
    public static void main(String[] args) {
        String s = "Deepak chaudhary";
        // contains.....
        System.out.println(s.contains("eepak"));
        // startwith....
        System.out.println(s.startsWith("Deep"));
//   endwith...........
System.out.println(s.endsWith("ary"));

// tolowerand upper case.......
System.out.println(s.toLowerCase());

// concat........
String a = "Deepak";
String b = " chaudhary";
System.out.println(a.concat(b));



// substring(i) and substring(i,j).....
System.out.println(s.substring(3));
System.out.println(s.substring(3,7));
    }
}
