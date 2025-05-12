import java.util.*;
public class FirstUChar {
    public static char firstUC(String s){
        HashMap<Character,Integer> u = new HashMap<>();
        for(char c:s.toCharArray()){
            u.put(c, u.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(u.containsKey(c)&&(u.get(c)==1)){
                return c;
            }
        }
        return '\0';
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        char ch = firstUC(s);
        System.out.println(ch);
    }
}
