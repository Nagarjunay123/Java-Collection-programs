package List;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add("Nag");
		a1.add(20);
		a1.add(50);
		a1.add('A');
		a1.add(null);
		a1.add('A');
		
		System.out.println(a1);
		System.out.println(a1.get(2));
		System.out.println("The size of the arrayLisst is : "+a1.size());
		System.out.println(a1.contains("Nag"));
		a1.set(1,"Age");
		System.out.println(a1);
		a1.add(2,23);
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		
		if(!(a1.isEmpty()))
		{
			a1.clear();
		}
		System.out.println(a1);

	}

}
