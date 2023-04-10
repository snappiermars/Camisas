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

	public double venta() {
		Camisas corta = Camisas.MANGACORTA;
		Camisas casual = Camisas.CASUALLARGA;
		Camisas formal = Camisas.FORMALLARGA;
		this.numTotal = this.numCortas + this.numCasual + this.numFormal;
		double descuento = 0;

		if (3 <= this.numTotal && this.numTotal <= 5) {
			descuento = ((this.numCortas * corta.getPrecio()) + (this.numCasual * casual.getPrecio())
					+ (this.numFormal * formal.getPrecio())) * 0.05;

		} else if (this.numTotal > 5) {
			descuento = ((this.numCortas * corta.getPrecio()) + (this.numCasual * casual.getPrecio())
					+ (this.numFormal * formal.getPrecio())) * 0.08;

		}

		return ((this.numCortas * corta.getPrecio()) + (this.numCasual * casual.getPrecio())
				+ (this.numFormal * formal.getPrecio())) - descuento;
	}

}
