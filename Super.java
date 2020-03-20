class Super
{
    int a=125;
}
class Program extends A
{
    int a= 20;
    void display()
    {
        System.out.println("hakuna matata");
        System.out.println(super.a);
    }
}
  class P extends Program
  {
    int a=30;
    void display()
    {
        System.out.println(a);
        System.out.println(super.a);
        super.display();
    }
  }
  class Test
  {
public static void main(String[] args)
{
 P p1 =new P();
 p1.display();
}
}
