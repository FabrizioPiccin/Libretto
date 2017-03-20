package it.polito.tdp.model;

import java.time.LocalDate;

public class TestEsame {

	public static void main(String[] args) {

		Esame tdp = new Esame("03FYZ", "Tecniche di programmazione", "Fulvio Corno");
		System.out.println(tdp);
		Esame ami = new Esame("01QZP", "Ambient Intelligence", "Fulvio Corno");
		System.out.println(ami);
		
		tdp.supera(24, LocalDate.now());
		System.out.println(tdp);

		
	}

}
