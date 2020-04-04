package Task2;

public class Koleso {

	private int rozmir;
	private String marka;

	public Koleso(int rozmir, String marka) {
		super();
		this.rozmir = rozmir;
		this.marka = marka;
	}

	public int getRozmir() {
		return rozmir;
	}

	public String getMarka() {
		return marka;
	}

	public void setRozmir(int rozmir) {
		this.rozmir = rozmir;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	@Override
	public String toString() {
		return "Koleso [rozmir=" + rozmir + ", marka=" + marka + "]";
	}

}
