package Task3;

public class Application {
	public static void main(String[] args) {

		Animal a1 = new Animal("Monkey", 15, 10);
		System.out.println(a1);

		a1.setName("Tiger");
		a1.setSpeed(50);
		a1.setAge(7);
		System.out.println(a1);

	}

}