package Day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OddNum {

	public static void main(String[] args) {
		int [] inputArray = {1,2,3,4,5,4,3,4,5,3,15,15,14,333,233,333,44,44,555,333};
		
		Map<Integer, Integer> memory = new HashMap<Integer, Integer>();
		
		for (int i : inputArray) {
			memory.putIfAbsent(i, 0);
			memory.put(i,memory.get(i) + 1);
		}
		
		Set<Integer> keys = memory.keySet();
		
		for (Integer key : keys) {
			if (memory.get(key) % 2 == 1) {
				System.out.print(key + " ");
			}
			
		}
	}

}
