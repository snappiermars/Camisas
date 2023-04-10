package test;

import clases.Operaciones;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testOperaciones {

	@Test
	void testNoDescuento() {
		Operaciones pruebaOp = new Operaciones(0,1,0);
		assertEquals(230,pruebaOp.venta());
	}
	
	@Test
	void testPrimerDescuento() {
		Operaciones pruebaOp = new Operaciones(1,1,1);
		assertEquals(693.5,pruebaOp.venta());
	}
	
	@Test
	void testSegundoDescuento() {
		Operaciones pruebaOp = new Operaciones(2,2,2);
		assertEquals(1343.2,pruebaOp.venta());
	}
	
	@Test
	void testVacio() {
		Operaciones pruebaOp = new Operaciones();
		assertEquals(0,pruebaOp.venta());
	}

}
