package capitulo008;

public class Rectangle {
	
	private int width = 1;
	private int	length = 1;
	
	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}
	
	public void rectanglePerimeter(int width, int length) {
		int per = width*2+length*2;
		
		System.out.printf("Perimetro do retangulo equivale a: %d%n",per);
		
	}

	public void rectangleArea(int width, int length) {
		int are = width * length;
		
		System.out.printf("Perimetro do retangulo equivale a: %d%n",are);
		
	}

}
