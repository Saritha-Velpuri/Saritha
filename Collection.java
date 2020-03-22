import java.util.*;
public class Collection {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();      
		a.add(36);
		a.add(9);
		a.add(786);
		//a.add("hello");
		a.add(2,23);
		Collections.sort(a);
		//Collections.reverse(a);
		for(Object o:a) {
			System.out.println(o);
		}
	}
}                                     