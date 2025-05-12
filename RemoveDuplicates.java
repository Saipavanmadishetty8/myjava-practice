import java.util.*;
public class RemoveDuplicates {
    public static int[] noDup(int[] arr){
        Arrays.sort(arr);
        int[] noDupArr = new int[arr.length];
        int index=0;
        for(int i=0;i< arr.length;i++){
            if(i==0||arr[i]!=arr[i-1]){
                noDupArr[index++]=arr[i];
            }
        }
        return Arrays.copyOf(noDupArr,index);
    }
    public static int[] noDupHash(int[] arr){
        HashSet<Integer> unique = new HashSet<Integer>();

        for (int a:arr){
            unique.add(a);
        }
        int[] a = new int[unique.size()];
        int index =0;
        for (int i:unique){
            a[index++]=i;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] na = noDup(a);
        System.out.println(Arrays.toString(na));
    }
}
