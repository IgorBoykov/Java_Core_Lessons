package Task1;

public class Worker2 implements Wage{
	private String name;
	private int wageOfW2;
	
	public Worker2(String name, int wageOfW2) {
		super();
		this.name = name;
		this.wageOfW2 = wageOfW2;
	}

	@Override
	public void Wages() {
	int wage = getWageOfW2()+1000;
	setWageOfW2(wage);
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWageOfW2() {
		return wageOfW2;
	}


	public void setWageOfW2(int wageOfW2) {
		this.wageOfW2 = wageOfW2;
	}


	@Override
	public String toString() {
		return "Worker2 [name=" + name + ", wageOfW2=" + wageOfW2 + "]";
	}

}
