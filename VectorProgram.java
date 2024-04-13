package List;

import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		
		v.add("Nagarjuna");
		v.add(21);
		v.add('M');
		v.add(5.2);
		v.add("CKK");
		v.add(null);
		v.add(null);
		
		System.out.println(v);//fetching all objects
		System.out.println("CKK object is present : "+v.contains("CKK"));//checking/searching the object
		System.out.println(v.get(2));//to fetch particular index object
		v.set(0,"Y.NAGARJUNA");//updating the object
		System.out.println(v);
		v.add(5,true);//adding object at particular index
		System.out.println(v);
		v.remove(6);//remove the object at particular index
		System.out.println(v);
		v.remove(null);//remove the object by selecting object
		System.out.println(v);
		v.clear();//it clear the collection/remove all objects
		System.out.println(v);
		System.out.println(v.size());
		
		
		
		
		
		
		

	}

}
