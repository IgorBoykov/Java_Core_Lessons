package Task1;

public class Worker1 implements Wage{

	private String name;
	private int wageOfW1;
	

	public Worker1(String name, int wageOfW1) {
		super();
		this.name = name;
		this.wageOfW1 = wageOfW1;
	}


	@Override
	public void Wages() {
	int wage = getWageOfW1()+2500;
	setWageOfW1(wage);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWageOfW1() {
		return wageOfW1;
	}


	public void setWageOfW1(int wageOfW1) {
		this.wageOfW1 = wageOfW1;
	}


	@Override
	public String toString() {
		return "Worker1 [name=" + name + ", wageOfW1=" + wageOfW1 + "]";
	}
	
	
}
