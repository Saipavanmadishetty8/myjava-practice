import java.util.*;
public class SlidingW {
    public static int slidingW(int[] arr, int k){
        int isum = 0;
        for(int i=0;i<k;i++){
            isum+=arr[i];
        }
        if(k<0||k>arr.length) return -1;
        int maxsum=isum;
        for(int i =1; i<=arr.length-k;i++){
            isum-=arr[i-1];
            isum+=arr[i+k-1];
            if(isum>maxsum) maxsum=isum;
            System.out.println(maxsum);
        }

        return maxsum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{2, 1, 5, 1, 3, 2};
        System.out.println("Enter K value: ");
        int k = sc.nextInt();
        int h = slidingW(arr,k);
        System.out.println(h);
    }
}
