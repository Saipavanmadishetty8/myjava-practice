import java.util.*;
public class power {
    public static int powerofn(int x, int n){
        if (n==0){
            return 1;
        }
        int ans = x * powerofn(x,n-1);
        return ans;
    }
    public static int dsapower(int x, int n){
        if (n==0){
            System.out.println("*");
            return 1;
        }
        int halfpov = dsapower(x,n/2);
        int powerv = halfpov * halfpov;
        if (n%2==0) {
            return powerv;
        } else {
            return x * powerv;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value: ");
        int b = sc.nextInt();
        System.out.println("Enter power value: ");
        int p = sc.nextInt();
        int here = powerofn(b,p);
        int here1 = dsapower(b,p);
        System.out.println(b + " power "+p+" is "+here);
        System.out.println(b + " powerdsa "+p+" is "+here1);
    }
}
