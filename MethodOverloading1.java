import java.util.Scanner;
class MethodOverloading1
{
    public void add(int x)
    {
        System.out.println(x);
    }
    public void add(int x,float y)
    {
        System.out.println("addition is:"+(x+y));
    }
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   float y=sc.nextFloat();
Program p=new Program();
     p.add(x,y);
    }
}