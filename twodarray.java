import java.util.*;

public class twodarray {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();
        System.out.println("Enter key value: ");
        int k = sc.nextInt();
        int rn=0;
        int cn=0;
        boolean found = false;

        int[][] arr = new int[r][c];

        for (int i = 0 ; i < r ; i++){
            System.out.println("Entering  value at row no " + i + ": ");
            for (int j = 0 ; j < c ; j++){
                System.out.println("Entering value column no " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0 ; i < r ; i++){
            for (int j = 0 ; j < c ; j++){
//                System.out.print(arr[i][j] + " ");
                if (arr[i][j]==k){
                    rn = i;
                    cn = j;
                    found=true;
                    break;
                }
            }
            if(found) break;
//            System.out.println();
        }
        if (found){
            System.out.print("Key found at row: "+rn+" column: "+cn);
        }else System.out.print("Key not found! ");
    }
}