import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
//    public static int[] iSort(int[] k){
//        int n = k.length;
//        for (int i=1 ; i < n ; i++){
//            int key = k[i];
//            int j=i-1;
//            while (j>=0 && k[j]>key){
//                k[j+1] = k[j];
//                j--;
//            }
//            k[j+1] = key;
//        }
//        return k;
//    }
//    public static void main(String[] args) {
//        Sorting obj1 = new Sorting();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array: ");
//        int x = sc.nextInt();
//        int[] arr = obj1.createArray(x,sc);
//        obj1.printArray(arr);
//        int[] sarr = iSort(arr);
//        obj1.printArray(sarr);
//    }
public static int[] sortArray(int[] arr) {
    for (int i=1;i<arr.length;i++){
        int key = arr[i];
        System.out.println(key);
        int j = i-1;
        System.out.println(j);
        while(j>=0&&arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
        System.out.println(Arrays.toString(arr));

    }
//
    return arr;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(x));
        int[] sa=sortArray(x);
        System.out.println(Arrays.toString(sa));

    }
}
