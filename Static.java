class Static
{
    static int a=5,b=4,c;
    static void add()
    {
         c=a+b;
         System.out.println("sum is:" +c);
       
    }
    void mul()
    {
        c=a*b;
        System.out.println("mul is:"+c);
    }
 
public static void main(String[] args)
{
 Program p=new Program();
   add();
   p.mul();
}
}
