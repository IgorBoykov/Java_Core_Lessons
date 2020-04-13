package Task_2;

public class Overload {

	private int a;
	private int b;

	public Overload(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	Overload() {
		this(5, 6);
	}

	@Override
	public String toString() {
		return "Overload [a=" + a + ", b=" + b + "]";
	}

}
