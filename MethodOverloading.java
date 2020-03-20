import java.util.Scanner;
class MethodOverloading
{
    public void add(int x)
    {
        System.out.println(x);
    }
    public void add(int x,int y)
    {
        System.out.println("addition is:"+(x+y));
    }
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
    Program p=new Program();
    p.add(x,y);
    }
}