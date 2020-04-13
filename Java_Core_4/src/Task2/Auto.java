package Task2;

public class Auto {

	private String name;
	private Kermo kermo;
	private Koleso koleso;
	private Kuzov kuzov;

	public Auto(String name, Kermo kermo, Koleso koleso, Kuzov kuzov) {
		super();
		this.name = name;
		this.kermo = kermo;
		this.koleso = koleso;
		this.kuzov = kuzov;
	}

	public String getName() {
		return name;
	}

	public Kermo getKermo() {
		return kermo;
	}

	public Koleso getKoleso() {
		return koleso;
	}

	public Kuzov getKuzov() {
		return kuzov;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKermo(Kermo kermo) {
		this.kermo = kermo;
	}

	public void setKoleso(Koleso koleso) {
		this.koleso = koleso;
	}

	public void setKuzov(Kuzov kuzov) {
		this.kuzov = kuzov;
	}

	@Override
	public String toString() {
		return "Auto -" + name + "," + kermo + "," + koleso + "," + kuzov + "";
	}

}
