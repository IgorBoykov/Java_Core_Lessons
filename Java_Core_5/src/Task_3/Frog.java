package Task_3;

public class Frog extends Amphibia {

	private String name;

	public Frog(String type, int age, String name) {
		super(type, age);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Frog [name=" + name + "]";
	}

}
