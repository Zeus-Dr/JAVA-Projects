import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names=new LinkedList<String>();
		names.add("Mwesigye");
		names.add("Joseph");
		names.add("Zeus");
		System.out.println("Queue: "+names.remove());

		LinkedList<String> surnames=new LinkedList<String>();
		surnames.push("Mwesigye");
		surnames.push("Joseph");
		surnames.push("Zeus");
		System.out.println("Stack:"+surnames.pop());
		System.out.println("Stack:"+surnames.pop());
		System.out.println("Stack:"+surnames.pop());
	}

}
