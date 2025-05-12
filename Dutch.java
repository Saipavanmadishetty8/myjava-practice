import java.util.*;
public class Dutch {
    public static void dNF(int[] arr){
        int l=0 , m=0 , h = arr.length-1;
        while(m<=h){
            if(arr[m]==0){
                swap(arr,m,l);
                m++;
                l++;
            } else if (arr[m]==1) {
                m++;
            }else{
                swap(arr,m,h);
                h--;
            }
        }
    }
    public static int[] swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sorting obj = new Sorting();
        int n = sc.nextInt();
        int[] dnf = obj.createArray(n,sc);
        obj.printArray(dnf);
        dNF(dnf);
        obj.printArray(dnf);
    }
}
