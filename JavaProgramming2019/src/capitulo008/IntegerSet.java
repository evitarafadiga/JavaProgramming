package capitulo008;

import java.util.Arrays;
import java.util.Iterator;

public class IntegerSet {
	
	private int integer;
	private boolean[] a = new boolean [100];
	
	public IntegerSet() {
		this.integer = integer;
		Arrays.fill(a, false);
	}
	
	public static void isTrue(boolean [] a, int integer) {
		for (int i = 0; i < a.length; i++) {
			if (i == integer)
				a[i] = true;
		}
	}
	
	public static void isFalse(boolean [] b, int integer) {
		for (int j = 0; j < b.length; j++) {
			if (j == integer)
				b[j] = false;
		}
	}
	public static boolean union(int integer, boolean[]... args) {
		
		for (boolean[] a : args) {
			if (a [integer] == true)
				return true;
		}
		return false;
	}
	
	public static boolean intersection(int integer, boolean []... args) {
		
		for (boolean[] a : args) {
			if (a [integer] == true)
				return false;
		}
		return true;
	}
	
	public void insertElement(int k, boolean[]... args) {
		
		int t = args.length + 1;
		args[t] = args[k];
		
		for (int i = k-1; i < k; i++) {
			Arrays.fill(a, true);
		}
		
	}
	
	public void deleteElement(int m, boolean[]... a) {
		
	}

}
