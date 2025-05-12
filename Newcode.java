import java.util.*;

public class Newcode {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i =0;i<x;i++){
            for (int j=0;j<(x-i-1);j++){
                System.out.print("  ");
            }
            for(int j =0;j<=i;j++){
//                System.out.print("1");
                System.out.print("* ");
            }
            System.out.println();
//            for (int k=1;k<=i;k++){
//                System.out.print("* ");
//            }
        }
        System.out.println();
        System.out.println("English=");
        int English = sc.nextInt();
        System.out.println("Maths=");
        int Maths = sc.nextInt();
        System.out.println("Science=");
        int Science = sc.nextInt();
        System.out.println("Biology=");
        int Biology = sc.nextInt();
        System.out.println("Social=");
        int Social = sc.nextInt();
        float Percentage = ((English+Maths+Science+Biology+Social)/500.0f)*100;
        System.out.println("Percentage : ");
        System.out.println(Percentage);
    }
}
