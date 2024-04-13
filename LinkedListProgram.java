package List;

import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("abc");
		l.add(true);
		l.add(20);
		l.add(null);
		l.add(20);
		l.add('a');
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.poll());
		System.out.println(l);
		l.remove();
		System.out.println(l);

	}

}
