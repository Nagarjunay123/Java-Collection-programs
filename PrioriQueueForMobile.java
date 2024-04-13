package queqe;

import java.util.PriorityQueue;

public class PrioriQueueForMobile {

	public static void main(String[] args) {

		PriorityQueue<Mobile> mobiles=new PriorityQueue<Mobile>();
		mobiles.add(new Mobile("iPhone", 10000, 8));
		mobiles.add(new Mobile("mi", 18000, 4));
		mobiles.add(new Mobile("samsung", 20000, 2));
		mobiles.add(new Mobile("vivo", 15000, 8));
		mobiles.add(new Mobile("poco", 19000, 4));
		
		System.out.println(mobiles);
	}

}
