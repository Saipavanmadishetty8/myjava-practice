public class LongestCommonPrefix {
    public static String lCPrefix(String[] str){
        StringBuilder pre = new StringBuilder();
        for(int i=0;i<str[0].length();i++){
            char c = str[0].charAt(i);
            for(int j=1;j<str.length;j++){
                if(i>=str[j].length()||str[j].charAt(i)!=c){
                    return pre.toString();
                }
            }
            pre.append(c);
        }
        return pre.toString();
    }
    public static String lcpTrick(String[] str){
        String pre = str[0];
        for(int i=1;i<str.length;i++){
            while(str[i].indexOf(pre)!=0){
                pre=pre.substring(0,(pre.length()-1));
                if(pre.isEmpty()) return "";
            }
        }
        return pre;
    }
    public static void main(String[] args){
        String[] arr = {"flower","flow","flight"};
        String[] arr1={"class","clash","classic"};
        String[] arr2 = {"dog", "racecar", "car"};
        String[] arr3 = {"Hello","Hello","Hello"};
        String s2 = lcpTrick(arr2);
        String s=lCPrefix(arr);
        String s1 = lcpTrick(arr1);
        String s3 = lcpTrick(arr3);
        System.out.println(s+"\n"+s1+"\n"+s2+"\n"+s3);
    }
}
