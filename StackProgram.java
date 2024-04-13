package List;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s=new Stack();
		s.add("Nag");
		s.add(21);
		s.add('M');
		System.out.println(s);
		s.set(1,22);
		System.out.println(s);
		System.out.println(s.peek());//it will fetch the last object
		s.push("HYD");
		System.out.println(s.pop());//first it will fetch the object and then remove the object
		System.out.println(s);
		for (int i=s.size()-1;i>=0;i--)//remove all objects in a stack
		{
			System.out.println("the size of the stack is : "+s.size());
			System.out.println(s.pop());
		}
		System.out.println(s);//empty stack
		

	}

}
