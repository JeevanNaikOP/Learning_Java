import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class SortList {
	public static void main(String[] args) {
		List<Float> al = new ArrayList<Float>();
		al.add(123.0f);
		al.add(1234.567f);
		al.add(4.5f);
		al.add(56.56f);
		Collections.sort(al);
		Iterator<Float> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}




}
}
