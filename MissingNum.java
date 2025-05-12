import java.util.*;
public class MissingNum {
    public static int missingNum(int[] arr){
        int n = arr.length;
        for (int i =1; i<=n ;i++){
            if (arr[i-1]!=i){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] x={1,2,4,5,6};
        int m = missingNum(x);
        if (m!=-1){
            System.out.println(m+" is missing");
        }else
            System.out.println("Nothing is missing");
    }
}
