import java.util.*;

public class StringCompare
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.compareTo(s2) > 0){
            System.out.println("Something is happening!");
        }else if(s1.compareTo(s2) < 0) System.out.println("Really Something is happening!");
        else System.out.println("Something is happening! Really");
    }
}
