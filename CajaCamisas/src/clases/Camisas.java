package clases;

public enum Camisas {
	MANGACORTA(1, 190), CASUALLARGA(2, 230), FORMALLARGA(3, 310);

	private final int id;
	private final int precio;

	private Camisas(int a, int b) {
		id = a;
		precio = b;
	}

	public int getId() {
		return id;
	}

	public int getPrecio() {
		return precio;
	}
}
