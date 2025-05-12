import java.util.*;


public class ur {

    public static int gcd(int x,int y){
        // while(y!=0){
        if (y==0){
            return x;
        }
        return gcd(y,x%y);
            // int t= y;
            // y= x%y;
            // x=t;
        // }
        // return x;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        System.out.println("Enter the value of n1: ");
        int n1= sc.nextInt();
        int m=gcd(n, n1);
        System.out.println("GCD of "+n+" and "+n1+" is: "+m);

        
    }
}
