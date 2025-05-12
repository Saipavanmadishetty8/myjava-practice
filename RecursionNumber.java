import java.util.*;
public class RecursionNumber {
    public static int revNum(int num){
        if (num==0){
            return 0;
        }
//        int x=0;
//        x=(x*10)+(num%10);
//        num/=10;
        return ((num%10)*10)+revNum(num/10);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(revNum(n));
    }
}
