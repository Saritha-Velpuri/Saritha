class StaticBlock
{
    static String s=" ";
    static
    {
        s="Hello Everyone";
    }
public static void main(String[] args)
{
 System.out.println("The value for s :" +s);
}
}