package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArray {

	public static void main(String[] args) {

		 Integer [] i= {1,3,5,2,4};
		List<Integer> ls=Arrays.asList(i);
//		List<Integer> ls=Arrays.asList(1,3,5,2,4);
		Collections.sort(ls);
		ls.forEach((n)->{
			System.out.println(n);
		});
	}

}
