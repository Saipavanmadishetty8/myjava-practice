import java.util.*;
public class Parantheses {
    public static boolean para(String s){
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch =='[' || ch == '(' || ch == '{'){
                st.push(ch);
            }else if(ch ==']' || ch == ')' || ch == '}'){
                if(st.isEmpty()) return false;
                char top = st.pop();
                if(!isMacth(top,ch)) return false;
            }
        }
        return st.isEmpty();
    }
    public static boolean isMacth(char one,char two){
        return ((one=='['&& two ==']')||
                (one=='{'&& two =='}')||
                (one=='('&& two ==')'));
    }
    public static boolean paraUMap(String s){
        Stack<Character> st = new Stack<>();
        Map<Character,Character> m = new HashMap<>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');
        for(char ch:s.toCharArray()){
            if (m.containsValue(ch)) st.push(ch);
            else if(m.containsKey(ch)){
                if (st.isEmpty()||st.pop()!=m.get(ch)) return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        String s = "[]";
        String s1 = "[](){}";
        String s2 = "[(])";
        String s3 = "[{()}]";

        System.out.println(s + " → " + paraUMap(s));
        System.out.println(s1 + " → " + paraUMap(s1));
        System.out.println(s2 + " → " + paraUMap(s2));
        System.out.println(s3 + " → " + paraUMap(s3));
    }
}
