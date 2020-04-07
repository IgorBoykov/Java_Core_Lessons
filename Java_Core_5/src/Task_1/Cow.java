package Task_1;

public class Cow extends Pet {

	private int age;

	public Cow(String type, int age) {
		super(type);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cow [age -" + age + "]";
	}

	@Override
	void voice() {
		System.out.println("ß êîğîâà- Ìóóó-Ìóóó");
	}

}
