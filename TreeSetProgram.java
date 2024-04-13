package set;

import java.util.SortedSet;
import java.util.TreeSet;

import queqe.Mobile;

public class TreeSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(90);
		ts.add(50);
		ts.add(80);
		ts.add(10);
		ts.add(30);
		ts.add(70);
		ts.add(20);
		
//		System.out.println(ts);
//		System.out.println(ts.first()); //it will fetch the first value
//		System.out.println(ts.last()); //it will fetch the last value
//		System.out.println(ts);
//		System.out.println(ts.pollFirst()); //it will fetch and remove the first value
//		System.out.println(ts.pollLast()); //it will fetch and remove the last value
//		System.out.println(ts.subSet(20, 51));//it will fetch the values from particular range
//		System.out.println(ts);
//		System.out.println(ts.tailSet(50)); //it will fetch the value from particular starting point
//		System.out.println(ts.descendingSet());
		

		SortedSet<Integer> ss=new TreeSet<Integer>();
//		ss.add(10);
//		ss.add(20);
//		ss.add(90);
//		ss.add(40);
//		ss.add(5);
//		System.out.println(ss);
//		System.out.println(ss.first());
//		System.out.println(ss.last());
//		System.out.println(ss.headSet(40));
//		System.out.println(ss.tailSet(40));
//		System.out.println(ss.subSet(10,40));
		
		
		TreeSet<Mobile> sortSet=new TreeSet<Mobile>();
		sortSet.add(new Mobile("iphone", 18000, 4));
		sortSet.add(new Mobile("mi", 16000, 6));
		sortSet.add(new Mobile("onePlus", 26000, 8));
		sortSet.add(new Mobile("poco", 19000, 16));
		System.out.println(sortSet);
	}

}
