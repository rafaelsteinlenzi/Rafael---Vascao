package Interface;

public class Main {

	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado("q1", 20);
		
		q1.getArea();
		
		System.out.println(q1.getArea());
		
		Circulo c1 = new Circulo ("c1", 20);

		System.out.println(c1.getArea());
		
	}

}
