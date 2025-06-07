package PersonalTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FreqOfCharUsingMap {
	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		list.addAll(Arrays.asList('S', 'A', 'T', 'Y', 'A', 'S', 'A', 'I', 'K', 'I', 'R', 'A', 'N'));
		
		int[] arr = new int[256];
		for (char c : list) {
			int num = c;
			arr[num]++;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch: list) {
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count+1);
			} else {
				map.put(ch, 1);
			}
		}
		for(Character key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}
	}
}
