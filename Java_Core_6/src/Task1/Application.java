package Task1;

public class Application {

	public static void main(String[] args) {

		Worker1 w1 = new Worker1("Igor", 10000);
		w1.Wages();
		System.out.println(w1);

		Worker2 w2 = new Worker2("Nataliya", 15000);
				w2.Wages();
				System.out.println(w2);
	}

}
