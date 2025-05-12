import java.util.*;

public class NewProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int u = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for(int i =0;i<n;i++){
            if(a[i]>l){
                System.out.print("["+l+","+(a[i]-1)+"]");
                l=a[i]+1;
            }
        }
        if(l<=u){
            System.out.print("["+l+","+u+"]");//7,16,11,91,77
        }
    }
}
