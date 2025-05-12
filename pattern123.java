import java.util.*;

public class pattern123 {
    public static void main(String args[]){
        int x = 5, c=1;
        for (int i =0;i<x;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}
