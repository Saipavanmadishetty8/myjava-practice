import java.util.*;
public class rsnum {
    public static void nsum(int n, int sum){
        if(n==0){
            System.out.println("Sum of first n natural numbers is " + sum);
            return;
        }

        nsum(n-1,sum+n);
    }

    public static int nnsum(int n){
        if(n==1){
            return 1;
        }
        return n + nnsum(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        int sum = 0;
        nsum(n,sum);
        System.out.println("Sum of first "+ n +" natural numbers is " + nnsum(n));
    }
}
