import java.util.Scanner;

import java.util.*;

public class fibo {

    public static int fi(int n){
//        System.out.println(k);
        if (n<=1) {
            return n;
        }

        return fi(n-1)+fi(n-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int f = fi(x);
        System.out.println(f);
    }
}