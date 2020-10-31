package capitulo008;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		System.out.printf("Depois de chamado o metodo, obtem-se: %n");
		
		rect1.setLength(12.0f);
		rect1.setWidth(14.0f);
		
		rect1.rectanglePerimeter(14.0f, 12.0f);
		rect1.rectangleArea(14.0f, 12.0f);
		
		System.out.printf("Teste com throw: %n");
		
		
		rect2.rectangleArea(22f,-12f);
		rect2.rectanglePerimeter(22f, -12f);
		rect2.setLength(-12f);
		rect2.setWidth(22f);
		
		
	}

}
