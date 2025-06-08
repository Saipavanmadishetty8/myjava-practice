import java.util.*;
public class Code1 {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<arr.length;i++){
            System.out.print("Enter element: \n");
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
