import java.util.*;
public class SL {
    public static int[] cArray(Scanner sc, int n){
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        return arr;
    }
    public static void pArray(int[] x){
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = cArray(sc,x);
        int l1 = Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
            if (arr[i]>l1){
                l2=l1;
                l1=arr[i];
            }else if(arr[i]>l2&& arr[i]!=l1) l2=arr[i];
        }
        System.out.println(l2);
        pArray(arr);
    }
}
