import java.util.*;
public class Sumoftwo {
    public static void sumOfTwo(int[] arr, int x){
        for (int i=0 ; i<arr.length-1; i++){
            for(int j=i+1;j<arr.length;j++){
//                System.out.println("$");
                if((arr[i]+arr[j])==x){
                    System.out.println(i+","+j);
                    return;
                }
            }
        }
        System.out.println("Sum not equals "+x);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired number: ");
        int dnum = sc.nextInt();
        int[] a = {1,3,4,10,3,4};
        sumOfTwo(a,dnum);
    }
}
