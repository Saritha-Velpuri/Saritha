class This
{
   public static void main(String[] args)
    {
     A obj=new A(2);
     obj.show();
     
    }
}
class A
{
  private int x;
public A(int x)
{
    this.x=x;
 
}
public void show()
{
System.out.println(x);
}
}