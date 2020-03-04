import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SortSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		//LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		//TreeSet<Integer> hs=new TreeSet<Integer>();
		hs.add(23);
		hs.add(56);
		hs.add(121);
		hs.add(99);
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		Collections.sort(al);
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}




}
}
