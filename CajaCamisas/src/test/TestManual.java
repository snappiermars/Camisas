package test;

import clases.Camisas;

public class TestManual {

	public static void main(String[] args) {
		for (Camisas camisa : Camisas.values()) {
			System.out.printf("%s\t%d\t%d\n", camisa, camisa.getId(), camisa.getPrecio());
			System.out.println("---------------------");
		}

	}

}
