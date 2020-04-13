package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{

	@Override
	public void Pl() {
	System.out.println("Додає числа");
		
	}

	@Override
	public void Mn() {
		System.out.println("Віднімає числа");
		
	}

	@Override
	public void Mult() {
		System.out.println("Множить числа");
		
	}

	@Override
	public void Dev() {
		System.out.println("Ділить числа");
		
	}


	
	

}
