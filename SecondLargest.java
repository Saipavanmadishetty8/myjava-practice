public class SecondLargest {
    public static void main(String[] args){
        int[] x = {12,35,1,10,34,1};
        int h = Integer.MIN_VALUE;
        int l = Integer.MIN_VALUE;
        for ( int i=0;i<x.length;i++){
            if(x[i]>h){
                l=h;
                h=x[i];
            }else if(x[i]>l && x[i]!=h){
                l=x[i];
            }
        }
        System.out.print(l);
    }
}
