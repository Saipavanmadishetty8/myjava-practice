public class SL {
    public static void main(String[] args){
        int[] arr = {10, 20, 4, 45, 99, 99, 23};
        int l1 = Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
            if (arr[i]>l1){
                l2=l1;
                l1=arr[i];
            }else if(arr[i]>l2&& arr[i]!=l1) l2=arr[i];
        }
        System.out.println(l2);
    }
}
