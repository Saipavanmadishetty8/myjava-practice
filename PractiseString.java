import java.util.*;
public class PractiseString {
    public static String rev(String str){
        int n = str.length();
        char[] arr = new char[n];
        for (int i=0;i<n;i++){
            arr[i] = str.charAt(i);
        }
        int f=0,l=n-1;
        while (f<l){
            swap(arr,f,l);
            f++;
            l--;
        }
        return new String(arr);
    }
    public static char[] swap(char[] arr,int f,int l){
        char temp=arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
        return arr;
    }
    public static void vCount(String str){
//        char[] arr = {'a','e','i','o','u','A','E','I','O','U'};
        int count=0;
        for (int j=0;j<str.length();j++){
            for (char c:"aeoiuAEIOU".toCharArray()){
                if (str.charAt(j)==c){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void anagram(String str1,String str2){
        if (str1.length()!=str2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        char[] s1 = str1.toCharArray();
        Arrays.sort(s1);
        char[] s2 = str2.toCharArray();
        Arrays.sort(s2);
        for (int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Yes, Anagran");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        anagram(str1,str2);
//        String rev = rev(str);
//        System.out.println();
//        vCount(str1);
    }
}
