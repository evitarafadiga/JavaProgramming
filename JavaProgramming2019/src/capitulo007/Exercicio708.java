package capitulo007;

import java.security.SecureRandom;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Exercicio708 {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 6;
		final int ARRAY_CENT = 100;
		float total = 0;
		
		int[] f = new int[ARRAY_SIZE];
		displayArray(f,"Array f");
		
		double g[] = new double[ARRAY_SIZE];
		
		for (int i = 0; i < g.length; i++) {
			g[i] = 8;
		}
		
		float c[] = new float[ARRAY_CENT];
		
		for (int j = 0; j < c.length; j++) {
			total += c[j];
		}
		
		int[] a = new int[10];
		for (int k = 0; k < a.length; k++) {
			a[k] = 9;
		}
		final int ARRAY_B = 34;
		int b[] = new int [ARRAY_B];
		
		System.arraycopy(a, 0, b, 0, a.length);
		displayArray(a,"Array a");
		displayArray(b,"Array b");
		
		SecureRandom rand = new SecureRandom();
		
		float w[] = new float[98];
		
		for (int l = 0; l < w.length; l++) {
			w[l] = rand.nextFloat();
		}
		Arrays.sort(w);
		displayFloat(w,"Array w");
	}
	
	public static void displayArray(int[] array, String description) {
		System.out.printf("%n%s: ", description);
		for (int value : array)
			System.out.printf("%d ", value);
	
	}
	
	public static void displayFloat(float[] array, String description) {
		
		System.out.printf("%n%s: ", description);
		for (float value : array)
			System.out.printf("%f ", value);	
	}

}
