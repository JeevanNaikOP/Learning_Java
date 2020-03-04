import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ILIstFor {
	public static void main(String[] args) {
		List<Object> al = new ArrayList<Object>();
		al.add(123);
		al.add(1234567);
		al.add(4.5f);
		al.add(56.56);
		al.add("data");
		al.add(true);
		Vector<Number> al2 = new Vector<Number>();
		al2.add(123);
		al2.add(78.9);
		//al.addAll(al2);
		al.retainAll(al2);
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}


}
}
