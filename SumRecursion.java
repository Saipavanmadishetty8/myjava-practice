import java.util.*;
public class SumRecursion {
    public static int rSum(int num){
        if (num==0){
            return 0;
        }
        int sum = num%10;
        num /=10;
        return sum+rSum(num);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits of "+n+" is "+rSum(n));
    }
}
