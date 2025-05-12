import java.util.*;

public class QuickSort {

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivot = partitionArr(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static int partitionArr(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for (int j=low; j<high ; j++){
            if (pivot > arr[j]){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1,high);
        System.out.println(Arrays.toString(arr));
        return i+1;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
