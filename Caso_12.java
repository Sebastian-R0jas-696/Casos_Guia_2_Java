import java.util.Scanner;
//Creado por Sebastian Rojas
public class Caso_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String empleado ="";
		float sueldo = 0, imcremento, Nincremento;
		int nivel = 0;
		
		System.out.print("Nombre del empleado: ");
		empleado = sc.nextLine();
		System.out.print("Nivel [1-4]: ");
		nivel = sc.nextInt();
		System.out.print("Sueldo: ");
		sueldo = sc.nextFloat();
		
		
		switch (nivel){
		case 1:
			imcremento = (float)(0.045);
			break;
		case 2:
			imcremento = (float)(0.06);
			break;
		case 3:
			imcremento = (float)(0.085);
			break;
		case 4:
			imcremento = (float)(0.11);
			break;
		default:
			imcremento = 0;
		}
		Nincremento = sueldo + (sueldo * imcremento);
		System.out.println("Imcremento: " + (imcremento * 100)+ "%");
		System.out.println("Nuevo sueldo: " + Nincremento);
	}

}
