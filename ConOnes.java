import java.util.*;
public class ConOnes {
    public static int conOnes(int[] arr){
        int count =0;
        int maxcount =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count+=1;
                if(count>maxcount) maxcount=count;
            } else if (arr[i] == 0) {
                count=0;
            }
        }
        return maxcount;
    }

    public static void main(String[] args){
        int[] arr= {1,1,0,1,1,1};
        int total=conOnes(arr);
        System.out.println(total);
    }
}
