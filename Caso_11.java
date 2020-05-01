import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		String dia = "";
		
		System.out.print("Ingrese numero [1-7]: ");
		numero = sc.nextInt();
		
		switch (numero){
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Lunes";
			break;
		case 3:
			dia = "Martes";
			break;
		case 4:
			dia = "Miercoles";
			break;
		case 5:
			dia = "Jueves";
			break;
		case 6:
			dia = "Viernes";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Desconocido";
		}
		System.out.println("Nombre del Dia: " + dia);
	}

}
