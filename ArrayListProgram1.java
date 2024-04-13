package List;

import java.util.ArrayList;
import java.util.Collections;

import queqe.Mobile;

public class ArrayListProgram1 {

	public static void main(String[] args) {
		
		ArrayList<Mobile> arrayList=new ArrayList<Mobile>();
		arrayList.add(new Mobile("iphone", 120000, 8));
		arrayList.add(new Mobile("mi", 15000, 6));
		arrayList.add(new Mobile("samsung", 210000, 4));
		arrayList.add(new Mobile("oneplus", 25000, 8));
		System.out.println(arrayList);
//		Collections.sort(arrayList);
		System.out.println(arrayList);

}
}
