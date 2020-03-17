import java.util.Scanner;
class Swapping 
{
    public static void main(String args[])
    {
        int m, n;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        System.out.print(" first number:"+m);
        n = s.nextInt();
        System.out.print(" second number:"+n);
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("After Swapping");
        System.out.println("First number:"+m);
        System.out.println("Second number:"+n);
    }
}