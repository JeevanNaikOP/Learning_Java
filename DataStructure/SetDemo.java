import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDEmo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//HashSet<Integer> hs=new HashSet<Integer>();
		//LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		TreeSet<Integer> hs=new TreeSet<Integer>();
		hs.add(23);
		hs.add(56);
		hs.add(121);
		hs.add(99);
		Iterator<Integer> itr=hs.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		// TODO Auto-generated method stub

	}

}
