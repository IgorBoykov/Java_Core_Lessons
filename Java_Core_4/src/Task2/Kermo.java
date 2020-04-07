package Task2;

public class Kermo {

	private int diametr;
	private String color;

	public Kermo(int diametr, String color) {
		super();
		this.diametr = diametr;
		this.color = color;
	}

	public int getDiametr() {
		return diametr;
	}

	public String getColor() {
		return color;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Kermo [diametr=" + diametr + ", color=" + color + "]";
	}

}
