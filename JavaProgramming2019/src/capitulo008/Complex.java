package capitulo008;

import java.math.*;

public class Complex {
	
	private float realPart;
	private float imaginaryPart;
	private float i = -1f;
	
	public void calculateComplex(float i, float realPart, float imaginaryPart) {
		double result = realPart + imaginaryPart * (Math.sqrt(i));	
		System.out.printf("O resultado da equacao equivale a: %d%n"
				+ "A parte real equivale a: %d%n"
				+ "A parte imaginaria equivale a: %d%n",result,realPart,imaginaryPart);
	}
	
	public static double sumReal(float... realPart) {
		double sum = 0;

		for ( double numbers : realPart) {
			sum+= numbers;
		}
		return sum;
		
	}
	
	public static double sumImaginary( float... imaginaryPart) {
		double sum = 0;

		for ( double numbers : imaginaryPart) {
			sum+= numbers;
		}
		return sum;
		
	}
	
	public Complex () {
		this(0,0);
	}
	
	public Complex (float realPart, float imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public float getRealPart() {
		return realPart;
	}

	public void setRealPart(float realPart) {
		this.realPart = realPart;
	}

	public float getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(float imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	public String toString() {
		return String.format("%03f + %03f * sqrt-1%n",getRealPart(), getImaginaryPart());
	}
}