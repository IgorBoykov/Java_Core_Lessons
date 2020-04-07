package Task_1;

public class Cat extends Pet {

	private int mas;

	public Cat(String type, int mas) {
		super(type);
		this.mas = mas;
	}

	public int getMas() {
		return mas;
	}

	public void setMas(int mas) {
		this.mas = mas;
	}

	@Override
	public String toString() {
		return "Cat [mas=" + mas + "]";
	}

	@Override
	void voice() {
		System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");

	}

}
