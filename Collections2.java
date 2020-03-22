import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Collections2 {
	public static void main(String[] args) {     
		Collection a=new ArrayList();
		a.add(1);
		a.add(6);
		a.add(9);
		Iterator b=a.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
	}
}                                  