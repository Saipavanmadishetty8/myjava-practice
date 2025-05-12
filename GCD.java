import java.util.*;

public class GCD {
    public static int gCD(int a, int b){
        if (b==0){
            return a;
        }
        return gCD(b,a%b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N1");
        int n1= sc.nextInt();
        System.out.println("Enter N2");
        int n2= sc.nextInt();
        int g = gCD(n1,n2);
        System.out.println("GCD of "+n1+", "+n2+" is "+g);
    }
}
