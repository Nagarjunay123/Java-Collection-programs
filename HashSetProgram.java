package set;

import java.util.Collections;
import java.util.HashSet;
import queqe.Mobile;

public class HashSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Mobile> hashset=new HashSet<Mobile>();
		hashset.add(new Mobile("iphone", 120000, 8));
		hashset.add(new Mobile("mi", 15000, 6));
		hashset.add(new Mobile("samsung", 210000, 4));
		hashset.add(new Mobile("oneplus", 25000, 8));
		System.out.println(hashset);
	}

}
