import java.util.Iterator;
import java.util.LinkedList;


public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> surnames=new LinkedList<String>();
		surnames.push("Mwesigye");
		surnames.push("Joseph");
		surnames.push("Zeus");
		Iterator<String> it= surnames.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		for (String s: surnames) {
			System.out.println(s);
		}
	}

}
