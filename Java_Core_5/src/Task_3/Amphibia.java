package Task_3;

public class Amphibia {

	private String type;
	private int age;

	public Amphibia(String type, int age) {
		super();
		this.type = type;
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Amphibia [type=" + type + ", age=" + age + "]";
	}

	public void eat() {
		System.out.println("The frog is eating");
	}

	public void sleep() {
		System.out.println("The frog is sleeping");
	}

	public void swimm() {
		System.out.println("The frog is swimming");
	}

	public void walk() {
		System.out.println("The frog is walking");
	}
}
