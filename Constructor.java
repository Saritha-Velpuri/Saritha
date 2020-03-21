class Constructor
{
    public static void main(String[] args)
        {
            A obj=new A(3,6.1);
        }  
}
class A
{
    public A()
    {
        System.out.println("constructor");
    }
    public A(int i)
    {
        System.out.println("constructor int");
    }
    public A(int i,double d)
    {
        System.out.println("constructor int double");
    }
}

