import java.util.*;
public class NewFibo {
    public static int fibo1(int n){
        if (n==0) return 0;
        if (n==1) return 1;
//        System.out.println(w);
        return fibo1(n-1)+fibo1(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo1(n));
    }
}
