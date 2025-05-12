import java.util.*;
public class fact {
    public static void factn(int n, int fact){
        System.out.println("*");
        if (n==0){
            System.out.println(fact);
            return;
        }
        factn(n-1,fact*n);
    }
    public static int nfact(int n){
        System.out.println("*");
        if (n==0){
            return 1;
        }
        return n * nfact(n-1);
    }
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int fact = 1;
        factn(n,fact);
        System.out.println("Factorial of "+n+" is "+nfact(n));
    }
}
