package Task_3;

public class Application {
	public static void main(String[] args) {

		Frog f = new Frog("Frog", 5, "CrazyFrog");
		System.out.println(f);
		f.eat();
		f.sleep();
		f.swimm();
		f.walk();
	}
}
