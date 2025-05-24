import java.util.*;
public class ValidAnagram {
    public static int[] vAnagram(int[] A,int[] B){
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        int[] res = new int[A.length];
        for(int i=0;i<B.length;i++){
            if(!hm.containsKey(B[i])) hm.put(B[i],new ArrayList<>());
            hm.get(B[i]).add(i);
        }
        for(int i=0;i<A.length;i++){
            List<Integer> al = hm.get(A[i]);
            res[i] = al.remove(0);
        }
        return res;
    }
    public static void main(String[] args){
        int[] A = {12, 28, 46, 32, 50, 28};
        int[] B = {50, 12, 28, 32, 46, 28};
        int[] arr = vAnagram(A,B);
        System.out.println(Arrays.toString(arr));
    }
}
