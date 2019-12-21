package main.java.Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1=new ArrayList<>();
		list1.add(100);
		list1.add(10);
		list1.add(210);
		list1.add(310);
		list1.add(10);
		
		System.out.println(sumIterator(list1));
		System.out.println("After Stream =============");
		System.out.println(list1.stream().filter(x->x>10).mapToInt(x->x).sum());
		
		
		
		
		
	}

	private static int sumIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		return sum;
	}
}
