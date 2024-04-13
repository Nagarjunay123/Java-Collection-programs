package set;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hs=new LinkedHashSet();
		
		hs.add("friday");
		hs.add(0.10);
		hs.add(true);
		hs.add('a');
		hs.add(null);
		hs.add('a');
		System.out.println(hs);

	}

}
