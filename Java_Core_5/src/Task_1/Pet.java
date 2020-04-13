package Task_1;

public abstract class Pet {

	private String type;

	public Pet(String type) {
		super();
		this.type = type;
	}

	abstract void voice();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Pet [type=" + type + "]";
	}

}
