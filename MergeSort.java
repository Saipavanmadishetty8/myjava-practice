import java.util.*;
public class MergeSort {
    public static void mergeSort(int[] arr, int left,int right){
        if (left>=right) return;
        int mid = left + (right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    public static void merge(int[] arr, int left,int mid,int right){
        int n1 = mid-left+1;
        int n2 = right-mid;

        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for (int i=0;i<n1;i++) larr[i] = arr[left+i];
        for (int j=0;j<n2;j++) rarr[j] = arr[mid+1+j];

        int i=0,j=0,k=left;
        while(i < n1 && j < n2){
            if (larr[i]<=rarr[j]) arr[k++]=larr[i++];
            else arr[k++]=rarr[j++];
        }

        while (i<n1) arr[k++]=larr[i++];
        while (j<n2) arr[k++]=rarr[j++];
    }
    public static void main(String arg[]){
        Sorting obj = new Sorting();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = obj.createArray(n,sc);
        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
