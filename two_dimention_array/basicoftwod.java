package twodimentionarray;
import java.util.*;
public class basicoftwod {

    public static void main(String[] args) {
        List<Integer> a =new ArrayList<>();
        a.add(10);a.add(20);a.add(30);
        List<Integer> b =new ArrayList<>();
        b.add(40);b.add(50);
        List<Integer> c = new ArrayList<>();
        c.add(60);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a);l.add(b);l.add(c);
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j<l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
            
        }
        System.out.println();
    }
}