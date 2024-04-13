package queqe;

import java.util.ArrayDeque;

public class DequeeProgram {

	public static void main(String[] args) {
	
		ArrayDeque<Integer> adq=new ArrayDeque<Integer>();
		adq.add(10);
		adq.add(90);
		adq.add(70);
		adq.add(80);
		System.out.println(adq);
		
		adq.addFirst(200);
		adq.addLast(400);
		System.out.println(adq);
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		System.out.println(adq);
	}

}
