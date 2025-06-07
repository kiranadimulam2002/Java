package PersonalTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FrequencyOfCharacters {
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.addAll(Arrays.asList('S', 'A', 'T', 'Y', 'A', 'S', 'A', 'I', 'K', 'I', 'R', 'A', 'N'));
		
		int[] arr = new int[256];
		for (char c : list) {
			int num = c;
			arr[num]++;
		}
		
		int index = 0;
		for (int value : arr) {
		    if (value != 0) {
		        System.out.println((char)index + " = " + value);
		    }
		    index++;
		}

		
	}
}
