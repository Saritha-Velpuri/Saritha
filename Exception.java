import java.util.Random;
class Exception
{
	public static void main(String[] args) 
	{
	Random r= new Random();
	int a[]= new int[10];
	for(int i=0;i<a.length;i++)
	{
	    a[i]=r.nextInt(30);
	}
	try
	{
	    System.out.println(a[16]);
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
	    System.out.println("maximum index value is 29" );
	}
	}
	
}