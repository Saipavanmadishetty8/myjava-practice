import java.util.Scanner;

public class SelectionSort {
    public static int[] selectionSort(int[] k){

        for (int i=0 ; i < k.length-1 ; i++){
            int minValue = i;
            for (int j=i+1; j<k.length;j++){
                if (k[minValue]>k[j]){
                    minValue =j;
                }
            }
            int temp = k[i];
            k[i] = k[minValue];
            k[minValue] = temp;
        }
        return k;
    }
    public static void main(String[] args){
        Sorting obj = new Sorting();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int x = sc.nextInt();
        int[] arr = obj.createArray(x,sc);
        obj.printArray(arr);
        int[] sarr = selectionSort(arr);
        obj.printArray(sarr);
//        int j = 8259%7;
//        System.out.print(j);


    }
}
