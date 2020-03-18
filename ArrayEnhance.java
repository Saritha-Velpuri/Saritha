import java.util.Random;
class ArrayEnhance
{
	public static void main(String[] args) {
	    int[] n = new int[10];
	    Random r = new Random();
	    for(int i=0;i<10;i++)
	    {
	        n[i] = r.nextInt(30);
	    }
	    for(int a : n)
	    {
	        System.out.println(a);
	    }
		
	}
}