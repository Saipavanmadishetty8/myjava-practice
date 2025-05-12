import java.util.*;

public class Sorting {
    public static int[] createArray(int x, Scanner sc){
        if (x==0) return new int[0];
        int[] arr = new int[x];
        for (int i = 0; i<x ;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] bSort(int[] x){
        if (x.length ==0) {
            System.out.println("Its an empty array");
            return x;
        }
        for (int i = 0 ; i < x.length-1 ; i++){
            boolean swapped = false;
//            System.out.println("\n"+i);
            for (int j = 0; j < x.length-i-1 ; j++){
//                System.out.print(j);

                if( x[j] > x[j+1]){

                    int temp = x[j];
                    x[j] =  x[j+1];
                    x[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return x;
    }
    public static void printArray(int[] x){
        for (int i = 0 ; i <x.length ; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int s = sc.nextInt();
        int[] arr = createArray(s,sc);
        printArray(arr);
        int[] sortedArr = bSort(arr);
        printArray(sortedArr);
    }
}
