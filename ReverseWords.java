import java.util.*;

public class ReverseWords {
    public static void reverseWord(String x){
        StringBuilder str = new StringBuilder();
        int n = x.length()-1;
        String sp = " ";
        for (int i=n;i<=0;i--){

            if (x.charAt(i)==' '){

            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        reverseWord(s);
    }
}
