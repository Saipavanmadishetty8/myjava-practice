import java.util.*;
public class SwapVowels {
    public static void swapV(String str){
        int f=0,l=str.length()-1;
        char[] arr = str.toCharArray();
        while(f<l){
            if (str.charAt(f)=='a'||str.charAt(f)=='e'||str.charAt(f)=='i'||str.charAt(f)=='o'||str.charAt(f)=='u') {
                if (str.charAt(l) == 'a' || str.charAt(l) == 'e' || str.charAt(l) == 'i' || str.charAt(l) == 'o' || str.charAt(l) == 'u') {
                    swap(arr, f, l);
                    f++;
                    l--;
                }
                else{
                    l--;
                }
            }
            else f++;
        }
        System.out.println(new String(arr));
    }
    public static char[] swap(char[] a, int f, int l){
        char temp = a[f];
        a[f]=a[l];
        a[l]=temp;
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stirng here: ");
        String s = sc.nextLine();
        swapV(s);
    }
}
