import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nivel = 0;
		float caso = 0, n1 = 0, n2 = 0;
		String operacion = "";
		
		System.out.print("Primer numero: ");
		n1 = sc.nextInt();
		System.out.print("Segundo numero: ");
		n2 = sc.nextInt();
		System.out.print("Operacion[1-6]: ");
		nivel = sc.nextInt();
		
		switch (nivel){
		case 1:
			operacion = "Suma";
			caso = n1 + n2;
			break;
		case 2:
			operacion = "Resta";
			caso = n1 - n2;
			break;
		case 3:
			operacion = "Producto";
			caso = n1 * n2;
			break;
		case 4:
			operacion = "Division";
			if (n2 != 0)
				caso = n1 / n2;
			break;
		case 5:
			if (n2 != 0) {
				caso = (n1 % n2);
				operacion = "Resto Entero";
			}
			break;
		case 6:
			operacion = "Promedio";
			caso = (n1 + n2) / 2;
			break;
		default:
			caso = 0;
		}
		System.out.println("Numero 1: " + n1);
		System.out.println("Numero 2: " + n2);
		System.out.println("Operacion: " + operacion);
		System.out.println("Resultado: " + caso);

	}

}
