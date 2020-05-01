import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float dsct, precio = 0, cantidad = 0, total, neto;
		System.out.print("Ingrese un precio: ");
		precio = sc.nextFloat();
		System.out.print("Ingrese una cantidad: ");
		cantidad = sc.nextFloat();
		
		total = precio * cantidad;
		
		if (cantidad > 8)
			dsct = (float)(total * 0.1);
		else 
			dsct = 0;
		neto = total - dsct;
		System.out.println("Total: " + total);
		System.out.println("Descuento: " + dsct);
		System.out.println("Neto: " + neto);
			
		
		

	}

}
