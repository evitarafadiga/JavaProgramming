package capitulo008;

import java.math.*;

public class Complex {
	
	private float realPart;
	private float imaginaryPart;
	private float i;
	private float result;
	
	public void calculateComplex(float i, float realPart, float imaginaryPart) {
		result = (float) (realPart + imaginaryPart * Math.sqrt(i));
		System.out.printf("A parte real equivale a: %f%n"
				+ "A parte imaginaria equivale a: %f%n"
				+ "O resultado da equacao equivale a: %f%n",realPart,imaginaryPart,result);
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
		return String.format("%03f + %03f * sqrt(-1)%n",getRealPart(), getImaginaryPart());
	}

	public float getI() {
		return i;
	}

	public void setI(float i) {
		this.i = i;
	}
}