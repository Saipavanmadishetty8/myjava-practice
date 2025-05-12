import java.util.*;
public class PractiseSearching {
    public static void hi(int[] arr){
        int highest=Integer.MIN_VALUE;
        for(int i =0;i <arr.length;i++){
            if(arr[i]>highest){
                highest=arr[i];
            }
        }
        System.out.println(highest);
    }
    public static void main(String[] args){
        int[] arr = {6,88,93,902,17,220,4};
        hi(arr);
    }
}
