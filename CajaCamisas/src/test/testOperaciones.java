package test;

import clases.Operaciones;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testOperaciones {

	@Test
	void test() {
		Operaciones pruebaOp = new Operaciones(1,1,1);
		assertEquals(730,pruebaOp.venta());
	}

}
