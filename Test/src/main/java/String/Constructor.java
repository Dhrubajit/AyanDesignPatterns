package main.java.String;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 5, 6, 5, 3, 2, 25, 10, 19, 11, 10 };
		int count=0;
		List<Integer> list = Arrays.asList(arr);
		

        Map<Integer, Long> result = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        Map<Integer, Long> result2 = list.stream()
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));
		
        System.out.println(result);
        System.out.println(result2);
        
        for (Map.Entry<Integer, Long> entry : result2.entrySet()) {
        	if(entry.getValue()>1) {
        		count++;
        	}
        }
        System.out.println(count);

	}

}
