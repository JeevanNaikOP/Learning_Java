import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		//LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		//TreeSet<Integer> hs=new TreeSet<Integer>();
		hm.put(23,"tree");
		hm.put(56,"Jeevan");
		hm.put(121,"Naik");
		hm.put(99,"NGIN");
//		for(Integer i:hm.Keyset())
//		{
//			System.out.println(i+"\t"+hm.get(i));
//		}
		Set se=hm.entrySet();
		Iterator itr=se.iterator();
		while(itr.hasNext())
		{
//			Map.Entry m=(Map.Entry)itr.next();
//			System.out.println(m.getKey()+""+m.getValue());
//			
				System.out.println(itr.next());
			}
		// TODO 


}
}
