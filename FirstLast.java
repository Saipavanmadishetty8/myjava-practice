import java.util.*;
public class FirstLast {
    public static int firstocc(int[] arr, int x){
        int l=0,r=arr.length-1,mid;
        int first=-1;
        while(l<=r){
            mid = l+(r-l)/2;
            if (arr[mid]==x){
                first = mid;
                r=mid-1;
            }else if(arr[mid]<x){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return first;
    }
    public static int lastocc(int[] arr, int x){
        int l=0,r=arr.length-1,mid;
        int last = -1;
        while(l<=r){
            mid = l+(r-l)/2;
            if (arr[mid]==x){
                last = mid;
                l=mid+1;
            }else if(arr[mid]<x){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return last;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int x= sc.nextInt();
//        System.out.println("Enter size of array: ");
//        int n = sc.nextInt();
        int[] a = {10,2,3,3,3,4,10,5,5,6};
        System.out.println(firstocc(a,x)+","+lastocc(a,x));
    }
}
