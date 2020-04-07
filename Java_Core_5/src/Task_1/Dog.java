package Task_1;

public class Dog extends Pet {

	private int speed;

	public Dog(String type, int speed) {
		super(type);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Dog [speed=" + speed + "]";
	}

	@Override
	void voice() {
		System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");

	}

}
