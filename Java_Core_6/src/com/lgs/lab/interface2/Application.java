package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Devide;
import com.lgs.lab.interface1.Minus;
import com.lgs.lab.interface1.Multiply;
import com.lgs.lab.interface1.Plus;

public class Application {

	static void Pl(Plus p) {
		p.Pl();
	}
	static void Mn(Minus m) {
		m.Mn();
	}
	static void Mult(Multiply mu) {
		mu.Mult();
	}
	static void Dev(Devide d) {
		d.Dev();
	}
	
	public static void main(String[] args) {
		
		MyCalculator MC = new MyCalculator();
		MC.Pl();
		MC.Mn();
		MC.Mult();
		MC.Dev();

	}

}
