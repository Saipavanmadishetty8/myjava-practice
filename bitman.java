import java.util.*;

public class bitman {
    public static int setByte(int y,int x){
        int bitMask = 1 << x;

        int newy = y | bitMask;
        return newy;
    }
    public static int clearByte(int y,int x){
        int bitMask = 1 << x;

        int newy = y & (~bitMask);
        return newy;
    }
    public static int tooglrBit(int y , int x){
        return y^(1<<x);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Enter bit position: ");
        int p = sc.nextInt();
        System.out.println("Enter (1/0) to change bit of " + num + " at position " + p);
        int c = sc.nextInt();
        if (c==1){
            System.out.println(setByte(num,p));
        } else if (c==0) {
            System.out.println(clearByte(num,p));

        }else System.out.println("Invalid input!");
        System.out.println(tooglrBit(num, p));


    }

    }

