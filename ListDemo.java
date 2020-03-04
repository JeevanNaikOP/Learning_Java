import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {
	public static void main(String[] args) {
		List<Object> al = new ArrayList<Object>();
		al.add(123);
		al.add(1234567);
		al.add(4.5f);
		al.add(56.56);
		al.add("data");
		al.add(true);
		Vector<Object> al2 = new Vector<Object>();
		al2.add(23);
		al2.add(78.9);
		al.addAll(al2);
		
		Iterator<Object> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
