import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cliente = "", producto = "", formapago = "";
		float importe = 0, dsct = 0, cantidad = 0, precio = 0, imcremento = 0, total = 0;
		
		System.out.print("Nombre del Cliente: ");
		cliente = sc.nextLine();
		System.out.print("Nombre del Producto: ");
		producto = sc.nextLine();
		System.out.println("Cantidad: ");
		cantidad = sc.nextFloat();
		
		switch (producto){
		case "Tablet":
			precio = 350;
			break;
		case "Laptop":
			precio = 2300;
			break;
		case "Monitor":
			precio = 850;
			break;
		case "Impresora":
			precio = 680;
			break;
			default:
				precio = 0;
		}
		
		importe = precio * cantidad;
		
		System.out.print("Forma de pago: ");
		formapago = sc.nextLine();
		
		switch (formapago) {
		case "Contado":
			dsct = (float)(importe * 0.05);
			break;
		case "Credito":
			imcremento = (float)(importe * 012);
			break;
			default:
				imcremento = 0;
		}
		total = (float)((precio * cantidad) + dsct - imcremento);
		
		System.out.println("Precio: " + precio);
		System.out.println("Importe: " + importe);
		System.out.println("Descuento: " + dsct);
		System.out.println("Total a pagar: " + total);
		

	}

}
