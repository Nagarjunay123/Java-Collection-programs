package List;

import java.util.Stack;

public class StackProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s= new Stack();
		s.add("Advance Happy");
		s.add("Birthday");
		s.add("Om Kumar");
		s.add(22);
		s.add(23);
		s.add(null);
		s.add(5.11);
		s.add(90.0);
		s.add('F');
		s.add('F');
		System.out.println("second object is : "+s.get(2));
		System.out.println("Null object is present or not : "+s.contains(null));
		System.out.println("I'm going to removing the object:--"+s.pop());
		s.set(3,true);//modify the 3 index object
		System.out.println("After modification the Stack is : "+s);
		for (int i=s.size()-1; i>=0; i--) {
			System.out.println("I'm going to removing the object:--"+s.pop()); //fetching and removing all object
			
		}
		System.out.println("After removing all objects then final Stack is : "+s);
		s.push(2);//add one object
		System.out.println("I'm adding one object : "+s);
		s.set(0,"More 2 days");//modify the object
		
		System.out.println("I'm modify the object then result is : "+s);//print the Stack

	}

}
