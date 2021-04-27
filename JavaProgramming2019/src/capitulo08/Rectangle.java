package capitulo08;

public class Rectangle {
	
	private float width;
	private float length;
	
	public void setWidth(float width) {
		if (width < 0.0 || width > 20.0) 
			throw new IllegalArgumentException("Num. fora de escopo.");
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		if (length < 0.0 || length > 20.0) 
			throw new IllegalArgumentException("Num. fora de escopo.");
		this.length = length;
	}

	public float getWidth() {
		return width;
	}
	
	public void rectanglePerimeter(float width, float length) {
		float per = width*2+length*2;
		
		System.out.printf("Perimetro do retangulo equivale a: %f%n",per);
		
	}

	public void rectangleArea(float width, float length) {
		float are = width * length;
		
		System.out.printf("Area do retangulo equivale a: %f%n",are);
		
	}

}
