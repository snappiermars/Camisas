package clases;


public class Operaciones {
	private int numCortas;
	private int numCasual;
	private int numFormal;
	private int numTotal;

	public Operaciones() {
		this.numCortas = 0;
		this.numCasual = 0;
		this.numFormal = 0;
	}

	public Operaciones(int corta, int casual, int formal) {
		this.numCortas = corta;
		this.numCasual = casual;
		this.numFormal = formal;
	}

	public int venta() {
		Camisas corta = Camisas.MANGACORTA;
		Camisas casual = Camisas.CASUALLARGA;
		Camisas formal = Camisas.FORMALLARGA;
		int precioFinal = (this.numCortas * corta.getPrecio()) + (this.numCasual * casual.getPrecio())
				+ (this.numFormal * formal.getPrecio());

		return precioFinal;
	}

}
