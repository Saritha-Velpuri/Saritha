public class ExcepHandling {
	public static void main(String[] args) {
		try {
		int a[]=null;
		a[2]=8;
		System.out.println(100/4);       
		}
		catch(ArithmeticException e) {
			System.out.println("hakuna");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("matata");
		}
		catch(Exception e) {
			System.out.println("you will get);
		}
		finally {
			System.out.println("what you deserves ");
		}
	}                                 
}
