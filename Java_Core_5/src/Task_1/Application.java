package Task_1;

public class Application {

	public static void main(String[] args) {

		Cow c = new Cow("Booryonka", 8);
		System.out.println(c);
		c.voice();

		Cat k = new Cat("Murchik", 5);
		System.out.println(k);
		k.voice();

		Dog d = new Dog("Sharik", 35);
		System.out.println(d);
		d.voice();
	}

}
