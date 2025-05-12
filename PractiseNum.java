import java.util.*;

public class PractiseNum {
    public static int fact(int n){
        if (n<=1) {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        int r,rev =0;
        int n1 =n;
        while(n>0){
            r = n%10;
            rev+=r;
            n/=10;
        }
//        if(rev==n1) System.out.println("Yes, Palindrome");
//        else System.out.println("Not a Palindrome");

//        int f = fact(n);
        System.out.println("Sum of digits of  "+n+" is "+rev);
    }
}
