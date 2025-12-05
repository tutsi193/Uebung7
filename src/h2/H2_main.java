package h2;

import java.util.Arrays;

public class H2_main {
	public static void main(String[] args) {
		int[] a = {2,7,1,9};
		int[] b = {2,7,1,9};
		int start = 3;
		int end = 2;
		
		int[] result = change(a, b, start, end);
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] change(int[] a, int[] b, int start, int end) {
		if(end <= start) {
			return new int[0];
		}
		boolean gleich = Arrays.compare(a, b) == 0;
		if (gleich == false && end > start) {
			return Arrays.copyOf(a, a.length);
		}
		Arrays.sort(a);
		return Arrays.copyOfRange(a, start, end);


	}
}

		