import java.util.*;

public class IsPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        sc.close();
        if (x<=1){
            System.out.println("Not a prime number!");
            return;
        }
        for (int i=2;i<=Math.sqrt(x);i++){
            if((x%i)==0){
                System.out.println("Not a prime number!");
                return;
            }
        }
        System.out.println(x+" is a prime number");
    }
}
