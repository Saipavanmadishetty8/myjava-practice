import java.util.*;

public class ReverseString {
    public static String reverse(String s){
        int n = s.length();
        if (n==1){
            return s;
        }
        String s1 = s.charAt(n-1) + reverse(s.substring(0,n-1));
        return s1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String r =reverse(s);
        System.out.println(r);
    }
}
