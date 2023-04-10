package principal;
import clases.Operaciones;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("¡BIENVENIDO!");
		System.out.print("¿Cuantas camisas de manga corta desea comprar? Si no quiere comprar este modelo escriba 0\nColoque el numero que desea por favor: ");
		int cortas = teclado.nextInt();
		System.out.print("\n¿Cuantas camisas casuales de manga larga desea comprar? Si no quiere comprar este modelo escriba 0\nColoque el numero que desea por favor: ");
		int casual = teclado.nextInt();
		System.out.print("\n¿Cuantas camisas formales de manga larga desea comprar? Si no quiere comprar este modelo escriba 0\nColoque el numero que desea por favor: ");
		int formal = teclado.nextInt();
		Operaciones operacion = new Operaciones(cortas,casual,formal);
		System.out.print("\nEl total de su compra es el siguiente: ");
		System.out.print(operacion.venta());
		
		
	}

}
