package twodimentionarray;
import java.util.List;
import java.util.ArrayList;

public class pascaltriangle {
    public List<List<Integer>> generate(int n){
List<List<Integer>> ans = new ArrayList<>();
for (int i = 0; i < n; i++) {
    List<Integer> l = new ArrayList<>();
    for (int j = 0; j < i; j++) {
       if(j==0||j==i) l.add(1);
       else
       l.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
        
    }
    ans.add(l);
    
}
return ans;    
}
public static void main(String[] args) {
    
    
    
    }}

