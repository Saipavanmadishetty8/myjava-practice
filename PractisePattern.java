import java.util.*;

public class PractisePattern {
    public static void main(String[] args){
//        int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
//            for (int j=1;j<n-i;j++){
//                System.out.print("  ");
//            }
            for (int j=n ; j>i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
