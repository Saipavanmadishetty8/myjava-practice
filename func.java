public class func {
    static boolean isEven(int n)
    {
        return (n%2==0);
    }
    public static void main(String args[])
    {
        int n=15;
        if (isEven(n))
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    
}
