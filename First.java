import java.util.*;
public class First {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();
        int n =1;
        for(int j=0;j<l;j++){
            for (int i=0;i<l;i++){

                System.out.print(n+" ");

            }
            n++;
            System.out.println();
        }
    }
}
